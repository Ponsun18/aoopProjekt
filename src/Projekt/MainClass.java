package Projekt;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
	
public class MainClass {
	static int x2;
	static int y2;
	static int xmouse;
	static int ymouse;
	 static JLabel jl;
	 static JLabel jlsofa;
	public static void main(String[] args) {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	 jl = new JLabel();
	f.setSize(800, 800);
	ImageIcon test = new ImageIcon("chair.jpg");
	Image test2 = test.getImage();
	Image testM = test2.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
	test = new ImageIcon(testM);
	jl.setIcon(test);
	jl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
		public void mouseDragged(java.awt.event.MouseEvent evt) {
			jlMouseDragged(evt);
		}
	});
	jl.addMouseListener(new java.awt.event.MouseAdapter() {
		public void mousePressed(java.awt.event.MouseEvent evt) {
			jlMousePressed(evt);
		}
		public void mouseClicked(java.awt.event.MouseEvent evt) {
			jlMouseClicked(evt);
		}
	});
	p.add(jl);
	/*////// --------------------------------------------------------
	jlsofa = new JLabel();
		ImageIcon asd = new ImageIcon("sofa.png");
		Image asd1 = asd.getImage();
		Image m1 = asd1.getScaledInstance(10, 10, java.awt.Image.SCALE_SMOOTH);
		test = new ImageIcon(m1);
		jlsofa.setIcon(asd);
		jlsofa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				jlMouseDragged1(evt);
			}
		});
		jlsofa.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jlMousePressed1(evt);
			}
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jlMouseClicked1(evt);
			}
		});
		p.add(jlsofa);
		/////////-----------------------------------------------------
	*/
	f.getContentPane().add(p, BorderLayout.CENTER );
	f.setVisible(true);
	}
	 public static void jlMouseDragged(java.awt.event.MouseEvent evt) {
		 int x = evt.getXOnScreen();
		 int y = evt.getYOnScreen();
		 x2 = x;
		 y2 = y;
		 jl.setLocation(x-xmouse, y-ymouse);
	 }
	 public static void jlMousePressed(java.awt.event.MouseEvent evt) {
		 xmouse = evt.getX();
		 ymouse = evt.getY();
	 }
	 public static void jlMouseClicked(java.awt.event.MouseEvent evt) {
		 Border empty = BorderFactory.createEmptyBorder();
	 }
	 /*
	 public static void jlMouseDragged1(java.awt.event.MouseEvent evt) {
		 int x = evt.getXOnScreen();
		 int y = evt.getYOnScreen();
		 x2 = x;
		 y2 = y;
		 jlsofa.setLocation(x-xmouse, y-ymouse);
	 }
	 public static void jlMousePressed1(java.awt.event.MouseEvent evt) {
		 xmouse = evt.getX();
		 ymouse = evt.getY();
	 }
	 public static void jlMouseClicked1(java.awt.event.MouseEvent evt) {
		 Border empty = BorderFactory.createEmptyBorder();
	 }
	 */
}
