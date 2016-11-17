/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 *
 * @author dompl
 */
public class FXMLDocumentController implements Initializable{
    
    @FXML
    private Label label;
    @FXML
    private TextField textfield;
    String pes="";
    Alert komunikat = new Alert(Alert.AlertType.INFORMATION);
    Check a = new Check();
    @FXML
    private void click(){
        if (a.checking(textfield.getText())){
            pes = pes.concat(textfield.getText()+" ");
            this.komunikat.setTitle("PESEL");
            this.komunikat.setHeaderText("Success :)");
            this.komunikat.showAndWait();
        }
        else{
            this.komunikat.setTitle("PESEL");
            this.komunikat.setHeaderText("Wrong PESEL :(");
            this.komunikat.showAndWait();
        }
        textfield.setText("");
    }
    @FXML
    private void click2() throws FileNotFoundException
    {
        FileChooser file1= new FileChooser();
        file1.getExtensionFilters().add(new FileChooser.ExtensionFilter("Pliki Tekstowe (*.txt)","*.txt"));
        PrintWriter out = new PrintWriter(file1.showSaveDialog(null));
        out.print(pes);
        out.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
