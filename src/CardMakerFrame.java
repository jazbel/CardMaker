/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CardBuilderFrame.java
 *
 * Created on 12-Jan-2011, 11:13:29 AM
 */
/**
 *
 * @author Jazbel Wang
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player; //this is to play mp3 music
import hsa.*;
import java.awt.Color;
import java.awt.Font;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jazbel Wang
 */
public class CardMakerFrame extends javax.swing.JFrame {

    //VARIABLE DECLARATION
    Thread musicalThread;  //this is a separate thread that will play music and still let other things go on
    Player player;  //this is to hold the song being played
    String[] label = new String[7]; //label names
    String[] fileLoc = new String[8]; //file location of images and song
    MainMenuFrame mmf = null;
    BFrame frame = new BFrame();
    String type2;

    /** Creates new CardMakerFrame */
    public CardMakerFrame() {
        initComponents();
        setUpPlayer("happybday.mp3");     //this just calls the method to load the mp3 file and
        musicalThread = new Thread() {  //this creates a thread to play the music and starts it.

            public void run() {
                try {
                    player.play();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        musicalThread.start();
    }

    /**Constructor for creating a new CardMakerFrame
     *
     * @param type - type of card to create, e.g. Birthday Card
     */
    public CardMakerFrame(String type) {
        type2 = type;
        //load the proper file full of data
        loadFileData(type);  //***********************************************
        initComponents();
        //Set the card's background to light grey (default)
        newCard1.drawingArea1.setBackground(Color.LIGHT_GRAY);
        //set up song with proper data
        if (fileLoc[0] != null) {
            setUpPlayer(fileLoc[0]);     //this just calls the method to load the mp3 file and  //use the first line for mp3
        }

        newCard1.cardData = label;           //give card data to newCard

        musicalThread = new Thread() {  //this creates a thread to play the music and starts it.

            public void run() {
                try {
                    player.play();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        musicalThread.start();
    }

    /**Method that allows file access to get the label information and file location
     *
     * @param type - type of card to make, e.g. Birthday Card
     */
    public void loadFileData(String type) {
        TextInputFile tif = new TextInputFile("listOfTypes.txt");
        String line = "";

        //skip lines until reach one we're looking for
        while (!line.equals(type)) {
            line = tif.readLine();
        }
        fileLoc[0] = tif.readLine();
        //read next 7 lines of data
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(tif.readLine(), "/");
            label[i] = st.nextToken();
            fileLoc[i + 1] = st.nextToken();
        }

        tif.close();
    }

    /**load an mp3 file into a player
     *
     * @param filename - file name of the song to play
     */
    public void setUpPlayer(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        newCard1 = new NewCard(label, fileLoc);
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        newCardMItem = new javax.swing.JMenuItem();
        saveMItem = new javax.swing.JMenuItem();
        print = new javax.swing.JMenuItem();
        instruction = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        undoMItem = new javax.swing.JMenuItem();
        fontMenu = new javax.swing.JMenu();
        font = new javax.swing.JMenuItem();
        style = new javax.swing.JMenuItem();
        size = new javax.swing.JMenuItem();
        bgMItem = new javax.swing.JMenuItem();
        clear = new javax.swing.JMenuItem();
        Music = new javax.swing.JMenu();
        pause = new javax.swing.JMenuItem();
        play = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("jMenu1");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(newCard1, java.awt.BorderLayout.CENTER);

        file.setText("File");

        newCardMItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newCardMItem.setText("New Card");
        newCardMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCardMItemActionPerformed(evt);
            }
        });
        file.add(newCardMItem);

        saveMItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMItem.setText("Save");
        saveMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMItemActionPerformed(evt);
            }
        });
        file.add(saveMItem);

        print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        file.add(print);

