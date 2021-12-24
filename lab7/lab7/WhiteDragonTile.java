//package lab6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class WhiteDragonTile extends Tile{
	public WhiteDragonTile()
	{
		setToolTipText("White Dragon");
	}

	@Override
	public String toString() {
		ArrayList<String> list = new ArrayList<>();
		HashMap<Character, Character> map = new HashMap<>();
		map.put('N', '\u5317');
		return "White Dragon";
	}
	/*
	 * public static void main(String[] args) { JFrame frame = new JFrame(); JPanel
	 * tiles = new JPanel(); JScrollPane scroller = new JScrollPane(tiles);
	 * 
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * frame.setTitle("Character Tiles"); frame.add(scroller);
	 * 
	 * // Try something like this if your tiles don't fit on the screen. // Replace
	 * "tile width" and "tile height" with your values.
	 * //scroller.setPreferredSize(new Dimension(8 * tile width, 40 + tile height));
	 * 
	 * tiles.add(new WhiteDragonTile());
	 * 
	 * frame.pack(); frame.setVisible(true); }
	 */
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.blue);
		int side=Tile.getSideWidth();
		
		
		int topX= side*3;
		
		
		int wid=(Tile.getFace().width-side*2);
		int topWidth= wid+topX;
		int bottomYcord=side+wid;
		int sizeOfShade= wid/6;
	
		int smallsideWidth=Tile.getSideWidth();
		
		//top side
		System.out.println("a "+wid);
		int[] xTop = {topX ,topWidth,topWidth,topX };
		int[] topY = {side,side,2*side,2*side };
		Polygon	topSide = new Polygon(xTop, topY, 4);
		g2.drawPolygon(topSide);
		
		
		
		///////////////////////////// TOP POLYGON
		int[] xTopShade = {topX ,topX,topX+sizeOfShade,topX+sizeOfShade };
		int[] topYShade = {side,2*side,2*side,side };
		///
		int[] bottomYShade = {wid  ,  bottomYcord    ,bottomYcord   , wid  };
		Polygon	topSideShade = new Polygon(xTopShade, topYShade, 4);
		
		g2.fillPolygon(topSideShade);
		Polygon	bottomSideShade = new Polygon(xTopShade, bottomYShade, 4);
		g2.fillPolygon(bottomSideShade);
		
		int[] xTopShade2 = {topX+(2*sizeOfShade) ,topX+(2*sizeOfShade),topX+(3*sizeOfShade),topX+(3*sizeOfShade) };
		int[] topYShade2 = {side,2*side,2*side,side };
		///
		int[] bottomYShade2 = {wid  ,  bottomYcord    ,bottomYcord   , wid  };
		Polygon	topSideShade2 = new Polygon(xTopShade2, topYShade2, 4);
		
		g2.fillPolygon(topSideShade2);
		Polygon	bottomSideShade2 = new Polygon(xTopShade2, bottomYShade2, 4);
		g2.fillPolygon(bottomSideShade2);
		
		
		int[] xTopShade3 = {topX+(4*sizeOfShade) ,topX+(4*sizeOfShade) ,topX+(5*sizeOfShade),topX+(5*sizeOfShade)};
		int[] topYShade3 = {side,2*side,2*side,side };
		/////
		int[] bottomYShade3 = {wid  ,  bottomYcord    ,bottomYcord   , wid  };
		Polygon	topSideShade3 = new Polygon(xTopShade3, topYShade3, 4);
		g2.fillPolygon(topSideShade3);
		Polygon	bottomSideShade3 = new Polygon(xTopShade3, bottomYShade3, 4);
		g2.fillPolygon(bottomSideShade3);
		//////////////////////////////
		//LEFT SIDE 
		int[] xLeftShade = {topX ,topX                       ,topX+side            ,topX+side };
		int[] leftYShade = {2*side+sizeOfShade,  2*side+(2*sizeOfShade)   ,     2*side+(2*sizeOfShade)     ,2*side+sizeOfShade };
		///
		int[] leftYShade2 = {2*side+(3*sizeOfShade),  2*side+(4*sizeOfShade)   ,     2*side+(4*sizeOfShade)     ,2*side+(3*sizeOfShade) };
		Polygon	leftSideShade = new Polygon(xLeftShade, leftYShade, 4);
		
		g2.fillPolygon(leftSideShade);
		Polygon	leftSideShade2 = new Polygon(xLeftShade, leftYShade2, 4);
		g2.fillPolygon(leftSideShade2);
		
		///RIGHT SIDE
		int[] xRightShade = {topWidth-side ,topWidth-side                        ,topWidth          ,topWidth};
		int[] rightYShade = {2*side+sizeOfShade,  2*side+(2*sizeOfShade)   ,     2*side+(2*sizeOfShade)     ,2*side+sizeOfShade };
		///
		int[] rightYShade2 = {2*side+(3*sizeOfShade),  2*side+(4*sizeOfShade)   ,     2*side+(4*sizeOfShade)     ,2*side+(3*sizeOfShade) };
		Polygon	rightSideShade = new Polygon(xRightShade, rightYShade, 4);
		
		g2.fillPolygon(rightSideShade);
		Polygon	rightSideShade2 = new Polygon(xRightShade, rightYShade2, 4);
		g2.fillPolygon(rightSideShade2);
		
		
		
		
		
		
		
		
		//bottom side
		int[] bottomX = {topX, topWidth		,topWidth     ,topX };
		int[] bottomY = {wid  ,wid      ,bottomYcord   , bottomYcord  };
		Polygon	bottomSide = new Polygon(bottomX, bottomY, 4);
		g2.drawPolygon(bottomSide);

		//left side
		int[] leftX = {topX, topX+side		,topX+side     ,topX };
		int[] leftY = {side  ,side      ,bottomYcord   , bottomYcord  };
		Polygon	leftSide = new Polygon(leftX, leftY, 4);
		g2.drawPolygon(leftSide);
		
		//right side
		int[] rightX = {topWidth-side, topWidth		,topWidth     ,topWidth-side };
		int[] rightY = {2*side  ,2*side      ,bottomYcord-side   , bottomYcord-side  };
		Polygon	rightSide = new Polygon(rightX, rightY, 4);
		g2.drawPolygon(rightSide);
		
		
	
		
		

	}
	
	
}
