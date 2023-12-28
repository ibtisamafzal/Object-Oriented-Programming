package GUI_Package;
import javax.swing.*;


public class FirstGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("login page");
        JLabel title = new JLabel("login here");
        JLabel id = new JLabel("student id");
        JLabel pass = new JLabel("password ");
        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();


        title.setBounds(200, 20, 120,100);
        id.setBounds(20, 100, 120,100);
        pass.setBounds(20, 130, 120,100);
        frame.add(title);
        frame.add(id);
        frame.add(pass);


        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

}             
}


        
