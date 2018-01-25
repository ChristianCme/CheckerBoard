/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.paint.Color;


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
    private double rectangleHeight;
    private double rectangleWidth;

    public CheckerBoard(int numRows, int numCols, double boardHeight, double boardWidth, Color lightColor, Color darkColor)
    {
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
    public CheckerBoard(int numRows, int numCols, double boardHeight, double boardWidth)
    {
        this(numRows, numCols, boardHeight, boardWidth, Color.RED, Color.BLACK);
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
        return rectangleWidth;
    }

    public double getRectangleHeight()
    {
        return rectangleHeight;
    }
    
    
}
