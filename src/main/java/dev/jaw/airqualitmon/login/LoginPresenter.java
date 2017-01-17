/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jaw.airqualitmon.login;

import com.airhacks.afterburner.injection.Injector;
import dev.jaw.airqualitmon.main.MainView;
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
public class LoginPresenter implements Initializable {

    private AnchorPane contentPane;

    @FXML
    public void handleLogin() {
        contentPane.getChildren().clear();
        contentPane.getChildren().add(new MainView().getView());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void setContentPane(AnchorPane contentPane) {
        this.contentPane = contentPane;
    }

}
