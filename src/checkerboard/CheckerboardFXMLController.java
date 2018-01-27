/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author christiancw
 */
public class CheckerboardFXMLController implements Initializable,Startable
{
    public Stage stage;
    public CheckerBoard checkerBoard;
    
    @FXML
    public VBox vbox;
    
    public ChangeListener<Number> lambdaChangeListener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> 
    {
        refresh(new CheckerBoard(this.checkerBoard.getNumRows(), this.checkerBoard.getNumCols(), 0, 0, this.checkerBoard.getLightColor(), this.checkerBoard.getDarkColor()));
    };

    
    @FXML
    public void handle3x3()
    {
        refresh(new CheckerBoard(3, 3, this.checkerBoard.getHeight(), this.checkerBoard.getWidth(), this.checkerBoard.getLightColor(), this.checkerBoard.getDarkColor()));
    }
    
    @FXML
    public void handle8x8()
    {
        refresh(new CheckerBoard(8, 8, this.checkerBoard.getHeight(), this.checkerBoard.getWidth(), this.checkerBoard.getLightColor(), this.checkerBoard.getDarkColor()));
    }
    
    @FXML
    public void handle10x10()
    {
        refresh(new CheckerBoard(10, 10, this.checkerBoard.getHeight(), this.checkerBoard.getWidth(), this.checkerBoard.getLightColor(), this.checkerBoard.getDarkColor()));
    }
    
    @FXML
    public void handle16x16()
    {
        refresh(new CheckerBoard(16, 16, this.checkerBoard.getHeight(), this.checkerBoard.getWidth(), this.checkerBoard.getLightColor(), this.checkerBoard.getDarkColor()));
    }
    
    @FXML
    public void handleDefault()
    {
        refresh(new CheckerBoard(this.checkerBoard.getNumRows(), this.checkerBoard.getNumCols(), this.checkerBoard.getHeight(), this.checkerBoard.getWidth()));
    }

    @FXML
    public void handleBlue()
    {
        refresh(new CheckerBoard(this.checkerBoard.getNumRows(), this.checkerBoard.getNumCols(), this.checkerBoard.getHeight(), this.checkerBoard.getWidth(), Color.SKYBLUE, Color.DARKBLUE));
    }
    
    @Override
    public void start(Stage stage)
    {
        this.stage = stage;
        this.stage.widthProperty().addListener(lambdaChangeListener);
        this.stage.heightProperty().addListener(lambdaChangeListener);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
    }    
    
    public void refresh(CheckerBoard checkerBoard)
    {
        checkerBoard.build();
    }
    
}
