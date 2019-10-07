package com.stuart.controller;

import com.stuart.MainApp;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Kafka Febian (1772012)
 */
public class MainMenuViewController implements Initializable {

    @FXML
    private Tab tabProfil;
    @FXML
    private Tab tabMahasiswa;
    @FXML
    private Tab tabStatistik;
    @FXML
    private Tab tabPrediksi;
    @FXML
    private Tab tabHitungipk;
    @FXML
    private Tab tabAbout;
    @FXML
    private TabPane tabpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
}
