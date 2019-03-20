package app;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author btardin
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        /* Arquivo que vai carregar a tela da aplicação */
        Parent root = FXMLLoader.load(getClass().getResource("/view/Tela1.fxml"));
        
        /* Controlador de componentes */
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
