import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

public class Main{
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("pochi.jpg");
        Border border = BorderFactory.createLineBorder(Color.green, 3); //border
        

        JLabel label = new JLabel(); //create label
        label.setText("Adik kaba?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text left, center, right of image icon 
        label.setVerticalTextPosition(JLabel.TOP); //set text top, bottom, center of image icon
        label.setForeground(new Color(0x00FF00)); //set foreground color or color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //set font of text
        label.setIconTextGap(100); //set gap between text and image
        label.setBackground(new Color(200, 50, 0)); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //set border
        label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100, 100, 500, 500); //set X,Y position within frame as well as dimensions



        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        //frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.add(label); // add first before pack()
        //frame.setLayout(null);
        frame.pack(); //set frame position to center label on screen
    }
}