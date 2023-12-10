package gui_task;
import javax.swing.*;


public class FirstGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("login page");
	    JLabel title = new JLabel("login here");
	    JLabel id = new JLabel("student id");
	    JLabel pass = new JLabel("password ");
	    JTextField f1 = new JTextField();
	    JTextField f2 = new JTextField();
	    
	    title.setBounds(100,20,100,20);
	    frame.add(title);
	    
	    frame.setSize(400,400);
	    frame.setVisible(true);

	}

}


        