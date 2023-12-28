import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui2 {
    JLabel label11,label12,label13,label14;
    private String num1;
    Gui2(){
    
        JFrame frame = new JFrame("Ibtisam Afzal");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(173,173,173));
        label11 = new JLabel(num1);
        label11.setBounds(100, 100, 200, 50);
        
         label12 = new JLabel();
         label13 = new JLabel();
        label14 = new JLabel();
        frame.setVisible(true);

        
    }
    
}
