package GUI_Package;
import javax.swing.*;

import java.awt.event.ActionEvent;
// to get the values from text field.
import java.awt.event.ActionListener;

public class Calculator {

	public static void main(String[] args) {
		JFrame frame = new JFrame ("Calculator");
		JLabel title = new JLabel("Basic Calculator");
        JLabel val1 = new JLabel("Enter Value 1: ");
        JLabel val2 = new JLabel("Enter Value 2: ");
        JLabel result = new JLabel("Result: ");
        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();
        JTextField res = new JTextField();

        
        JButton adi = new JButton ("Add");
        JButton sub = new JButton ("Subtract");
        JButton mul = new JButton ("Multiply");
        JButton divi = new JButton ("Divide");
        
        title.setBounds(200, 20, 120,100);
        val1.setBounds(20, 100, 120,100);
        val2.setBounds(20, 135, 120,100);
        f1.setBounds(150, 135, 150,30);
        f2.setBounds(150, 170, 150,30);
        adi.setBounds(20, 230, 90, 30);
        sub.setBounds(120, 230, 90, 30);
        mul.setBounds(220, 230, 90, 30);
        divi.setBounds(320, 230, 90, 30);
        result.setBounds(50, 300, 120, 30);
        res.setBounds(100, 300, 120, 30);
      
        
        frame.add(title);
        frame.add(val1);
        frame.add(val2);
        frame.add(res);
        frame.add(f1);
        frame.add(f2);
        frame.add(adi);
        frame.add(sub);
        frame.add(mul);
        frame.add(divi);
        frame.add(result);
        frame.add(res);
        
        
        adi.addActionListener(new ActionListener(){
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				int Num1 = Integer.parseInt(val1.getText());
        		int Num2 = Integer.parseInt(val2.getText());
        		int sum = Num1+Num2;
        		String r = Integer.toString(sum);
        		result.setText(r);
				
			}
        });
        
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

	}

}
