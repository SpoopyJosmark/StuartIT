package com.stuart.controller;

import com.stuart.dao.CourseDaoImpl;
import com.stuart.dao.StudentDaoImpl;
import com.stuart.entity.Course;
import com.stuart.entity.Log;
import com.stuart.entity.Student;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Kafka Febianto Agiharta -1772012
 * @author Jonathan Bernad - 1772004
 */
public class MainMenuViewController implements Initializable {

    //  FXML untuk root program
    @FXML
    private Tab tabAbout;
    @FXML
    private TabPane tabpane;
    @FXML
    private BorderPane root;
    @FXML
    private ImageView btnPltfmExit;

    //  FXML untuk tab profil admin
    @FXML
    private Tab tabProfil;
    @FXML
    private Label lblAdmName;
    @FXML
    private Label lblAdmEmail;
    @FXML
    private TableView<Log> tblAdmLog;
    @FXML
    private TableColumn<Log, String> colAdmUser;
    @FXML
    private TableColumn<Log, String> colAdmDate;
    @FXML
    private TableColumn<Log, String> colAdmActivity;

    //  FXML untuk tab mahasiswa
    @FXML
    private Tab tabMahasiswa;
    @FXML
    private TextField txtMhsNrp;
    @FXML
    private TextField txtMhsFrntName;
    @FXML
    private TextField txtMhsIpk;
    @FXML
    private TextField txtMhsLstName;
    @FXML
    private TableView<Student> tblMhsMahasiswa;
    @FXML
    private TableColumn<Student, String> colMhsNrp;
    @FXML
    private TableColumn<Student, String> colMhsNama;
    @FXML
    private TableColumn<Student, String> colMhsIpk;

    //  FXML untuk tab statistik
    @FXML
    private Tab tabStatistik;
    @FXML
    private LineChart<CategoryAxis, NumberAxis> chartSts;
    @FXML
    private NumberAxis numAxisSts;
    @FXML
    private CategoryAxis ctgAxisSts;
    @FXML
    private ComboBox<Student> cbxStsMhs;
    @FXML
    private ComboBox<Course> cbxStsMk;

    //  FXML untuk tab prediksi
    @FXML
    private Tab tabPrediksi;
    @FXML
    private ComboBox<Student> cbxPdxMhs;
    @FXML
    private BarChart<CategoryAxis, NumberAxis> chartPdx;
    @FXML
    private NumberAxis numAxisPdx;
    @FXML
    private CategoryAxis ctgAxisPdx;

    //  FXML untuk tab IP calculator
    @FXML
    private Tab tabHitungipk;
    @FXML
    private TextField txtIp_A;
    @FXML
    private TextField txtIp_B_plus;
    @FXML
    private TextField txtIp_B;
    @FXML
    private TextField txtIp_C_plus;
    @FXML
    private TextField txtIp_C;
    @FXML
    private TextField txtIp_D;
    @FXML
    private TextField txtIp_E;

    //  Attribut
    private ObservableList<Student> students;

    private ObservableList<Course> courses;

    private StudentDaoImpl studentDao;

    private CourseDaoImpl courseDao;

    private ObservableList<String> listCtgIpkMhs;

    private ObservableList<Integer> listNumIpkMhs;

    /**
     * Initializes the controller class. FXML main method
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gatherAllApplicationData();
        initializeStatistik();
    }

    @FXML
    private void btnExitClick(MouseEvent event) {
        Platform.exit();
    }

    /**
     * method yang digunakan dalam tab mahasiswa
     */
    @FXML
    private void brnMhsUpdateClick(ActionEvent event) {
    }

    /**
     * method yang digunakan dalam tab statistika
     */
    @FXML
    private void btnStsHtngMhsClick(ActionEvent event) {

        listCtgIpkMhs = FXCollections.observableArrayList();
        listNumIpkMhs = FXCollections.observableArrayList();
        
        numAxisSts = new NumberAxis();
                
        ctgAxisSts = new CategoryAxis();
        
        
    }

    @FXML
    private void btnStsAvgClick(ActionEvent event) {
    }

    @FXML
    private void btnStsResetClick(ActionEvent event) {
    }

    /**
     * method yang digunakan dalam tab prediksi
     */
    @FXML
    private void btnPdxClick(ActionEvent event) {
    }

    @FXML
    private void btnPdxReset(ActionEvent event) {
    }

    /**
     * method yang digunakan dalam tab IP calculator
     */
    @FXML
    private void btnIpCalcClick(ActionEvent event) {
    }

    /**
     * useful methods
     */
    private void gatherAllApplicationData() {
        students = FXCollections.observableArrayList();
        studentDao = new StudentDaoImpl();
        students.addAll(studentDao.getAllData());

        courses = FXCollections.observableArrayList();
        courseDao = new CourseDaoImpl();
        courses.addAll(courseDao.getAllData());
    }

    private void initializeStatistik() {
        listCtgIpkMhs = FXCollections.observableArrayList();
        listNumIpkMhs = FXCollections.observableArrayList();

        cbxStsMhs.setItems(students);
        cbxStsMk.setItems(courses);
    }
}
