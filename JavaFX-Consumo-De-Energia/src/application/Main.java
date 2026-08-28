package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            File fxmlFile = new File("src/view/Dashboard.fxml");
            loader.setLocation(fxmlFile.toURI().toURL());
            Parent root = loader.load();
            
            Scene scene = new Scene(root, 1200, 800);
            
            File cssFile = new File("src/css/style.css");
            scene.getStylesheets().add(cssFile.toURI().toURL().toExternalForm());
            
            primaryStage.setTitle("EcoEnergy School - Sistema de Monitoramento de Energia");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao carregar arquivos FXML/CSS. Verifique os caminhos.");
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
