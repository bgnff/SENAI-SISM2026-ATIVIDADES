package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Equipamento;

public class CadastroController {
    
    @FXML
    private TextField txtNome;
    
    @FXML
    private ComboBox<String> comboTipo;
    
    @FXML
    private TextField txtPotencia;
    
    @FXML
    private TextField txtQuantidade;
    
    @FXML
    private TextField txtHoras;
    
    @FXML
    private TextField txtDias;
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        comboTipo.setItems(FXCollections.observableArrayList(
            "Ar Condicionado",
            "Iluminação",
            "Computador",
            "Projetor",
            "Televisão",
            "Impressora",
            "Impressora 3D",
            "Refrigerador",
            "Micro-ondas",
            "Outro"
        ));
    }
    
    @FXML
    public void adicionarEquipamento() {
        String nome = txtNome.getText().trim();
        String tipo = comboTipo.getValue();
        String potenciaStr = txtPotencia.getText().trim();
        String quantidadeStr = txtQuantidade.getText().trim();
        String horasStr = txtHoras.getText().trim();
        String diasStr = txtDias.getText().trim();
        
        if (nome.isEmpty() || tipo == null || potenciaStr.isEmpty() || 
            quantidadeStr.isEmpty() || horasStr.isEmpty() || diasStr.isEmpty()) {
            mostrarAlerta("Erro", "Por favor, preencha todos os campos!");
            return;
        }
        
        try {
            double potencia = Double.parseDouble(potenciaStr);
            int quantidade = Integer.parseInt(quantidadeStr);
            int horas = Integer.parseInt(horasStr);
            int dias = Integer.parseInt(diasStr);
            
            if (potencia <= 0 || quantidade <= 0 || horas <= 0 || dias <= 0) {
                mostrarAlerta("Erro", "Todos os valores numéricos devem ser maiores que zero!");
                return;
            }
            
            Equipamento eq = new Equipamento(nome, tipo, potencia, quantidade, horas, dias);
            DashboardController.listaEquipamentos.add(eq);
            
            mostrarAlerta("Sucesso", "Equipamento cadastrado com sucesso!");
            limparCampos();
            
        } catch (NumberFormatException e) {
            mostrarAlerta("Erro", "Por favor, digite valores numéricos válidos!");
        }
    }
    
    @FXML
    public void limparCampos() {
        txtNome.setText("");
        comboTipo.setValue(null);
        txtPotencia.setText("");
        txtQuantidade.setText("");
        txtHoras.setText("");
        txtDias.setText("");
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
            Scene scene = txtNome.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaEquipamentos() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Equipamentos.fxml"));
            Scene scene = txtNome.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaCadastro() {
    }
    
    @FXML
    public void irParaRelatorios() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Relatorio.fxml"));
            Scene scene = txtNome.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaSimulacao() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Simulacao.fxml"));
            Scene scene = txtNome.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void sair() {
        javafx.stage.Stage stage = (javafx.stage.Stage) txtNome.getScene().getWindow();
        stage.close();
    }
}
