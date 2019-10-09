package com.stuart.controller;

import com.stuart.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Kafka Febian (1772012)
 */
public class LoginFormViewController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private BorderPane root;
    
    private Stage mainStage;
    @FXML
    private ImageView btnExit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final BooleanProperty firstTime = new SimpleBooleanProperty(true);
        txtUsername.focusedProperty().addListener((observable, oldValue,
                newValue) -> {
            if (newValue && firstTime.get()) {
                root.requestFocus();
                firstTime.setValue(false);
            }
        });
    }    

    @FXML
    private void btnLoginClick(ActionEvent event) {
                try {
            mainStage = new Stage();
            mainStage.setTitle("Main Menu");
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(
                    "view/MainMenuView.fxml"));
            BorderPane paneroot = loader.load();
            Scene scene = new Scene(paneroot);
            mainStage.setScene(scene);
            mainStage.setFullScreen(true);
            mainStage.setResizable(false);
            mainStage.initStyle(StageStyle.UNDECORATED);
            mainStage.initOwner(root.getScene().getWindow());
            mainStage.initModality(Modality.APPLICATION_MODAL);
            mainStage.setFullScreenExitHint("");

            if (!mainStage.isShowing()) {
                mainStage.show();
            } else {
                mainStage.toFront();
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginFormViewController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnExitClick(MouseEvent event) {
        Platform.exit();
    }
    
}
