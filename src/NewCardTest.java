/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewCard.java
 *
 * Created on 10-Jan-2011, 11:26:33 AM
 */
/**
 *
 * @author 072695679
 */
//Imports
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author 072695679
 */
public class NewCardTest extends javax.swing.JPanel implements MouseListener, KeyListener, MouseMotionListener {

    //VARIABLE DECLARATION
    int x1, y1, xdir, ydir; //Variable to get the clicks
    Image cakes;
    Image candle;
    Image balloon;
    Image line;
    Image flower;
    Image train;
    Rectangle rect;

    /** Creates new form NewCard */
    public NewCardTest() {
        initComponents();
        //Load the pictures into the proper variables
        cakes = new ImageIcon("cake.jpg").getImage();
        candle = new ImageIcon("candle1.png").getImage();
        balloon = new ImageIcon("balloons.gif").getImage();
        line = new ImageIcon("flowerPattern.JPG").getImage();
        flower = new ImageIcon("flowers.gif").getImage();
        train = new ImageIcon("train.gif").getImage();
        //The following code tells the panel what will be listening for events (essentially the panel will listen for its own events)
        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);
        //Rectangle that surrounds the canvas
        rect = new Rectangle(10, 10, 429, 476);

    }

    //   public void paintComponent(Graphics g){
    //  }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jToolBar1 = new javax.swing.JToolBar();
        redB = new javax.swing.JButton();
        blueB = new javax.swing.JButton();
        yellowB = new javax.swing.JButton();
        greenB = new javax.swing.JButton();
        violetB = new javax.swing.JButton();
        blackB = new javax.swing.JButton();
        label3 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        firework = new javax.swing.JButton();
        pencilB = new javax.swing.JButton();
        Frame = new javax.swing.JButton();
        cakeB = new javax.swing.JButton();
        candleB = new javax.swing.JButton();
        balloonB = new javax.swing.JButton();
        flowerB = new javax.swing.JButton();
        lineB = new javax.swing.JButton();
        trainB = new javax.swing.JButton();
        drawingAreaTest1 = new DrawingAreaTest();

        jButton7.setText("jButton7");

        label1.setText("Shapes and Images");

        label2.setText("Colours");

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        redB.setBackground(new java.awt.Color(255, 0, 0));
        redB.setForeground(new java.awt.Color(255, 0, 0));
        redB.setText("      ");
        redB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redBActionPerformed(evt);
            }
        });
        jToolBar1.add(redB);

        blueB.setBackground(new java.awt.Color(0, 0, 255));
        blueB.setForeground(new java.awt.Color(0, 0, 255));
        blueB.setText("      ");
        blueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueBActionPerformed(evt);
            }
        });
        jToolBar1.add(blueB);

        yellowB.setBackground(new java.awt.Color(255, 255, 0));
        yellowB.setForeground(new java.awt.Color(255, 255, 0));
        yellowB.setText("      ");
        yellowB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowBActionPerformed(evt);
            }
        });
        jToolBar1.add(yellowB);

        greenB.setBackground(new java.awt.Color(0, 255, 0));
        greenB.setForeground(new java.awt.Color(0, 255, 0));
        greenB.setText("      ");
        greenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenBActionPerformed(evt);
            }
        });
        jToolBar1.add(greenB);

        violetB.setBackground(new java.awt.Color(204, 0, 204));
        violetB.setForeground(new java.awt.Color(204, 0, 204));
        violetB.setText("      ");
        violetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                violetBActionPerformed(evt);
            }
        });
        jToolBar1.add(violetB);

        blackB.setBackground(new java.awt.Color(0, 0, 0));
        blackB.setText("      ");
        blackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackBActionPerformed(evt);
            }
        });
        jToolBar1.add(blackB);

        label3.setText("Text");

        textField1.setText("textField1");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        firework.setText("Firework");
        firework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireworkActionPerformed(evt);
            }
        });

        pencilB.setText("Pencil");
        pencilB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencilBActionPerformed(evt);
            }
        });

        Frame.setText("Frame");
        Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrameActionPerformed(evt);
            }
        });

        cakeB.setText("Cake");
        cakeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeBActionPerformed(evt);
            }
        });

        candleB.setText("Candle");
        candleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candleBActionPerformed(evt);
            }
        });

        balloonB.setText("Balloons");
        balloonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balloonBActionPerformed(evt);
            }
        });

        flowerB.setText("Flowers");
        flowerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowerBActionPerformed(evt);
            }
        });

        lineB.setText("Line");
        lineB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineBActionPerformed(evt);
            }
        });

        trainB.setText("Train");
        trainB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drawingAreaTest1Layout = new javax.swing.GroupLayout(drawingAreaTest1);
        drawingAreaTest1.setLayout(drawingAreaTest1Layout);
        drawingAreaTest1Layout.setHorizontalGroup(
            drawingAreaTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        drawingAreaTest1Layout.setVerticalGroup(
            drawingAreaTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(trainB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(candleB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(cakeB, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(balloonB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(flowerB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lineB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pencilB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firework, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drawingAreaTest1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drawingAreaTest1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cakeB)
                            .addComponent(lineB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(candleB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pencilB))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firework)
                            .addComponent(balloonB))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Frame)
                            .addComponent(flowerB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trainB))
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void redBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redBActionPerformed
        drawingAreaTest1.colour = Color.red;
        drawingAreaTest1.repaint();
}//GEN-LAST:event_redBActionPerformed

    private void blueBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueBActionPerformed
        drawingAreaTest1.colour = Color.blue;
        drawingAreaTest1.repaint();
}//GEN-LAST:event_blueBActionPerformed

    private void yellowBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowBActionPerformed
        drawingAreaTest1.colour = Color.yellow;
        drawingAreaTest1.repaint();
}//GEN-LAST:event_yellowBActionPerformed

    private void greenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenBActionPerformed
        drawingAreaTest1.colour = Color.green;
        drawingAreaTest1.repaint();
}//GEN-LAST:event_greenBActionPerformed

    private void violetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_violetBActionPerformed
        drawingAreaTest1.colour = Color.magenta;
        drawingAreaTest1.repaint();
}//GEN-LAST:event_violetBActionPerformed

    private void blackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackBActionPerformed
        drawingAreaTest1.colour = Color.black;
        drawingAreaTest1.repaint();
}//GEN-LAST:event_blackBActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        drawingAreaTest1.text = textField1.getText();
        drawingAreaTest1.button = 3;
        drawingAreaTest1.repaint();
    }//GEN-LAST:event_textField1ActionPerformed

    private void fireworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireworkActionPerformed
        drawingAreaTest1.firework = true;
        drawingAreaTest1.button = 4;
        drawingAreaTest1.repaint();
    }//GEN-LAST:event_fireworkActionPerformed

    private void pencilBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencilBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pencilBActionPerformed

    private void cakeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeBActionPerformed
        drawingAreaTest1.toDraw = cakes;
        drawingAreaTest1.button = 1;
        drawingAreaTest1.repaint();
    }//GEN-LAST:event_cakeBActionPerformed

    private void candleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candleBActionPerformed
        drawingAreaTest1.toDraw = candle;
        drawingAreaTest1.button = 1;
        drawingAreaTest1.repaint();
    }//GEN-LAST:event_candleBActionPerformed

    private void balloonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balloonBActionPerformed
        drawingAreaTest1.toDraw = balloon;
        drawingAreaTest1.button = 1;
        drawingAreaTest1.repaint();
    }//GEN-LAST:event_balloonBActionPerformed

    private void flowerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowerBActionPerformed
        drawingAreaTest1.toDraw = flower;
        drawingAreaTest1.button = 1;
        drawingAreaTest1.repaint();
    }//GEN-LAST:event_flowerBActionPerformed

    private void lineBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineBActionPerformed
        drawingAreaTest1.line = true;
        drawingAreaTest1.button = 2;
        drawingAreaTest1.repaint();
        drawingAreaTest1.line = false;
    }//GEN-LAST:event_lineBActionPerformed

    private void FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrameActionPerformed
