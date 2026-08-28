package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Equipamento;

public class EquipamentosController {
    
    @FXML
    private TextField txtPesquisa;
    
    @FXML
    private TableView<Equipamento> tabelaEquipamentos;
    
    @FXML
    private TableColumn<Equipamento, String> colNome;
    
    @FXML
    private TableColumn<Equipamento, String> colTipo;
    
    @FXML
    private TableColumn<Equipamento, Double> colPotencia;
    
    @FXML
    private TableColumn<Equipamento, Integer> colQuantidade;
    
    @FXML
    private TableColumn<Equipamento, Integer> colHoras;
    
    @FXML
    private TableColumn<Equipamento, Integer> colDias;
    
    @FXML
    private TableColumn<Equipamento, Double> colConsumo;
    
    private ArrayList<Equipamento> listaFiltrada = new ArrayList<>();
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colPotencia.setCellValueFactory(new PropertyValueFactory<>("potencia"));
        colQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colHoras.setCellValueFactory(new PropertyValueFactory<>("horasUso"));
        colDias.setCellValueFactory(new PropertyValueFactory<>("diasUso"));
        colConsumo.setCellValueFactory(new PropertyValueFactory<>("consumoMensal"));
        
        atualizarTabela();
    }
    
    @FXML
    public void atualizarTabela() {
        listaFiltrada.clear();
        
        for (int i = 0; i < DashboardController.listaEquipamentos.size(); i++) {
            listaFiltrada.add(DashboardController.listaEquipamentos.get(i));
        }
        
        carregarTabela();
    }
    
    public void carregarTabela() {
        ObservableList<Equipamento> data = FXCollections.observableArrayList(listaFiltrada);
        tabelaEquipamentos.setItems(data);
    }
    
    @FXML
    public void pesquisar() {
        String termo = txtPesquisa.getText().trim().toLowerCase();
        
        listaFiltrada.clear();
        
        if (termo.isEmpty()) {
            for (int i = 0; i < DashboardController.listaEquipamentos.size(); i++) {
                listaFiltrada.add(DashboardController.listaEquipamentos.get(i));
            }
        } else {
            for (int i = 0; i < DashboardController.listaEquipamentos.size(); i++) {
                Equipamento eq = DashboardController.listaEquipamentos.get(i);
                if (eq.nome.toLowerCase().contains(termo) || eq.tipo.toLowerCase().contains(termo)) {
                    listaFiltrada.add(eq);
                }
            }
        }
        
        carregarTabela();
    }
    
    @FXML
    public void editarEquipamento() {
        Equipamento selecionado = tabelaEquipamentos.getSelectionModel().getSelectedItem();
        
        if (selecionado == null) {
            mostrarAlerta("Aviso", "Selecione um equipamento para editar!");
            return;
        }
        
        mostrarAlerta("Informação", "Funcionalidade de edição em desenvolvimento.\n\n" +
            "Equipamento: " + selecionado.nome + "\n" +
            "Tipo: " + selecionado.tipo + "\n" +
            "Potência: " + selecionado.potencia + " W\n" +
            "Quantidade: " + selecionado.quantidade);
    }
    
    @FXML
    public void excluirEquipamento() {
        Equipamento selecionado = tabelaEquipamentos.getSelectionModel().getSelectedItem();
        
        if (selecionado == null) {
            mostrarAlerta("Aviso", "Selecione um equipamento para excluir!");
            return;
        }
        
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("Deseja realmente excluir o equipamento " + selecionado.nome + "?");
        
        confirmacao.showAndWait().ifPresent(response -> {
            if (response == javafx.scene.control.ButtonType.OK) {
                DashboardController.listaEquipamentos.remove(selecionado);
                atualizarTabela();
                mostrarAlerta("Sucesso", "Equipamento excluído com sucesso!");
            }
        });
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
            Scene scene = txtPesquisa.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaEquipamentos() {
    }
    
    @FXML
    public void irParaCadastro() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Cadastro.fxml"));
            Scene scene = txtPesquisa.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaRelatorios() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Relatorio.fxml"));
            Scene scene = txtPesquisa.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void irParaSimulacao() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Simulacao.fxml"));
            Scene scene = txtPesquisa.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void sair() {
        javafx.stage.Stage stage = (javafx.stage.Stage) txtPesquisa.getScene().getWindow();
        stage.close();
    }
}
