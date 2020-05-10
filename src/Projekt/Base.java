package Projekt;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Base extends JPanel{
	public Base() {
		super();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        // walls
        g2.drawLine(300, 30, 300, 790);
        g2.drawLine(300, 30, 700, 30);
        g2.drawLine(750, 30, 790, 30);
        g2.drawLine(790, 30, 790, 790);
        g2.drawLine(300, 790, 790, 790);
        
        // front door door
        g2.drawLine(700, 30, 740, 50);
        //bed room door
        g2.drawLine(450, 370, 430, 400);
        // room door
        g2.drawLine(510, 600, 475, 630);
        // bathRoom door
        g2.drawLine(600, 550, 620, 570);
        // rooms
        g2.drawLine(300, 300, 450, 300);
        g2.drawLine(450, 300, 450, 370);
        g2.drawLine(450, 410, 450, 600);
        g2.drawLine(450, 600, 300, 600);
        g2.drawLine(510, 600, 650, 600);
        g2.drawLine(650, 600, 650, 790);
        g2.drawLine(790, 530, 600, 530);
        g2.drawLine(600, 530, 600, 300);
        g2.drawLine(600, 530, 600, 550);
        g2.drawLine(600, 580, 600, 600);
	}
	
}

