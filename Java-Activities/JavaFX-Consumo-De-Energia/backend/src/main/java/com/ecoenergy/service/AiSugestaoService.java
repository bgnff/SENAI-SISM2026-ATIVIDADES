package com.ecoenergy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AiSugestaoService {

    private final ChatClient chatClient;

    public String gerarSugestao(String dadosAmbiente) {
        String prompt = "Como especialista em eficiência energética, sugira uma ideia prática e específica de economia de energia para: " 
                + dadosAmbiente 
                + ". Responda em português, de forma concisa (máximo 100 palavras). Foque em ações que possam ser implementadas imediatamente.";

        try {
            return chatClient.prompt()
                    .user(prompt)
                    .call()
                    .content();
        } catch (Exception e) {
            return "⚠️ Erro ao gerar sugestão: " + e.getMessage() + ". Verifique se a API KEY está configurada.";
        }
    }

    public boolean isApiConfigurada() {
        try {
            String teste = chatClient.prompt()
                    .user("Responda apenas com: OK")
                    .call()
                    .content();
            return "OK".equals(teste);
        } catch (Exception e) {
            return false;
        }
    }
}