        instruction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        instruction.setText("Instruction");
        instruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionActionPerformed(evt);
            }
        });
        file.add(instruction);

        jMenuBar1.add(file);

        edit.setText("Edit");

        undoMItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undoMItem.setText("Undo");
        undoMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoMItemActionPerformed(evt);
            }
        });
        edit.add(undoMItem);

        fontMenu.setText("Font");

        font.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        font.setText("Font");
        font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontActionPerformed(evt);
            }
        });
        fontMenu.add(font);

        style.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        style.setText("Style");
        style.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleActionPerformed(evt);
            }
        });
        fontMenu.add(style);

        size.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        size.setText("Size");
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });
        fontMenu.add(size);

        edit.add(fontMenu);

        bgMItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        bgMItem.setText("Background");
        bgMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgMItemActionPerformed(evt);
            }
        });
        edit.add(bgMItem);

        clear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        clear.setText("Clear All");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        edit.add(clear);

        jMenuBar1.add(edit);

        Music.setText("Music");

        pause.setText("Pause");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        Music.add(pause);

        play.setText("Play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        Music.add(play);

        jMenuBar1.add(Music);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Method to undo the previous move/addition of image, line or text
    private void undoMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoMItemActionPerformed
        newCard1.drawingArea1.images.remove(newCard1.drawingArea1.images.size() - 1);
        newCard1.drawingArea1.repaint();
    }//GEN-LAST:event_undoMItemActionPerformed
    //Method to create a new card
    private void newCardMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCardMItemActionPerformed
        musicalThread.stop();
        mmf.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_newCardMItemActionPerformed
    //Method that saves the information of the images, line, text displayed into a file so that it can be loaded again in the future
    private void saveMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMItemActionPerformed
        TextOutputFile tof = new TextOutputFile("save.txt");
        //Print the type of card into the file
        tof.println(type2);
        //Print the necessary information to display the images
        for (int i = 0; i < newCard1.drawingArea1.images.size(); i++) {
            DrawnImages d = newCard1.drawingArea1.images.get(i);
            if (d.type == newCard1.drawingArea1.TEXT) {
                tof.println(d.type + "/" + d.x1 + "/" + d.y1 + "/" + String.valueOf(d.colour.getRGB()) + "/" + d.s);
            } else if (d.type == newCard1.drawingArea1.LINE) {
                tof.println(d.type + "/" + d.x1 + "/" + d.y1 + "/" + d.x2 + "/" + d.y2 + "/" + String.valueOf(d.colour.getRGB()));
            } else {
                tof.println(d.type + "/" + d.x1 + "/" + d.y1 + "/" + d.x2 + "/" + d.y2);
            }
        }
    }//GEN-LAST:event_saveMItemActionPerformed
    //Method that displays a dialog that allows the user to set the background colour of the card
    private void bgMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgMItemActionPerformed
        Background b = new Background(frame, true);
        b.nc = newCard1;
        b.pack();
        b.setVisible(true);
    }//GEN-LAST:event_bgMItemActionPerformed
    //Method that clears all the pictures on the card
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        newCard1.drawingArea1.images.clear();
        newCard1.drawingArea1.repaint();
    }//GEN-LAST:event_clearActionPerformed
    //Method that opens a dialog that allows the user to choose the size of the font
    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        //Create options for the dialog and get the choice that the user picks
        Object[] options = {"8", "10", "12", "14", "16", "18", "20", "24", "28", "32", "36", "40", "42", "48", "56", "64"};
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Choose a font size:\n",
                "Font Size",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);
        int size = Integer.parseInt(s);
        //Pass the information to the drawing area to set the size of the font
        newCard1.drawingArea1.size = size;
    }//GEN-LAST:event_sizeActionPerformed
    //Method that opens a dialog that allows the user to choose the style of the font
    private void styleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleActionPerformed
        //Create options for the dialog and get the choice that the user picks
        Object[] options = {"Plain", "Bold", "Italic", "Bold and Italic"};
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Choose a font style:\n",
                "Font Style",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);
        //Pass the information to the drawing area to set the style of the font
        if (s.equals("Plain")) {
            newCard1.drawingArea1.style = Font.PLAIN;
        } else if (s.equals("Bold")) {
            newCard1.drawingArea1.style = Font.BOLD;
        } else if (s.equals("Italic")) {
            newCard1.drawingArea1.style = Font.ITALIC;
        } else if (s.equals("Bold and Italic")) {
            newCard1.drawingArea1.style = Font.BOLD + Font.ITALIC;
        }
    }//GEN-LAST:event_styleActionPerformed
    //Method that opens a dialog that allows the user to choose the type of the font
    private void fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontActionPerformed
        //Create options for the dialog and get the choice that the user picks
        Object[] options = {"Arial", "Courier", "Helvetica", "Monotype Corsiva", "Times New Roman"};
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Choose a font:\n",
                "Font",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);
        //Pass the information to the drawing area to set the type of the font
        if (s.equals("Arial")) {
            s = "SansSerif";
        }
        if (s.equals("Times New Roman")) {
            s = "Serif";
        }
        newCard1.drawingArea1.font = s;
    }//GEN-LAST:event_fontActionPerformed
    //Method that prints the card
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        PrintUtilities.printComponent(newCard1.drawingArea1);
    }//GEN-LAST:event_printActionPerformed
    //Method that pauses the music
    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        musicalThread.suspend();
    }//GEN-LAST:event_pauseActionPerformed
    //Method that replay the music
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        musicalThread.resume();
    }//GEN-LAST:event_playActionPerformed
    //Method that displays the instruction
    private void instructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionActionPerformed
        JFrame frame = new JFrame("Instructions");
        JOptionPane.showMessageDialog(frame, "Welcome to Jazbel's Card Maker. "
                + "Feel free to design the card however you want, choose your colour in the bottom taskbar."
                + "\nClick the Images buttons to change to the desired image. Dragging left to right draws an outlined shape, dragging right to left "
                + "\ndraws a filled shape. Click the text button then click the enabled box in the bottom corner, type what you wish, then "
                + "\nhit enter, after hitting enter click where you wish on the screen. The text will then appear where you clicked.");
    }//GEN-LAST:event_instructionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new CardMakerFrame("Birthday Card").setVisible(true);
//            }
//        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Music;
    private javax.swing.JMenuItem bgMItem;
    private javax.swing.JMenuItem clear;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem font;
    private javax.swing.JMenu fontMenu;
    private javax.swing.JMenuItem instruction;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    public NewCard newCard1;
    private javax.swing.JMenuItem newCardMItem;
    private javax.swing.JMenuItem pause;
    private javax.swing.JMenuItem play;
    private javax.swing.JMenuItem print;
    private javax.swing.JMenuItem saveMItem;
    private javax.swing.JMenuItem size;
    private javax.swing.JMenuItem style;
    private javax.swing.JMenuItem undoMItem;
    // End of variables declaration//GEN-END:variables
}
