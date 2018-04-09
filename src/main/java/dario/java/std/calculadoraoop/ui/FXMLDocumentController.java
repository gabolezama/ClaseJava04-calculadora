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
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == plus) {
            resolverOperacionParcial(1);
        } else if (event.getSource() == minus) {
            resolverOperacionParcial(2);
        } else if (event.getSource() == mult) {
            resolverOperacionParcial(3);
        } else if (event.getSource() == div) {
            resolverOperacionParcial(4);
        } else if (event.getSource() == equals) {            
            resolverOperacion();
        }
    }
    
    private void resolverOperacionParcial(int operacion) {
        if (data==null) {
            data = Float.parseFloat(display.getText()); 
            display.setText("");
        } else 
            resolverOperacion();
        
        operation = operacion;
    }
    
    private void resolverOperacion() {
        Float secondOperand = Float.parseFloat(display.getText());
            Float ans = null;
            
            switch (operation) {
                case 1: //Addition
                    ans = secondOperand + data;
                    break;
                case 2: //Subtraction
                    ans = secondOperand - data;
                    break;
                case 3: //Mul
                    ans = secondOperand * data;
                    break;
                case 4: //Div
                    ans = 0f;
                    try {
                        ans = secondOperand / data;
                    }catch(Exception e){
                    }
            }
            if (ans != null) { 
                data = ans;
                display.setText(String.valueOf(ans));
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
