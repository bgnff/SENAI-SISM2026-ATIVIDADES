package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.io.File;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Equipamento;
import model.Ambiente;

public class DashboardController {
    
    public static ArrayList<Equipamento> listaEquipamentos = new ArrayList<>();
    public static ArrayList<Ambiente> listaAmbientes = new ArrayList<>();
    public static double valorKwh = 0.90;
    
    @FXML
    private Label lblConsumoTotal;
    
    @FXML
    private Label lblValorEstimado;
    
    @FXML
    private Label lblEconomiaPossivel;
    
    @FXML
    private Label lblQuantidadeEquipamentos;
    
    @FXML
    private VBox sugestoesContainer;
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        atualizarDashboard();
    }
    
    public void atualizarDashboard() {
        double consumoTotal = 0;
        for (int i = 0; i < listaEquipamentos.size(); i++) {
            consumoTotal = consumoTotal + listaEquipamentos.get(i).consumoMensal;
        }
        
        double valorEstimado = consumoTotal * valorKwh;
        double economiaPossivel = consumoTotal * 0.20;
        
        lblConsumoTotal.setText(String.format("%.2f kWh", consumoTotal));
        lblValorEstimado.setText(String.format("R$ %.2f", valorEstimado));
        lblEconomiaPossivel.setText(String.format("%.2f kWh", economiaPossivel));
        lblQuantidadeEquipamentos.setText(String.valueOf(listaEquipamentos.size()));
        
        gerarSugestoes();
    }
    
    public void gerarSugestoes() {
        sugestoesContainer.getChildren().clear();
        
        int countArCondicionado = 0;
        int countLampadas = 0;
        int countComputadores = 0;
        int countImpressora3D = 0;
        
        for (int i = 0; i < listaEquipamentos.size(); i++) {
            Equipamento eq = listaEquipamentos.get(i);
            
            if (eq.tipo.equals("Ar Condicionado")) {
                countArCondicionado = countArCondicionado + eq.quantidade;
            }
            if (eq.tipo.equals("Iluminação")) {
                countLampadas = countLampadas + eq.quantidade;
            }
            if (eq.tipo.equals("Computador")) {
                countComputadores = countComputadores + eq.quantidade;
            }
            if (eq.tipo.equals("Impressora 3D")) {
                countImpressora3D = countImpressora3D + eq.quantidade;
            }
        }
        
        if (countArCondicionado > 0) {
            boolean usoExcessivo = false;
            for (int i = 0; i < listaEquipamentos.size(); i++) {
                Equipamento eq = listaEquipamentos.get(i);
                if (eq.tipo.equals("Ar Condicionado") && eq.horasUso > 8) {
                    usoExcessivo = true;
                    break;
                }
            }
            if (usoExcessivo) {
                adicionarSugestao("Reduza o uso do ar-condicionado para no máximo 8 horas por dia.");
            }
        }
        
        if (countLampadas > 10) {
            adicionarSugestao("Troque as lâmpadas comuns por LED para economizar até 80% de energia.");
        }
        
        if (countImpressora3D > 0) {
            boolean usoExcessivo = false;
            for (int i = 0; i < listaEquipamentos.size(); i++) {
                Equipamento eq = listaEquipamentos.get(i);
                if (eq.tipo.equals("Impressora 3D") && eq.horasUso > 8) {
                    usoExcessivo = true;
                    break;
                }
            }
            if (usoExcessivo) {
                adicionarSugestao("Organize as impressões em horários específicos para reduzir o tempo de uso.");
            }
        }
        
        if (countComputadores > 5) {
            adicionarSugestao("Ative o modo de economia de energia em todos os computadores.");
        }
        
        if (sugestoesContainer.getChildren().size() == 0) {
            if (listaEquipamentos.size() == 0) {
                adicionarSugestao("Cadastre equipamentos para receber sugestões personalizadas.");
            } else {
                adicionarSugestao("Ótimo! Seu consumo está dentro do recomendado.");
            }
        }
    }
    
    public void adicionarSugestao(String texto) {
        Label sugestao = new Label("• " + texto);
        sugestao.setStyle("-fx-text-fill: #E5E7EB; -fx-font-size: 14px; -fx-wrap-text: true;");
        sugestoesContainer.getChildren().add(sugestao);
    }
    
    @FXML
    public void irParaDashboard() {
    }
    
    @FXML
    public void irParaAmbientes() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Ambientes.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = lblConsumoTotal.getScene();
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
            Scene scene = lblConsumoTotal.getScene();
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
            Scene scene = lblConsumoTotal.getScene();
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
            Scene scene = lblConsumoTotal.getScene();
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
            Scene scene = lblConsumoTotal.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaIdeias() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Ideias.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = lblConsumoTotal.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void sair() {
        Stage stage = (Stage) lblConsumoTotal.getScene().getWindow();
        stage.close();
    }
}