//        drawingArea1.line = true;
//        drawingArea1.button = 2;
//        drawingArea1.repaint();
    }//GEN-LAST:event_FrameActionPerformed

    private void trainBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainBActionPerformed
        drawingAreaTest1.toDraw = train;
        drawingAreaTest1.button = 1;
        drawingAreaTest1.repaint();
    }//GEN-LAST:event_trainBActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Frame;
    private javax.swing.JButton balloonB;
    private javax.swing.JButton blackB;
    private javax.swing.JButton blueB;
    private javax.swing.JButton cakeB;
    private javax.swing.JButton candleB;
    private java.awt.Canvas canvas1;
    private DrawingAreaTest drawingAreaTest1;
    private javax.swing.JButton firework;
    private javax.swing.JButton flowerB;
    private javax.swing.JButton greenB;
    private javax.swing.JButton jButton7;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JButton lineB;
    private javax.swing.JButton pencilB;
    private javax.swing.JButton redB;
    private java.awt.TextField textField1;
    private javax.swing.JButton trainB;
    private javax.swing.JButton violetB;
    private javax.swing.JButton yellowB;
    // End of variables declaration//GEN-END:variables

    public void mouseClicked(MouseEvent e) {
        //   drawingArea1.x1 = e.getX();
        //  drawingArea1.y1 = e.getY();
    }

    public void mousePressed(MouseEvent e) {
        System.out.println(e.getX() + ":" + e.getY());
        drawingAreaTest1.x1 = e.getX();
        drawingAreaTest1.y1 = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("2nd:" + e.getX() + ":" + e.getY());
        drawingAreaTest1.x2 = e.getX();
        drawingAreaTest1.y2 = e.getY();
        if (drawingAreaTest1.button == 2) {
            drawingAreaTest1.repaint();
        }
        drawingAreaTest1.toDraw = null;
        drawingAreaTest1.x1 = 0;
        drawingAreaTest1.y1 = 0;
        drawingAreaTest1.x2 = 0;
        drawingAreaTest1.y2 = 0;
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("drag");
        if (drawingAreaTest1.button != 2) {
            drawingAreaTest1.x2 = e.getX();
            drawingAreaTest1.y2 = e.getY();
            drawingAreaTest1.repaint();
        }

    }

    public void mouseMoved(MouseEvent e) {
    }
}