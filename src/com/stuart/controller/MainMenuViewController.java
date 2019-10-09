package com.stuart.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

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
    @FXML
    private BorderPane root;
    @FXML
    private LineChart<?, ?> chartStatistik;
    @FXML
    private NumberAxis numberStatistik;
    @FXML
    private CategoryAxis categoryChartStatistik;
    @FXML
    private ComboBox<?> cbIpkSemester;
    @FXML
    private Button btnIpkSemester;
    @FXML
    private ComboBox<?> cbRatarata;
    @FXML
    private Button btnRatarata;
    @FXML
    private Button btnResetStat;
    @FXML
    private ComboBox<?> cbPerkemMhs;
    @FXML
    private Button btnBuatStat;
    @FXML
    private Button btnHapusPrediksi;
    @FXML
    private BarChart<?, ?> chartPrediksi;
    @FXML
    private NumberAxis numberChartPrediksi;
    @FXML
    private CategoryAxis categoryChartPrediksi;
    @FXML
    private ImageView btnExit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void btnIpkSemesterClick(ActionEvent event) {
    }

    @FXML
    private void btnRatarataClick(ActionEvent event) {
    }

    @FXML
    private void btnResetStatClick(ActionEvent event) {
    }

    @FXML
    private void btnBuatStatClick(ActionEvent event) {
    }

    @FXML
    private void btnHapusPrediksiClick(ActionEvent event) {
    }

    @FXML
    private void btnExitClick(MouseEvent event) {
        Platform.exit();
    }
    
}
