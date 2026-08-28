package service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AiSugestaoService {
    
    private static final String API_KEY = System.getenv("GEMINI_API_KEY");
    private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent";
    
    // Método para gerar sugestão de economia usando Google Gemini
    public static String gerarSugestao(String dadosAmbiente) {
        // Verificar se a chave da API está configurada
        if (API_KEY == null || API_KEY.isEmpty()) {
            return "⚠️ Chave da API Gemini não configurada. Defina a variável de ambiente GEMINI_API_KEY.";
        }
        
        try {
            // Montar o prompt
            String prompt = "Como especialista em eficiência energética, sugira uma ideia prática e específica de economia de energia para: " + dadosAmbiente + ". Responda em português, de forma concisa (máximo 100 palavras).";
            
            // Montar o corpo da requisição JSON
            String jsonBody = "{ \"contents\": [ { \"parts\": [ { \"text\": \"" + 
                prompt.replace("\"", "\\\"") + "\" } ] } ] }";
            
            // Criar cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            
            // Montar URL com a chave da API
            String urlComChave = API_URL + "?key=" + API_KEY;
            
            // Criar requisição POST
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlComChave))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();
            
            // Enviar requisição
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            // Verificar resposta
            if (response.statusCode() == 200) {
                String resposta = response.body();
                // Extrair o texto da resposta JSON
                return extrairTextoResposta(resposta);
            } else {
                return "⚠️ Erro na API: " + response.statusCode() + " - " + response.body();
            }
            
        } catch (IOException e) {
            return "⚠️ Erro de conexão: " + e.getMessage();
        } catch (InterruptedException e) {
            return "⚠️ Requisição interrompida";
        } catch (Exception e) {
            return "⚠️ Erro ao gerar sugestão: " + e.getMessage();
        }
    }
    
    // Método auxiliar para extrair o texto da resposta JSON
    private static String extrairTextoResposta(String json) {
        try {
            // Buscar o campo "text" na resposta JSON
            int inicio = json.indexOf("\"text\": \"");
            if (inicio != -1) {
                inicio = inicio + 9; // Pular "text": "
                int fim = json.indexOf("\"", inicio);
                if (fim != -1) {
                    return json.substring(inicio, fim);
                }
            }
            return "⚠️ Não foi possível extrair a sugestão da resposta.";
        } catch (Exception e) {
            return "⚠️ Erro ao processar resposta da IA.";
        }
    }
    
    // Método para verificar se a API está configurada
    public static boolean isApiConfigurada() {
        return API_KEY != null && !API_KEY.isEmpty();
    }
}
