package Projekt;

//hhmmmm
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
	static JLabel jlS;
	static JLabel jlB;
	static JLabel jlD;
	static JLabel jlC;
	static int x2;
	static int y2;
	static int xmouse;
	static int ymouse;

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
	public static void picture(JLabel newS, String funrniture) {
		//
		// TO DO

		// **- create new jl everytime // fixable but then i cant move it. see line 142
		// **- add it to the panel where the room layout is in // no idea how to add it,
		// hmm since its created in another class and only called
		// upon when its needed line 106, 108
		//
		//
		ImageIcon test = new ImageIcon(funrniture);
		Image test2 = test.getImage();
		Image testM = test2.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		test = new ImageIcon(testM);
		newS.setIcon(test);

		// add mouse shit
		newS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				if (funrniture == "sofa.png") {
					jlMouseDraggedS(evt);
				}
				if (funrniture == "bed.png") {
					jlMouseDraggedB(evt);
				}
				if (funrniture == "desk.png") {
					jlMouseDraggedD(evt);
				}
				if (funrniture == "chair.jpg") {
					jlMouseDraggedC(evt);
				}
			}
		});
		newS.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				if (funrniture == "sofa.png") {
					jlMousePressedS(evt);
				}
				if (funrniture == "bed.png") {
					jlMousePressedB(evt);
				}
				if (funrniture == "desk.png") {
					jlMousePressedD(evt);
				}
				if (funrniture == "chair.jpg") {
					jlMousePressedC(evt);
				}
			}

			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jlMouseClickedS(evt);
			}
		});

		// end mouse shit
		p.add(newS, "Center");
		f.getContentPane().add(p, BorderLayout.WEST);
		p.updateUI();
	}

	// sets up he frame and panel layouts
	public static void main(String[] args) {

		f = new JFrame("Border Layout");
		p = new JPanel();
		jlS = new JLabel();
		jlB = new JLabel();
		jlD = new JLabel();
		jlC = new JLabel();
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
			jlS = new JLabel();
			picture(jlS, "sofa.png");
			// picture("sofa.png");
		}
		if (arg0.getSource() == Bed) {
			System.out.println("Your PRessed Bed");
			jlB = new JLabel();
			picture(jlB, "bed.png");
			// picture("bed.png");
		}
		if (arg0.getSource() == Desk) {
			System.out.println("Your PRessed Desk");
			jlD = new JLabel();
			picture(jlD, "desk.png");
			// picture("desk.png");
		}
		if (arg0.getSource() == chair) {
			System.out.println("Your PRessed Chair");
			jlC = new JLabel();
			picture(jlC, "chair.jpg");
			// picture("chair.jpg");
		}
	}

	// for mouse shit
	// for your sake dont look at his, since i had to create one for each
	// furniture.....
	public static void jlMouseDraggedS(java.awt.event.MouseEvent evt) {
		 x2 = evt.getXOnScreen();
		y2 = evt.getYOnScreen();
	
		jlS.setLocation(x2 - xmouse, y2 - ymouse); // here is the problem, if i change jl to this. and the method to
													// public void, then it will
		// complain in row 76 hmm, how i solve this dilemma.
	}

	public static void jlMousePressedS(java.awt.event.MouseEvent evt) {
		xmouse = evt.getX();
		ymouse = evt.getY();
	}

	public static void jlMouseClickedS(java.awt.event.MouseEvent evt) {
		// Border empty = BorderFactory.createEmptyBorder();

	}

	public static void jlMouseDraggedB(java.awt.event.MouseEvent evt) {
		 x2 = evt.getXOnScreen();
		 y2 = evt.getYOnScreen();
		jlB.setLocation(x2 - xmouse, y2 - ymouse);
	}

	public static void jlMousePressedB(java.awt.event.MouseEvent evt) {
		xmouse = evt.getX();
		ymouse = evt.getY();
	}

	public static void jlMouseDraggedD(java.awt.event.MouseEvent evt) {
		 x2 = evt.getXOnScreen();
		 y2 = evt.getYOnScreen();

		jlD.setLocation(x2 - xmouse, y2 - ymouse);
	}

	public static void jlMousePressedD(java.awt.event.MouseEvent evt) {
		xmouse = evt.getX();
		ymouse = evt.getY();
	}

	public static void jlMouseDraggedC(java.awt.event.MouseEvent evt) {
		 x2 = evt.getXOnScreen();
		 y2 = evt.getYOnScreen();

		jlC.setLocation(x2 - xmouse, y2 - ymouse);
	}

	public static void jlMousePressedC(java.awt.event.MouseEvent evt) {
		xmouse = evt.getX();
		ymouse = evt.getY();
	}
}
