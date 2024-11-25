import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lista extends Application {
    @Override
    public void start(Stage stage) {
        Label lblTitulo = new Label("Lista de Usuários");
        lblTitulo.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");
        
        ListView<String> lista = new ListView<>();
        lista.getItems().addAll("Usuário 1", "Usuário 2", "Usuário 3");

        VBox layout = new VBox(10, lblTitulo, lista);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-spacing: 15;");
        
        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Consulta");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
