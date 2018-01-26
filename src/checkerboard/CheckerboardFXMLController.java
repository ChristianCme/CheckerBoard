/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author christiancw
 */
public class CheckerboardFXMLController implements Initializable,Startable
{
    public Stage stage;
    
    @FXML
    public void handle3x3()
    {
        refresh(new CheckerBoard(3, 3, board.getHeight(), gboard.getWidth()).build());
    }
    
    @FXML
    public void handle8x8()
    {
        
    }
    
    @FXML
    public void handle10x10()
    {
        
    }
    
    @FXML
    public void handle16x16()
    {
        
    }
    
    @FXML
    public void handleDefault()
    {
        
    }

    @FXML
    public void handleBlue()
    {
        
    }
    
    @Override
    public void start(Stage stage)
    {
        this.stage = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
    }    
    
    public void refresh(AnchorPane anchorPane)
    {
       
    }
    
}
