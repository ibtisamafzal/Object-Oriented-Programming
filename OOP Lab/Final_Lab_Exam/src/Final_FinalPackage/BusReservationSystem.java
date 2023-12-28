package Final_FinalPackage;
import javax.swing.*;

public class BusReservationSystem {

	public static void main(String[] args) {
		
	JFrame frame = new JFrame("Bus Reservation System");
	
	JLabel l0 = new JLabel ("Bus Reservation System");
	
	JLabel l1 = new JLabel ("Name: ");
	JTextField t1 = new JTextField();
	
	JLabel l2 = new JLabel ("Bus No: ");
	JTextField t2 = new JTextField();
	
	JLabel l3 = new JLabel ("Number of seats: ");
	JTextField t3 = new JTextField();
	
	JButton Okbtn = new JButton("Ok");
	
	l0.setBounds(170, 20, 150, 150);
	l1.setBounds(20, 100, 120, 100);
	t1.setBounds(80, 130, 100, 40);
	
	
	l2.setBounds(20, 160, 120, 100);
	t2.setBounds(80, 190, 120, 40);
	
	
	l3.setBounds(20, 230, 120, 100);
	t3.setBounds(120, 260, 120, 40);
	
	
	Okbtn.setBounds(150, 320, 150, 50);
	
	frame.add(l0);
	frame.add(l1);
    frame.add(t1);
    frame.add(l2);
    frame.add(t2);
    frame.add(l3);
    frame.add(t3);
    frame.add(Okbtn);
    
    frame.setSize(500, 500);
    frame.setLayout(null);
    frame.setVisible(true);
    
	}

}
	

