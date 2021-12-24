//package lab6;

import java.awt.*;
import javax.swing.*;

public class Tile extends JPanel{

	

		private static Color khakhi;
		private static Dimension	SIZE;
		private static Polygon		SIDE;
		private static Polygon		SIDE1;
		
		private static Polygon		SIDE2;
		private static Polygon		SIDE3;
		private   int layer;
		private   int row;
		private   int column;
		private boolean isOnBoard=true;
		private int zOrder;
		
		private static Rectangle	FACE;
		private static GradientPaint	GRAD1;
		private static GradientPaint	GRAD2;
		private static GradientPaint	GRAD3;
		
		
		private static GradientPaint	GRAD4;
		private static GradientPaint	GRAD5;
		
		//added in lab 6
		public static final int WID;
		public static final int EDGE;;
		public static final int HEI;
		public Tile()
		{
			//set tile to be tranparent
			setOpaque(false);
			setPreferredSize(SIZE);
			setSize(SIZE) ;
			
			
			
			
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			g.drawPolygon(SIDE);
			g.drawPolygon(SIDE1);
			
			g.drawPolygon(SIDE2);
			g.drawPolygon(SIDE3);
		

			Graphics2D g2 = (Graphics2D)g;

			g2.setPaint(GRAD1);
			g2.fill(SIDE);
			
			g2.setPaint(GRAD2);
			g2.fill(FACE);
			
			g2.setPaint(GRAD3);
			g2.fill(SIDE1);
			
			g2.setPaint(GRAD4);
			g2.fill(SIDE2);
			
			g2.setPaint(GRAD5);
			g2.fill(SIDE3);
			
			g2.setColor(khakhi);
			g2.draw(SIDE);
			
			g2.setColor(khakhi);
			g2.draw(FACE);
			
			g2.setColor(Color.GREEN);
			g2.draw(SIDE1);
			
			g2.setColor(khakhi);
			g2.draw(SIDE2);
			
			g2.setColor(Color.GREEN);
			g2.draw(SIDE3);
		}
	
	static
	{
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
		int wSquare=(screenSize.width)/24;
		
		int wRec= wSquare/10;
	 
		int squareSide=2*wRec+wSquare+1;
		 
		SIZE = new Dimension(squareSide, squareSide);
		int[] x = { wRec, 2* wRec, 2* wRec, wRec };
		int[] y = { wRec, 0, wSquare, wRec+wSquare};
		
	
		SIDE = new Polygon(x, y, 4);

		FACE = new Rectangle(2* wRec, 0, wSquare, wSquare);
		
		
		int[] a = { wRec, wRec, 0, 0 };
		int[] b = { wRec, wRec+wSquare,wRec+ wRec+wSquare, 2* wRec};
		
	
		SIDE1 = new Polygon(a, b, 4);
		
		int[] a2 = { 2* wRec, 2* wRec+wSquare, wRec+wSquare, wRec };
		int[] b2 = { wSquare, wSquare, wRec+wSquare, wRec+wSquare};
	
		SIDE2 = new Polygon(a2, b2, 4);
		int[] a3 = { wRec, wRec+wSquare,wSquare, 0 };
		int[] b3 = { wRec+wSquare, wRec+wSquare, 2* wRec+wSquare, 2* wRec+wSquare};
		
	
		SIDE3 = new Polygon(a3, b3, 4);
		
		//color for face
		khakhi=new Color(205,198,115);
	

		GRAD1 = new GradientPaint(20, 100, Color.WHITE, 120, 0, khakhi);
		GRAD2 = new GradientPaint(10, 110, Color.WHITE, 20, 0, khakhi);
		GRAD3 = new GradientPaint(0, 120, Color.WHITE, 10, 10, Color.GREEN);
		
		GRAD4 = new GradientPaint(10, 110, Color.WHITE, 120, 100, khakhi);
		GRAD5 = new GradientPaint(0, 120, Color.WHITE, 110, 110, Color.GREEN);
		
		EDGE=FACE.width/5;
		WID=FACE.width;
		HEI=FACE.height;
	}
	
	
	/*
	 * public static void main(String[] args) { JFrame frame = new JFrame();
	 * 
	 * frame.setLayout(new FlowLayout());
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setTitle("Tile");
	 * 
	 * frame.add(new Tile());
	 * 
	 * frame.pack(); frame.setVisible(true); }
	 * 
	 */
	
	
	
	
	
	
	
	
	
	public static int getSideWidth()
	{
		return FACE.width/10;
		
	}
	
	
	
	public static Rectangle getFace()
	{
		return FACE;
	}
	
	
	
	public boolean matches(Tile other)
	{
		//is false if the argument is null
		if(other==null)
		{
			return false;
		}
		//is false if this object and the argument are the same object
		else if(this==other)
		{
			return false;
		}
		//is true if both objects are instances of the same class (strict test, so use "getClass"); 
		//it is falseotherwise
		else if(this.getClass()==other.getClass())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void setLayer(int layer)
	{
		this.layer= layer;
	}
	public void setRow(int row)
	{
		this.row= row;
	}
	public void setColumn(int column)
	{
		this.column= column;
	}
	public void setOnBoard(boolean isOnBoard)
	{
		this.isOnBoard= isOnBoard;
	}
	public int getLayer()
	{
		return layer;
	}
	public int getRow()
	{
		return row;
	}
	public int getColumn()
	{
		return column;
	}
	public boolean isOnBoard()
	{
		return isOnBoard;
		
	}
	public void setZOrder()
	{
		zOrder= getParent().getComponentZOrder(this);
	}
	public void resetZOrder()
	{
		  getParent().setComponentZOrder(this, zOrder);
	}
public int getZOrder()
{
	return zOrder;
	
}
}
