/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplestage;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nafiul
 */
public class Dialogbox extends Stage{
    
    Dialogbox(){
        VBox vbox=new VBox();
        vbox.setMinHeight(300);
        vbox.setMinWidth(700);
        
        Label lbl=new Label("this is second stage");
        
        vbox.getChildren().add(lbl);
        
        Scene scene=new Scene(vbox);
        
        Stage stage=new Stage();
        
        stage.setScene(scene);
        stage.show();
        
        
    }
    
}
