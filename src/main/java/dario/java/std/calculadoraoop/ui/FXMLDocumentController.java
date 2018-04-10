package dario.java.std.calculadoraoop.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    Float data = null;
    int operation = -1;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Label label;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;
    
    @FXML
    void handleOperador(ActionEvent event) {
        
        if (event.getSource() == plus) {
            operation=1;
        } else if (event.getSource() == minus) {
            operation=2;
        } else if (event.getSource() == mult) {
            operation=3;
        } else if (event.getSource() == div) {
            operation=4;
        }
        
        
    }
    
    @FXML
    void handleIgual(ActionEvent event) {
        display.setText(String.valueOf(data));
    }
    
    @FXML
    void handleBorrar(ActionEvent event) {
        display.setText("");
        data = null;
    }
    
    private void handleNumero(Float numero) {
        if (data==null) {
            data = numero;
            display.setText(display.getText() + numero);
        } else {
            resolverOperacion(numero);
            display.setText(data.toString());
        }
    }
    
    @FXML
    void handleNumeros(ActionEvent event) {
        if (event.getSource() == one) {
            handleNumero(1f);
        } else if (event.getSource() == two) {
            handleNumero(2f);
        } else if (event.getSource() == three) {
            handleNumero(3f);
        } else if (event.getSource() == four) {
            handleNumero(4f);
        } else if (event.getSource() == five) {
            handleNumero(5f);
        } else if (event.getSource() == six) {
            handleNumero(6f);
        } else if (event.getSource() == seven) {
            handleNumero(7f);
        } else if (event.getSource() == eight) {
            handleNumero(8f);
        } else if (event.getSource() == nine) {
            handleNumero(9f);
        } else if (event.getSource() == zero) {
            handleNumero(0f);
        }    
    }
    
    
    private void resolverOperacion(Float secondOperand) {
            Float ans = null;
            
            switch (operation) {
                case 1: //Addition
                    ans = data + secondOperand;
                    break;
                case 2: //Subtraction
                    ans = data-secondOperand;
                    break;
                case 3: //Mul
                    ans = data * secondOperand;
                    break;
                case 4: //Div
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    }catch(Exception e){
                    }
            }
            if (ans != null) { 
                data = ans;
            } else {
                display.setText("Error");
                data = null;
            }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
