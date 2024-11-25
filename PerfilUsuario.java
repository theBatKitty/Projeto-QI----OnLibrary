import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaEdicao extends Application {
    @Override
    public void start(Stage stage) {
        Label lblTitulo = new Label("Editar Usuário");
        lblTitulo.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");
        
        TextField txtNome = new TextField("Usuário Atual");
        txtNome.setPromptText("Atualizar nome");

        Button btnSalvar = new Button("Salvar");
        btnSalvar.setStyle("-fx-background-color: #FF6F61; -fx-text-fill: white;");

        btnSalvar.setOnAction(e -> System.out.println("Nome atualizado para: " + txtNome.getText()));

        VBox layout = new VBox(10, lblTitulo, txtNome, btnSalvar);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-spacing: 15;");
        
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Edição");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
