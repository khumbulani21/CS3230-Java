//package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Bamboo   {

	private int x;
	private int y;
	private Color color;

	public void draw(Graphics g)
	{
		Graphics2D g2=(Graphics2D)g;
		  Polygon SIDE5; int[] x2 = {35,35,45,45 }; int[] y2 = { 210,100,100,210 };
		  
		  //int[] a3 = { 10, 110,100, 0 }; //int[] b3 = { 110, 110, 120, 120};
		  SIDE5 = new Polygon(x2, y2, 4);
		  
		  g2.fillPolygon(SIDE5);
		  
		  //add arcs 50 apart and center of rectangle twice the size of width of
		 g2.fillArc(30, 100, 20, 20, 0, 180); g2.fillArc(30, 150, 20, 20, 0, 180);
		 g2.fillArc(30, 200, 20, 20, 0, 180); 
		 	
	}

}
