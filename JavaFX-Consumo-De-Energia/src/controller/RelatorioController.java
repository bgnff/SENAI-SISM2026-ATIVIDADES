package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import model.Equipamento;

public class RelatorioController {
    
    @FXML
    private Label lblQuantidade;
    
    @FXML
    private Label lblConsumoTotal;
    
    @FXML
    private Label lblValorTotal;
    
    @FXML
    private Label lblMaiorConsumidor;
    
    @FXML
    private Label lblMaiorConsumo;
    
    @FXML
    private Label lblMenorConsumidor;
    
    @FXML
    private Label lblMenorConsumo;
    
    @FXML
    private Label lblMediaConsumo;
    
    @FXML
    private Label lblClassificacao;
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        atualizarRelatorio();
    }
    
    @FXML
    public void atualizarRelatorio() {
        if (DashboardController.listaEquipamentos.size() == 0) {
            lblQuantidade.setText("0");
            lblConsumoTotal.setText("0 kWh");
            lblValorTotal.setText("R$ 0,00");
            lblMaiorConsumidor.setText("-");
            lblMaiorConsumo.setText("0 kWh");
            lblMenorConsumidor.setText("-");
            lblMenorConsumo.setText("0 kWh");
            lblMediaConsumo.setText("0 kWh");
            lblClassificacao.setText("Nenhum dado cadastrado");
            return;
        }
        
        int quantidade = DashboardController.listaEquipamentos.size();
        
        double consumoTotal = 0;
        for (int i = 0; i < DashboardController.listaEquipamentos.size(); i++) {
            consumoTotal = consumoTotal + DashboardController.listaEquipamentos.get(i).consumoMensal;
        }
        
        double valorTotal = consumoTotal * DashboardController.valorKwh;
        
        Equipamento maiorConsumidor = DashboardController.listaEquipamentos.get(0);
        for (int i = 1; i < DashboardController.listaEquipamentos.size(); i++) {
            Equipamento atual = DashboardController.listaEquipamentos.get(i);
            if (atual.consumoMensal > maiorConsumidor.consumoMensal) {
                maiorConsumidor = atual;
            }
        }
        
        Equipamento menorConsumidor = DashboardController.listaEquipamentos.get(0);
        for (int i = 1; i < DashboardController.listaEquipamentos.size(); i++) {
            Equipamento atual = DashboardController.listaEquipamentos.get(i);
            if (atual.consumoMensal < menorConsumidor.consumoMensal) {
                menorConsumidor = atual;
            }
        }
        
        double mediaConsumo = consumoTotal / quantidade;
        
        String classificacao = "";
        if (consumoTotal < 50) {
            classificacao = "✅ Baixo consumo - Excelente!";
        } else if (consumoTotal >= 50 && consumoTotal <= 150) {
            classificacao = "⚠️ Consumo moderado - Atenção necessária.";
        } else {
            classificacao = "🔴 Alto consumo - Ações urgentes recomendadas.";
        }
        
        lblQuantidade.setText(String.valueOf(quantidade));
        lblConsumoTotal.setText(String.format("%.2f kWh", consumoTotal));
        lblValorTotal.setText(String.format("R$ %.2f", valorTotal));
        lblMaiorConsumidor.setText(maiorConsumidor.nome);
        lblMaiorConsumo.setText(String.format("%.2f kWh", maiorConsumidor.consumoMensal));
        lblMenorConsumidor.setText(menorConsumidor.nome);
        lblMenorConsumo.setText(String.format("%.2f kWh", menorConsumidor.consumoMensal));
        lblMediaConsumo.setText(String.format("%.2f kWh", mediaConsumo));
        lblClassificacao.setText(classificacao);
    }
    
    @FXML
    public void irParaDashboard() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"));
            Scene scene = lblQuantidade.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaEquipamentos() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Equipamentos.fxml"));
            Scene scene = lblQuantidade.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaCadastro() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Cadastro.fxml"));
            Scene scene = lblQuantidade.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaRelatorios() {
    }
    
    @FXML
    public void irParaSimulacao() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Simulacao.fxml"));
            Scene scene = lblQuantidade.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void sair() {
        javafx.stage.Stage stage = (javafx.stage.Stage) lblQuantidade.getScene().getWindow();
        stage.close();
    }
}
