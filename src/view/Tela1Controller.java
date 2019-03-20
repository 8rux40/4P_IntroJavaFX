package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author btardin
 */
public class Tela1Controller implements Initializable {
    
    @FXML
    private Button btnOk;

    @FXML
    private TextField txtValor1;

    @FXML
    private TextField txtValor2;
    @FXML
    private Label lblResultado;

    @FXML
    void onBtnOkAction(ActionEvent event) {
        try {
            float soma = Float.sum(Float.parseFloat(txtValor1.getText()),Float.parseFloat(txtValor2.getText()));
            lblResultado.setText(String.valueOf(soma));
        } catch (NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro na soma", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
