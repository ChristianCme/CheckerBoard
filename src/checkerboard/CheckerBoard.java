/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 *
 * @author christiancw
 */
public class CheckerBoard
{
    private int numRows;
    private int numCols;
    private Color lightColor;
    private Color darkColor;
    private double boardHeight;
    private double boardWidth;
    private double rectHeight;
    private double rectWidth;
    private AnchorPane board;
    
    public CheckerBoard(int numRows, int numCols, double boardHeight, double boardWidth, Color lightColor, Color darkColor)
    {
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        this.lightColor = lightColor;
        this.darkColor = darkColor;
        this.rectWidth = Math.ceil(boardWidth / numCols);
        this.rectHeight = Math.ceil(boardHeight / numRows);

    }
    
    public CheckerBoard(int numRows, int numCols, double boardHeight, double boardWidth)
    {
        this(numRows, numCols, boardHeight, boardWidth, Color.RED, Color.BLACK);
    }
    
    public AnchorPane build()
    {
        AnchorPane newBoard = new AnchorPane();
        
        for (int i = 0; i < numCols; i++)
        {
            for (int j = 0; j < numRows; j++)
            {
                Rectangle rect;
                if ((i + j) % 2 == 0) 
                {
                    rect = new Rectangle(rectWidth, rectHeight, lightColor);
                }
                else 
                {
                    rect = new Rectangle(rectWidth, rectHeight, darkColor);
                }
                AnchorPane.setTopAnchor(rect, i * rectHeight);
                AnchorPane.setLeftAnchor(rect, j * rectWidth);
                newBoard.getChildren().add(rect);
            }
            
        }
        
        this.board = newBoard;
        
        return newBoard;
    }
    
    public int getNumRows()
    {
        return numRows;
    }

    public int getNumCols()
    {
        return numCols;
    }

    public Color getLightColor()
    {
        return lightColor;
    }

    public Color getDarkColor()
    {
        return darkColor;
    }

    public double getWidth()
    {
        return boardWidth;
    }

    public double getHeight()
    {
        return boardHeight;
    }

    public double getRectangleWidth()
    {
        return rectWidth;
    }

    public double getRectangleHeight()
    {
        return rectHeight;
    }
    
    public AnchorPane getBoard()
    {
        return board;
    }

}
