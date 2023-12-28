import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui implements ActionListener {
    JButton button;
    JTextField text1,text2,text3,text4;
    
    Gui(){
        JFrame frame = new JFrame("Ibtisam Afzal");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(173,173,173));
        JLabel label = new JLabel("Login Form");
        label.setFont(new Font("MV BOLI", Font.PLAIN, 72));
        label.setBounds(775, 50, 500, 100);
        frame.add(label);
        JLabel label1 = new JLabel("Name");
        label1.setBounds(600, 300, 200, 50);
        label1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        frame.add(label1);

        text1 = new JTextField();
        text1.setBounds(1000, 300, 400, 30);
        text1.setFont(new Font("Tahoma", Font.PLAIN, 28));
        frame.add(text1);

        JLabel label2 = new JLabel("Email");
        label2.setBounds(600, 380, 200, 50);
        label2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        frame.add(label2);

       text2 = new JTextField();
        text2.setBounds(1000, 380, 400, 30);
         text2.setFont(new Font("Tahoma", Font.PLAIN, 28));
        frame.add(text2);

        JLabel label3 = new JLabel("Password");
        label3.setBounds(600, 460, 200, 50);
        label3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        frame.add(label3);

        text3 = new JTextField();
        text3.setBounds(1000, 460, 400, 30);
         text3.setFont(new Font("Tahoma", Font.PLAIN, 28));
        frame.add(text3);

         JLabel label4 = new JLabel("Confirm Password");
        label4.setBounds(600, 540, 240, 50);
        label4.setFont(new Font("Tahoma", Font.PLAIN, 30));
        frame.add(label4);

        text4 = new JTextField();
        text4.setBounds(1000, 540, 400, 30);
         text4.setFont(new Font("Tahoma", Font.PLAIN, 28));
        frame.add(text4);

        button = new JButton("Login");
        button.setBackground(Color.black);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma",Font.PLAIN,30));
        button.setBounds(820,700, 250, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);


        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Gui();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            String num1=text1.getText();
            String num2=text2.getText();
            String num3=text3.getText();
            String num4=text4.getText();
            if(num3.equals(num4)){
                JOptionPane.showMessageDialog(null, "Login Successfully");
                new Gui2();
            }
            else{
                    JOptionPane.showMessageDialog(null, "Failed....");
            }
            
        
        }
    }
    
}
