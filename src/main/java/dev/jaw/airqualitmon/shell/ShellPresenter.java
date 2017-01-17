/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jaw.airqualitmon.shell;

import dev.jaw.airqualitmon.login.LoginPresenter;
import dev.jaw.airqualitmon.login.LoginView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ShellPresenter implements Initializable {

    @FXML
    AnchorPane contentPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        contentPane.getChildren().clear();
        LoginView loginView = new LoginView();
        LoginPresenter presenter = (LoginPresenter) loginView.getPresenter();
        presenter.setContentPane(contentPane);
        contentPane.getChildren().add(loginView.getView());
    }

}
