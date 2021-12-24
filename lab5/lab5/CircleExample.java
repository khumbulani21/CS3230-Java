//package lab5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
 

public class CircleExample extends JFrame{

	
	
	public CircleExample() throws HeadlessException {
		setTitle("Hello");
		setSize(400,400);
 //Circle one= new Circle();

		add(new Circle(0, 0, Color.red, 50));
		setVisible(true);
	}

	public static void main(String[] args) {
	 
	new CircleExample();
	}
	
	class Circle extends JPanel{
		private int x;
		private int y;
		private Color color;
	private int diameter;
	private int radius;
		public Circle(int x, int y, Color color,int diameter) {
			super();
			this.x = x;
			this.y = y;
			this.color = color;
			this.diameter=diameter;
			radius=diameter/2;
		}

		public void  paintComponent(Graphics g)
		{
		
		
		
		
			g.setColor(Color.red);
	
			g.fillOval(x, y, diameter, diameter);
			
				//g.fillOval(getWidth()/2, getHeight()/2, diameter, diameter);
				g.setColor(Color.blue);
				g.drawLine( radius+x, y, radius+x,y+diameter);
				g.drawLine( x, y+radius, x+diameter,y+radius);
				g.setColor(Color.black);
				g.fillOval(x+radius-10, y+radius-10, 20, 20);
		
		}

	}

}
