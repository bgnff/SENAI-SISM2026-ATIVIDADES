package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.io.File;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Ambiente;

public class AmbientesController {
    
    @FXML
    private TextField txtNome;
    
    @FXML
    private TextField txtDescricao;
    
    @FXML
    private TextField txtIcone;
    
    @FXML
    private TextField txtCategoria;
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        // Inicialização se necessário
    }
    
    @FXML
    public void adicionarAmbiente() {
        String nome = txtNome.getText().trim();
        String descricao = txtDescricao.getText().trim();
        String icone = txtIcone.getText().trim();
        String categoria = txtCategoria.getText().trim();
        
        if (nome.isEmpty()) {
            mostrarAlerta("Erro", "O nome do ambiente é obrigatório!");
            return;
        }
        
        try {
            String id = String.valueOf(System.currentTimeMillis());
            Ambiente ambiente = new Ambiente(id, nome, descricao, icone, categoria);
            DashboardController.listaAmbientes.add(ambiente);
            
            mostrarAlerta("Sucesso", "Ambiente cadastrado com sucesso!");
            limparCampos();
            
        } catch (Exception e) {
            mostrarAlerta("Erro", "Erro ao cadastrar ambiente: " + e.getMessage());
        }
    }
    
    @FXML
    public void limparCampos() {
        txtNome.setText("");
        txtDescricao.setText("");
        txtIcone.setText("🏢");
        txtCategoria.setText("Geral");
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
            Scene scene = txtNome.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaAmbientes() {
        // Já está na tela de ambientes
    }
    
    @FXML
    public void irParaEquipamentos() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new File("src/view/Equipamentos.fxml").toURI().toURL());
            Parent root = loader.load();
            Scene scene = txtNome.getScene();
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
            Scene scene = txtNome.getScene();
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
            Scene scene = txtNome.getScene();
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
            Scene scene = txtNome.getScene();
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
