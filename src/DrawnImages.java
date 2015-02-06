/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Author:  Jazbel Wang
Class:   ICS3UE

Program: Assignment X Question Y
Input: N/A
Processing: Setting the information for displaying the images
Output: N/A

@param  c a parameter to the method.
@return d what the method is returning
@throws NullPointerException when this is thrown.
 */
//Import Statements Listed Alphabetically
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner

/**
 *
 * @author Jazbel Wang
 */
public class DrawnImages {

    //VARIABLE DECLARATION
    int x1, x2, y1, y2; //The coordinates needed to display the images
    int type;   //The integer representation of the image
    String s;   //The text
    Color colour;   //The colour of text or line
    int size = 12;  //The size of the font
    String font = "SansSerif";  //The type of the font
    int style = Font.PLAIN; //The style of the font

    //*******NOTE: SIZE, FONT, STYLE SHOULD BE ADDED TO THE FONT CONSTRUCTOR TO REPAINT THE TEXT CORRECTLY********
    //*******NOTE: BACKGROUND SHOULD BE SET******
    //Constructor for images
    /**
     *
     * @param xx1 - first x coordinate of the top left corner
     * @param yy1 - first y coordinate of the top left corner
     * @param xx2 - second x coordinate of the bottom right corner
     * @param yy2 - second y coordinate of the bottom right corner
     * @param xima - The integer representation of the image
     */
    public DrawnImages(int xx1, int yy1, int xx2, int yy2, int xima) {
        x1 = xx1;
        x2 = xx2;
        y1 = yy1;
        y2 = yy2;
        type = xima;
    }

    //Constructor for text
    /**
     *
     * @param xx1 - first x coordinate of the top left corner
     * @param yy1 - first y coordinate of the top left corner
     * @param xima - The integer representation of the image
     * @param xcolour - the colour of the text
     * @param ss - the text to display
     */
    public DrawnImages(int xx1, int yy1, int xima, Color xcolour, String ss) {
        x1 = xx1;
        y1 = yy1;
        type = xima;
        s = ss;
        colour = xcolour;
    }

    //Constructor for line
    /**
     *
     * @param xx1 - first x coordinate of the top left corner
     * @param yy1 - first y coordinate of the top left corner
     * @param xx2 - second x coordinate of the bottom right corner
     * @param yy2 - second y coordinate of the bottom right corner
     * @param xima - The integer representation of the image
     * @param xcolour - the colour of the line
     */
    public DrawnImages(int xx1, int yy1, int xx2, int yy2, int xima, Color xcolour) {
        x1 = xx1;
        x2 = xx2;
        y1 = yy1;
        y2 = yy2;
        type = xima;
        colour = xcolour;
    }
    /*** MAIN METHOD **
     * @param args
     */
}
