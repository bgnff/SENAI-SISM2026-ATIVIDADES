package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SimulacaoController {
    
    @FXML
    private TextField txtValorKwh;
    
    @FXML
    private TextField txtPercentual;
    
    @FXML
    private Label lblNovoConsumo;
    
    @FXML
    private Label lblEconomiaKwh;
    
    @FXML
    private Label lblEconomiaReais;
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        txtValorKwh.setText(String.valueOf(DashboardController.valorKwh));
    }
    
    @FXML
    public void simular() {
        if (DashboardController.listaEquipamentos.size() == 0) {
            mostrarAlerta("Aviso", "Cadastre equipamentos primeiro para realizar a simulação!");
            return;
        }
        
        String valorKwhStr = txtValorKwh.getText().trim();
        String percentualStr = txtPercentual.getText().trim();
        
        if (valorKwhStr.isEmpty() || percentualStr.isEmpty()) {
            mostrarAlerta("Erro", "Por favor, preencha todos os campos!");
            return;
        }
        
        try {
            double valorKwh = Double.parseDouble(valorKwhStr);
            double percentual = Double.parseDouble(percentualStr);
            
            if (valorKwh <= 0 || percentual <= 0) {
                mostrarAlerta("Erro", "Os valores devem ser maiores que zero!");
                return;
            }
            
            double consumoTotal = 0;
            for (int i = 0; i < DashboardController.listaEquipamentos.size(); i++) {
                consumoTotal = consumoTotal + DashboardController.listaEquipamentos.get(i).consumoMensal;
            }
            
            double economiaKwh = consumoTotal * (percentual / 100);
            double novoConsumo = consumoTotal - economiaKwh;
            double economiaReais = economiaKwh * valorKwh;
            
            lblNovoConsumo.setText(String.format("%.2f kWh", novoConsumo));
            lblEconomiaKwh.setText(String.format("%.2f kWh", economiaKwh));
            lblEconomiaReais.setText(String.format("R$ %.2f", economiaReais));
            
            DashboardController.valorKwh = valorKwh;
            
        } catch (NumberFormatException e) {
            mostrarAlerta("Erro", "Por favor, digite valores numéricos válidos!");
        }
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
            Parent root = FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"));
            Scene scene = txtValorKwh.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaEquipamentos() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Equipamentos.fxml"));
            Scene scene = txtValorKwh.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaCadastro() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Cadastro.fxml"));
            Scene scene = txtValorKwh.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaRelatorios() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Relatorio.fxml"));
            Scene scene = txtValorKwh.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaSimulacao() {
    }
    
    @FXML
    public void sair() {
        javafx.stage.Stage stage = (javafx.stage.Stage) txtValorKwh.getScene().getWindow();
        stage.close();
    }
}
