/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona2.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import maratona2.Main;

/**
 *
 * @author josenaldo
 */
public class MainController implements Initializable {
    private Stage stage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleBtnCoachAction(ActionEvent event)
    {
        replaceSceneContent("view/Coach.fxml");
    }
    
    private void replaceSceneContent(String fxml)
    {
        Parent page;

        try
        {
            page = (Parent) FXMLLoader.load(Main.class.getResource(fxml), null, new JavaFXBuilderFactory());
            Scene scene = stage.getScene();
        if (scene == null)
        {
            scene = new Scene(page, 700, 450);
            stage.setScene(scene);
        }
        
        else
        {
            stage.getScene().setRoot(page);
        }
        stage.sizeToScene();
        
        }
        
        catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }
}
