package pemvis;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jessica
 */
public class karturoll extends JFrame {
    ImageIcon img = new ImageIcon("back-side.png");
    ImageIcon img1 = new ImageIcon("green1.png");
    ImageIcon img2 = new ImageIcon("redskip.png");
    ImageIcon img3 = new ImageIcon("reverse.png");
    ImageIcon img4 = new ImageIcon("wilddraw4.png");

    public karturoll(){
        GridLayout gl = new GridLayout(1,4,5,5);
        setLayout(gl);
        
        JButton a = new JButton(img);
        a.setRolloverIcon(img1);
        a.setPressedIcon(img1);
        add(a);
        
        JButton b = new JButton(img);
        b.setRolloverIcon(img2);
        b.setPressedIcon(img2);
        add(b);
        
        JButton c = new JButton(img);
        c.setRolloverIcon(img3);
        c.setPressedIcon(img3);
        add(c);
        
        JButton d = new JButton(img);
        d.setRolloverIcon(img4);
        d.setPressedIcon(img4);
        add(d);
    }
    
    
    public static void main(String[] args) {   
        karturoll frame = new karturoll();
        frame.setSize(1640,585);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    }
    

