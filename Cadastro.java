import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cadastro extends Application {
    @Override
    public void start(Stage stage) {
        Label lblTitulo = new Label("Cadastro de Usuário");
        lblTitulo.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");
        
        TextField txtNome = new TextField();
        txtNome.setPromptText("Digite seu nome");
        
        TextField txtEmail = new TextField();
        txtEmail.setPromptText("Digite seu e-mail");

        Button btnCadastrar = new Button("Cadastrar");
        btnCadastrar.setStyle("-fx-background-color: #FF6F61; -fx-text-fill: white;");

        btnCadastrar.setOnAction(e -> System.out.println("Cadastrado: " + txtNome.getText() + ", " + txtEmail.getText()));

        VBox layout = new VBox(10, lblTitulo, txtNome, txtEmail, btnCadastrar);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-spacing: 15;");
        
        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Cadastro");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
