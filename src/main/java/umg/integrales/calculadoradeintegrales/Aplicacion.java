package umg.integrales.calculadoradeintegrales;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Aplicacion extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Aplicacion.class.getResource("menuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 650);
        stage.setTitle("Calculadora de integrales");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}