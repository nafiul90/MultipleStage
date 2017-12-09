/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplestage;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nafiul
 */
public class MultipleStage extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        VBox vbox=new VBox();
        vbox.setMinHeight(300);
        vbox.setMinWidth(500);
        
        Button btn=new Button("chicl here");
        vbox.getChildren().addAll(btn);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
                Dialogbox box=new Dialogbox();
                stage.close();
            }
        });
        
        
        
        
        Scene scene=new Scene(vbox);
        stage.setScene(scene);
        stage.show();
        
    
    }
    
}
