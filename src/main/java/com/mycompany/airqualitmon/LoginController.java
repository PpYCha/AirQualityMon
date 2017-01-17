package com.mycompany.airqualitmon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController implements Initializable {
    
    @FXML
    TextField username;
    
    @FXML
    TextField password;
    
    @FXML
    Button loginButton;
    
    @FXML
    private void handleLoginAction() throws IOException {
        
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
        Parent node = loader.load();
        stage.setMaximized(true);
        stage.setScene(new Scene(node));
        stage.show();
        
        Stage s = (Stage) loginButton.getScene().getWindow();
        s.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loginButton.disableProperty().bind(username.textProperty().isEmpty()
                .or(password.textProperty().isEmpty()));
        
    }
}
