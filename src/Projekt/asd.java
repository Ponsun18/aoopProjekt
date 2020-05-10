package Projekt;
//FAn
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// adds the buttons frames, panels
public class asd extends JFrame implements ActionListener {
	private static JButton Sofa;
	private static JButton Bed;
	private static JButton Desk;
	private static JButton chair;
	private static JButton test1;
	private static JButton test2;
	private static JButton test3;
	private static JButton test4;
	private static JButton test5;
	private static JFrame f;
	private static JPanel p;
	static JLabel jl;

	// adds them to the panel and gets a actionlistener for the buttons
	public asd() {
		Sofa = new JButton("Sofa");
		Bed = new JButton("Bed");
		Desk = new JButton("Desk");
		chair = new JButton("chair");
		test1 = new JButton("test1");
		test2 = new JButton("test2");
		test3 = new JButton("test3");
		test4 = new JButton("test4");
		test5 = new JButton("test5");

		p.add(Sofa);
		p.add(Bed);
		p.add(Desk);
		p.add(chair);
		p.add(test1);
		p.add(test2);
		p.add(test3);
		p.add(test4);
		p.add(test5);
		
		Sofa.addActionListener(this); // sets actionListeners
		Bed.addActionListener(this);
		Desk.addActionListener(this);
		chair.addActionListener(this);

	}
	// Adds a picture to the GUI
	public static void picture(String funrniture) {
		ImageIcon test = new ImageIcon(funrniture);
		Image test2 = test.getImage();
		Image testM = test2.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		test = new ImageIcon(testM);
		jl.setIcon(test);
		p.add(jl, "Center");
		f.getContentPane().add(p, BorderLayout.WEST);
		p.updateUI();
	}

	// sets up he frame and panel layouts
	public static void main(String[] args) {

		f = new JFrame("Border Layout");
		p = new JPanel();
		jl = new JLabel();
		p.setLayout(new GridLayout(6, 2));
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		f.setSize(900, 900);
		// calls for the buttons to be set
		asd test = new asd();
		// calls for the room layout to be set
		Base t = new Base();
		f.getContentPane().add(p, BorderLayout.WEST);
		f.getContentPane().add(t, BorderLayout.CENTER);
		// f.getContentPane().add(b, BorderLayout.WEST);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == Sofa) {
			System.out.println("Your PRessed Sofa");
			picture("sofa.png");
		}
		if (arg0.getSource() == Bed) {
			System.out.println("Your PRessed Bed");
			picture("bed.png");
		}
		if (arg0.getSource() == Desk) {
			System.out.println("Your PRessed Desk");
			picture("desk.png");
		}
		if (arg0.getSource() == chair) {
			System.out.println("Your PRessed Chair");
			picture("chair.jpg");
		}
	}
}
