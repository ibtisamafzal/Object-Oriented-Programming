package GUI_Package;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JLabel title = new JLabel("Basic Calculator");
        JLabel val1Label = new JLabel("Enter Value 1: ");
        JLabel val2Label = new JLabel("Enter Value 2: ");
        JLabel resultLabel = new JLabel("Result: ");
        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();
        JTextField resultField = new JTextField();

        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");
        JButton mulBtn = new JButton("Multiply");
        JButton divBtn = new JButton("Divide");

        title.setBounds(200, 20, 120, 100);
        val1Label.setBounds(20, 100, 120, 100);
        val2Label.setBounds(20, 135, 120, 100);
        f1.setBounds(150, 135, 150, 30);
        f2.setBounds(150, 170, 150, 30);
        addBtn.setBounds(20, 230, 90, 30);
        subBtn.setBounds(120, 230, 90, 30);
        mulBtn.setBounds(220, 230, 90, 30);
        divBtn.setBounds(320, 230, 90, 30);
        resultLabel.setBounds(50, 300, 120, 30);
        resultField.setBounds(100, 300, 120, 30);

        frame.add(title);
        frame.add(val1Label);
        frame.add(val2Label);
        frame.add(resultLabel);
        frame.add(f1);
        frame.add(f2);
        frame.add(resultField);
        frame.add(addBtn);
        frame.add(subBtn);
        frame.add(mulBtn);
        frame.add(divBtn);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                    int num1 = Integer.parseInt(f1.getText());
                    int num2 = Integer.parseInt(f2.getText());
                    int sum = num1 + num2;
                    resultField.setText(Integer.toString(sum));
            }
        });

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
