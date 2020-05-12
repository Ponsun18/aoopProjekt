package Projekt;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Test extends JFrame implements ActionListener {

	JButton sofa;
	JButton bed;
	JButton desk;
	JButton chair;
	JButton b5;
	JButton b6;
	JButton b7;
	int xmouse;
	int ymouse;
	int x2;
	int y2;
	backgroundpic panel;

	public static void main(String[] args) throws IOException {

		Test frame = new Test();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 900);
		frame.setVisible(true);
	}

	public Test() {
		panel = new backgroundpic("rlo.png");
		panel.setPreferredSize(new Dimension(900, 900));

		// initButton(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		sofa = new JButton("Sofa");
		bed = new JButton("Bed");
		desk = new JButton("Desk");
		chair = new JButton("Chair");
		b5 = new JButton("test");
		b6 = new JButton("test");
		b7 = new JButton("test");
		sofa.addActionListener(this);
		bed.addActionListener(this);
		desk.addActionListener(this);
		chair.addActionListener(this);
		panel.add(sofa);
		panel.add(bed);
		panel.add(desk);
		panel.add(chair);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		add(panel);
	}
	// action listenr to make more than one of each furniture if needed
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(sofa)) {
			System.out.println("Sofa");
			JLabel abc = new JLabel();
			addPic(abc, "sofa.png");
		}
		if (e.getSource().equals(bed)) {
			System.out.println("Bed");
			JLabel abc = new JLabel();
			addPic(abc, "bed.png");
		}
		if (e.getSource().equals(desk)) {
			System.out.println("Desk");
			JLabel abc = new JLabel();
			addPic(abc, "desk.png");
		}
		if (e.getSource().equals(chair)) {
			System.out.println("Chair");
			JLabel abc = new JLabel();
			addPic(abc, "chair.jpg");
		}

	}
	// should add the picture, and make it moveable by mouse
	public void addPic(JLabel name, String funrniture) {
		ImageIcon test = new ImageIcon(funrniture);
		Image test2 = test.getImage();
		Image testM = test2.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		test = new ImageIcon(testM);
		name.setIcon(test);

		name.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				jlMouseDragged(name,evt);
				
			}
		});
		name.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jlMousePressed(evt);
				
			}

			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jlMouseClickedS(evt);
			}
		});

		panel.add(name);
		panel.updateUI();
	}
	// should change the postion of the things that is dragged
	public void jlMouseDragged(JLabel asd,java.awt.event.MouseEvent evt) {
		x2 = evt.getXOnScreen();
		y2 = evt.getYOnScreen();

		asd.setLocation(x2 - xmouse, y2 - ymouse);
		System.out.println("x2: " + x2 + " " + "y2: " + y2);
	}

	public void jlMousePressed(java.awt.event.MouseEvent evt) {
		xmouse = evt.getX();
		ymouse = evt.getY();
		
	}

	public static void jlMouseClickedS(java.awt.event.MouseEvent evt) {
		Border empty = BorderFactory.createEmptyBorder();

	}
}