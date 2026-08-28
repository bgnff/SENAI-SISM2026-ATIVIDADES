package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.io.File;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Ambiente;
import model.Equipamento;
import service.AiSugestaoService;

public class IdeiasController {
    
    @FXML
    private ComboBox<String> comboAmbiente;
    
    @FXML
    private TextArea txtSugestao;
    
    @FXML
    private Label lblStatus;
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        atualizarComboAmbientes();
    }
    
    // Método para atualizar o combo de ambientes
    private void atualizarComboAmbientes() {
        java.util.List<String> nomesAmbientes = new java.util.ArrayList<>();
        for (int i = 0; i < DashboardController.listaAmbientes.size(); i++) {
            nomesAmbientes.add(DashboardController.listaAmbientes.get(i).nome);
        }
        comboAmbiente.setItems(FXCollections.observableArrayList(nomesAmbientes));
    }
    
    @FXML
    public void gerarIdeia() {
        String ambiente = comboAmbiente.getValue();
        
        if (ambiente == null) {
            mostrarAlerta("Erro", "Selecione um ambiente primeiro!");
            return;
        }
        
        // Verificar se a API está configurada
        if (!AiSugestaoService.isApiConfigurada()) {
            txtSugestao.setText("⚠️ A API Gemini não está configurada.\n\nPara usar esta funcionalidade:\n1. Acesse https://aistudio.google.com\n2. Crie uma API Key gratuita\n3. Defina a variável de ambiente GEMINI_API_KEY\n\nNo Windows: set GEMINI_API_KEY=sua_chave_aqui\nNo Linux/Mac: export GEMINI_API_KEY=sua_chave_aqui");
            lblStatus.setText("API não configurada");
            return;
        }
        
        // Encontrar o ambiente selecionado
        Ambiente ambienteSelecionado = null;
        for (int i = 0; i < DashboardController.listaAmbientes.size(); i++) {
            if (DashboardController.listaAmbientes.get(i).nome.equals(ambiente)) {
                ambienteSelecionado = DashboardController.listaAmbientes.get(i);
                break;
            }
        }
        
        if (ambienteSelecionado == null) {
            mostrarAlerta("Erro", "Ambiente não encontrado!");
            return;
        }
        
        // Montar dados dos equipamentos do ambiente
        StringBuilder dadosAmbiente = new StringBuilder();
        dadosAmbiente.append("Ambiente: ").append(ambienteSelecionado.nome);
        
        if (!ambienteSelecionado.descricao.isEmpty()) {
            dadosAmbiente.append(" (").append(ambienteSelecionado.descricao).append(")");
        }
        
        dadosAmbiente.append(". Equipamentos: ");
        
        boolean temEquipamentos = false;
        for (int i = 0; i < DashboardController.listaEquipamentos.size(); i++) {
            Equipamento eq = DashboardController.listaEquipamentos.get(i);
            if (eq.ambienteId.equals(ambienteSelecionado.id)) {
                if (temEquipamentos) {
                    dadosAmbiente.append(", ");
                }
                dadosAmbiente.append(eq.quantidade).append(" ").append(eq.tipo)
                    .append(" (").append(eq.potencia).append("W, ").append(eq.horasUso).append("h/dia)");
                temEquipamentos = true;
            }
        }
        
        if (!temEquipamentos) {
            dadosAmbiente.append("nenhum equipamento cadastrado");
        }
        
        // Mostrar status de carregamento
        lblStatus.setText("🤖 Gerando sugestão com IA...");
        txtSugestao.setText("Aguardando resposta da IA...");
        
        // Gerar sugestão em thread separada para não travar a UI
        new Thread(() -> {
            String sugestao = AiSugestaoService.gerarSugestao(dadosAmbiente.toString());
            
            // Atualizar UI na thread do JavaFX
            javafx.application.Platform.runLater(() -> {
                txtSugestao.setText(sugestao);
                lblStatus.setText("Sugestão gerada com sucesso!");
            });
        }).start();
    }
    
    @FXML
    public void limpar() {
        txtSugestao.setText("");
        lblStatus.setText("Aguardando geração...");
        comboAmbiente.setValue(null);
    }
    
    public void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
    
    @FXML
    public void irParaDashboard() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Dashboard.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = txtSugestao.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaAmbientes() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Ambientes.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = txtSugestao.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaEquipamentos() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Equipamentos.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = txtSugestao.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaCadastro() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Cadastro.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = txtSugestao.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaRelatorios() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Relatorio.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = txtSugestao.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaSimulacao() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Simulacao.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = txtSugestao.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaIdeias() {
        // Já está na tela de ideias
    }
    
    @FXML
    public void sair() {
        javafx.stage.Stage stage = (javafx.stage.Stage) txtSugestao.getScene().getWindow();
        stage.close();
    }
}
