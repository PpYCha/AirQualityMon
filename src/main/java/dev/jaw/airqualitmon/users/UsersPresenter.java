/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jaw.airqualitmon.users;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Archie
 */
public class UsersPresenter implements Initializable {

    UserVM userVM = new UserVM();

    @FXML
    Button saveButton;
    @FXML
    TextField usernameTextField;
    @FXML
    TextField passwordTextField;
    @FXML
    TextField passwordCopyTextField;
    @FXML
    ComboBox<String> roleComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<String> roles = FXCollections.observableArrayList("ADMIN","USER","STAFF");
        roleComboBox.setItems(roles);
        
        usernameTextField.textProperty().bindBidirectional(userVM.usernameProperty());
        passwordTextField.textProperty().bindBidirectional(userVM.passwordProperty());
        passwordCopyTextField.textProperty().bindBidirectional(userVM.passwordCopyProperty());
        
        
    }

}
