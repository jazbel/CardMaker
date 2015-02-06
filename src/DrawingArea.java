
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DrawingArea.java
 *
 * Created on 12-Jan-2011, 11:17:20 AM
 */
/**
 *
 * @author Jazbel Wang
 */
public class DrawingArea extends javax.swing.JPanel {
    //VARIABLE DECLARATION
    /**a Image to draw
     *
     */
    public Image toDraw;
    int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
    Color colour = Color.RED;
    String text = "";
    int button = 0;
    int size = 12;
    String font = "SansSerif";
    int style = Font.PLAIN;
    //Set the images
    Image cakes;
    Image candle;
    Image balloon;
    Image frame;
    Image flower;
    Image train;
    Image gift;
    Rectangle rect;
    /**
     * An integer representation of line
     */
    public static final int LINE = 0;
    /**
     * An integer representation of a cake image
     */
    public static final int CAKE = 1;
    /**
     * An integer representation of a candle image
     */
    public static final int CANDLE = 2;
    /**
     * An integer representation of a balloon image
     */
    public static final int BALLOONS = 3;
    /**
     * An integer representation of a flower image
     */
    public static final int FLOWER = 4;
    /**
     * An integer representation of a train image
     */
    public static final int TRAIN = 5;
    /**
     * An integer representation of the text
     */
    public static final int TEXT = 6;
    /**
     * An integer representation of a gift image
     */
    public static final int GIFT = 7;
    /**
     * An integer representation of a frame image
     */
    public static final int FRAME = 8;
    /**
     * An array of images in the form of drawnImages (has the information to display the image)
     */
    public ArrayList<DrawnImages> images = new ArrayList();

    /** Creates new form DrawingArea */
    public DrawingArea() {
        initComponents();
        //Load the pictures into the proper variables
        cakes = new ImageIcon("cake1.gif").getImage();
        candle = new ImageIcon("candleG.gif").getImage();
        balloon = new ImageIcon("balloons.gif").getImage();
        frame = new ImageIcon("flowerPatternG.gif").getImage();
        flower = new ImageIcon("flowersG.gif").getImage();
        gift = new ImageIcon("gift.gif").getImage();
        train = new ImageIcon("trainG.gif").getImage();
    }
    /**Method to set the images using the given file names
     *
     * @param data - an array of file name, the location of the images
     */
    public void setFileData(String[] data){                             //***************************************
        //Load the pictures into the proper variables
 //try{
        balloon = new ImageIcon(data[1]).getImage();
        cakes = new ImageIcon(data[2]).getImage();
        candle = new ImageIcon(data[3]).getImage();
        flower = new ImageIcon(data[4]).getImage();
        train = new ImageIcon(data[5]).getImage();
        gift = new ImageIcon(data[6]).getImage();
        frame = new ImageIcon(data[7]).getImage();
 //       }catch (Exception e){System.out.println("you suck");}
    }

    //Method to display the graphics
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        //Draw all of the previous drawings, depending on the type of images
        for (int i = 0; i < images.size(); i++) {
            DrawnImages d = images.get(i);
            if (d.type == CAKE) {
                g.drawImage(cakes, d.x1, d.y1, Math.abs(d.x1 - d.x2), Math.abs(d.y1 - d.y2), this);
            }
            else if (d.type == CANDLE) {
                g.drawImage(candle, d.x1, d.y1, Math.abs(d.x1 - d.x2), Math.abs(d.y1 - d.y2), this);
            }
            else if (d.type == BALLOONS) {
                g.drawImage(balloon, d.x1, d.y1, Math.abs(d.x1 - d.x2), Math.abs(d.y1 - d.y2), this);
            }
            else if (d.type == FLOWER) {
                g.drawImage(flower, d.x1, d.y1, Math.abs(d.x1 - d.x2), Math.abs(d.y1 - d.y2), this);
            }
            else if (d.type == TRAIN) {
                g.drawImage(train, d.x1, d.y1, Math.abs(d.x1 - d.x2), Math.abs(d.y1 - d.y2), this);
            }
            else if (d.type == FRAME) {
                g.drawImage(frame, d.x1, d.y1, Math.abs(d.x1 - d.x2), Math.abs(d.y1 - d.y2), this);
            }
            else if (d.type == GIFT) {
                g.drawImage(gift, d.x1, d.y1, Math.abs(d.x1 - d.x2), Math.abs(d.y1 - d.y2), this);
            }
            else if (d.type == TEXT) {
                g.setColor(d.colour);
                g.drawString(d.s, d.x1, d.y1);
            }
            else if (d.type == LINE) {
                g.setColor(d.colour);
                g.drawLine(d.x1, d.y1, d.x2, d.y2);
            }
        }
        //Set the font and the colour
        Font f = new Font(font, Font.PLAIN, size);
        g.setFont(f);
        g.setColor(colour);
        //Display the most recent image, the one that was just inputted
        if (button == CAKE||button == CANDLE||button == BALLOONS||button == FLOWER||button == TRAIN||button == FRAME||button == GIFT)//&& x2 != 0 && y2 != 0) //g.drawImage(toDraw, x1, y1, this);
        {
            g.drawImage(toDraw, x1, y1, Math.abs(x1 - x2), Math.abs(y1 - y2), this);

        }

        if (button == LINE) {
            g.drawLine(x1, y1, x2, y2);
        }
        if (button == TEXT) {
            g.drawString(text, x1, y1);
            repaint();
        }
                
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
