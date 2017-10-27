/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField beratbdn;
    @FXML
    private TextField tinggibdn;
    @FXML
    private RadioButton laki;
    @FXML
    private RadioButton cewek;
    @FXML
    private Button proses;
    @FXML
    private Button reset;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private TextField beratideal;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
    int ideal = 0;
    String Nama = nama.getText();
    int Tinggi = Integer.parseInt(tinggibdn.getText());
    int Berat = Integer.parseInt(beratbdn.getText());
     
    if(laki.isSelected()) {
        ideal = parseInt(tinggibdn.getText()) -105;
        
        beratideal.setText(""+ideal);
    if (ideal== Berat){
            hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" ideal ");
            saran.setText("pertahankan");
        }
        else if (ideal < Berat){
            hasil.setText("nama: "+Nama+ " Tinggi: "+Tinggi+" Overweight ");
            saran.setText("Jangan terlalu banyak makan :))");
        }
        else if (ideal > Berat){
            hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" Underweight ");
            saran.setText("Makan yang banyak ya :))");
        }
    }
       if(cewek.isSelected()) {
        ideal = parseInt(tinggibdn.getText()) -110;
        
        beratideal.setText(""+ideal);
    if (ideal==Berat){
            hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" ideal ");
            saran.setText("pertahankan");
        }
        else if (ideal < Berat){
            hasil.setText("nama: "+Nama+ " Tinggi: "+Tinggi+" Overweight ");
            saran.setText("Jangan terlalu banyak makan :))");
        }
        else if (ideal > Berat){
            hasil.setText("nama:  "+Nama+ " Tinggi:  "+Tinggi+" Underweight ");
            saran.setText("Makan yang banyak ya :))");
        }
    }
    
}
     @FXML
    private void reset(ActionEvent event) {
           nama.setText("");
           tinggibdn.setText("");
           beratbdn.setText("");
           laki.setSelected(false);
           cewek.setSelected(false);
           hasil.setText("");
           beratideal.setText("");
           reset.setText("");
           saran.setText("");
    }
    }
