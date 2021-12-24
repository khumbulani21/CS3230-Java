//package lab6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import lab6.BambooTile.Bamboo;

public class CircleTile extends RankTile{
private  List<Circle> circles;





static
{
	//side and width of a tile
	
	
	
	
}

	public CircleTile(int rank)
	{
		
		super(rank);
		setToolTipText(toString());

		//for 2 circles tilewidths is 
		int valFor2=(tileWidth/3);
		int xFor2= (diameter+tileWidth/3)-radius;
	 
		
		int quarterOfTileWidth=(tileWidth/4);
		System.out.println(" width "+tileWidth);
		int y4=tileWidth/5;
		//bottom 
		int thirdOfWidth= (wid)/3;
		int startingX=(smallPolygonWidth*2)+thirdOfWidth;
		int startingYb=(wid/2)+radius;
		int y7u=(wid/2)/4;
		int valueOfX=(wid/4);
		int x7u=(smallPolygonWidth*2)+valueOfX;
		
		
		circles=new ArrayList<>();
		
		if(rank==1)
		{
			
		}
		//Circle one= new Circle(smallPolygonWidth*3, smallPolygonWidth, Color.green, wid);
		
		
		switch(rank)
		{
		case 1:
			
			Circle one= new Circle(smallPolygonWidth*2+(tileWidth/2), (tileWidth/2), Color.green, wid,false);
		
			Circle smallCircle= new Circle((smallPolygonWidth*2)+(tileWidth/2), (tileWidth/2), Color.red, diameter,true);
			circles.add(one);
			circles.add(smallCircle);
			break;
		  case 4: 
			  Circle fourA= new Circle( xFor2, xFor2+valFor2 , Color.green, diameter,true);
				Circle fourB= new Circle(xFor2+valFor2,(tileWidth/3)-radius  , Color.blue, diameter,true);
				Circle fourC= new Circle(xFor2, (tileWidth/3)-radius, Color.green, diameter,true);
				Circle fourD= new Circle(  xFor2+valFor2,xFor2+valFor2, Color.blue, diameter,true);
				circles.add(fourA);
				circles.add(fourB);
				circles.add(fourC);
				circles.add(fourD);
			  break;
		  
		  case 2:
			Circle twoA= new Circle(smallPolygonWidth*2+(tileWidth/2), (tileWidth/3)-radius, Color.green, diameter,true);
			Circle twoB= new Circle(smallPolygonWidth*2+(tileWidth/2), xFor2+valFor2, Color.green, diameter,true);
			
			circles.add(twoA);
			circles.add(twoB);
		  
		  
		  break; 
		  case 5: //top left
			  
				Circle fiveA= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth), quarterOfTileWidth, Color.green, diameter,true);
				Circle fiveB= new Circle((smallPolygonWidth*2)+quarterOfTileWidth, 3*quarterOfTileWidth, Color.green, diameter,true);
				circles.add(fiveA);
				circles.add(fiveB);
			  
		 
	
	
		  case 3: //top left
			  
			  Circle threeA= new Circle((smallPolygonWidth*2)+quarterOfTileWidth ,quarterOfTileWidth  , Color.blue, diameter,true);
				Circle threeB= new Circle( (smallPolygonWidth*2)+(2*quarterOfTileWidth), 2*quarterOfTileWidth , Color.red, diameter,true);
				Circle threeC= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth)  , 3*quarterOfTileWidth , Color.green, diameter,true);
				circles.add(threeA);
				circles.add(threeB);
				circles.add(threeC);
	 
		  break;
		  
		  
		  case 6: //top left 
			  
			  Circle sixA= new Circle((smallPolygonWidth*2)+quarterOfTileWidth,  quarterOfTileWidth, Color.green, diameter,true);
				Circle sixB= new Circle((smallPolygonWidth*2)+(quarterOfTileWidth),2* quarterOfTileWidth,Color.green, diameter,true); 
				Circle sixC= new Circle((smallPolygonWidth*2)+quarterOfTileWidth, 3*quarterOfTileWidth, Color.green, diameter,true);
				
				  Circle sixD= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth), quarterOfTileWidth,Color.green, diameter,true);
					Circle sixE= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth),2*quarterOfTileWidth, Color.green, diameter,true);
					Circle sixF= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth), 3*quarterOfTileWidth, Color.green, diameter,true);
					circles.add(sixA);
					circles.add(sixB);
					circles.add(sixC);
		 
					circles.add(sixD);
					circles.add(sixE);
					circles.add(sixF);
		  

			  break;
		  
		  case 7: //top left
		  
			  Circle sevenA= new Circle(x7u, y7u, Color.green, diameter,true); //center g.fillOval(x7u+valueOfX,2*y7u,Color.green, diameter,true);
				Circle sevenB= new Circle(x7u+valueOfX, 2*y7u, Color.green, diameter,true);; 
				Circle sevenC= new Circle(x7u+(2*valueOfX), 3*y7u, Color.green, diameter,true);
				
				  Circle sevenD= new Circle(startingX, startingYb, Color.red, diameter,true); 
					Circle sevenE= new Circle(startingX, startingYb+thirdOfWidth, Color.red, diameter,true);
					Circle sevenF= new Circle(startingX+thirdOfWidth, startingYb, Color.red, diameter,true);
					Circle sevenG= new Circle(startingX+thirdOfWidth, startingYb+thirdOfWidth,Color.red, diameter,true);
					circles.add(sevenA);
					circles.add(sevenB);
					circles.add(sevenC);
		 
					circles.add(sevenD);
					circles.add(sevenE);
					circles.add(sevenF); 
					circles.add(sevenG); 
				 
	 
		  
		  break;
		  
		  case 8: //top left
			  
			  
			  
			  	Circle circle1= new Circle((smallPolygonWidth*2)+y4, y4, Color.red, diameter,true); 
				Circle circle2= new Circle((smallPolygonWidth*2)+y4, 2*y4, Color.red, diameter,true); 
				Circle circle3= new Circle((smallPolygonWidth*2)+y4, 3*y4, Color.red, diameter,true);
				 Circle circle4= new Circle((smallPolygonWidth*2)+y4, 4*y4, Color.red, diameter,true);
				 
				 
					Circle circle5= new Circle((smallPolygonWidth*2)+(3*y4), 4*y4, Color.red, diameter,true);  
					Circle circle6= new Circle((smallPolygonWidth*2)+(3*y4), y4, Color.red, diameter,true);
					Circle circle7= new Circle((smallPolygonWidth*2)+(3*y4), 2*y4, Color.red, diameter,true);
					Circle circle8= new Circle((smallPolygonWidth*2)+(3*y4), 3*y4, Color.red, diameter,true);
					circles.add(circle1);
					circles.add(circle2);
					circles.add(circle3);
		 
					circles.add(circle4);
					circles.add(circle5);
					circles.add(circle6); 
					circles.add(circle7); 
					circles.add(circle8); 
			  
			 
		 
		  
	 
		break;
		//  
		  case 9: //top left
			  
			  Circle nineA= new Circle((smallPolygonWidth*2)+quarterOfTileWidth-radius, quarterOfTileWidth, Color.red, diameter,true);
				Circle nineB= new Circle((smallPolygonWidth*2)+quarterOfTileWidth-radius, 2*quarterOfTileWidth,Color.red, diameter,true);
				Circle nineC= new Circle((smallPolygonWidth*2)+quarterOfTileWidth-radius, 3*quarterOfTileWidth, Color.red, diameter,true);
				 Circle nineD= new Circle((smallPolygonWidth*2)+(2*quarterOfTileWidth)-radius, quarterOfTileWidth, Color.red, diameter,true);
				 
				 
					Circle nineE= new Circle((smallPolygonWidth*2)+(2*quarterOfTileWidth)-radius, 2*quarterOfTileWidth, Color.red, diameter,true); 
					Circle nineF= new Circle((smallPolygonWidth*2)+(2*quarterOfTileWidth)-radius,3*quarterOfTileWidth, Color.red, diameter,true);
					Circle nineG= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth)-radius,  quarterOfTileWidth, Color.red, diameter,true);
					Circle nineH= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth)-radius,2*quarterOfTileWidth, Color.red, diameter,true);
					Circle nineI= new Circle((smallPolygonWidth*2)+(3*quarterOfTileWidth)-radius, 3*quarterOfTileWidth, Color.red, diameter,true); 
					circles.add(nineA);
					circles.add(nineB);
					circles.add(nineC);
		 
					circles.add(nineD);
					circles.add(nineE);
					circles.add(nineF); 
					circles.add(nineG); 
					circles.add(nineH); 
					circles.add(nineI); 
	 
		  break;
		  
		  
		  default :System.err.println("value is out of bounds"); break; }
		 
		
		 
		
	}

	@Override
	public String toString() {
		 
		return "Circle "+ this.rank ;
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	 
		
		super.paintComponent(g);

		for (Circle c : circles)
			if (c != null)
				c.draw(g);
		
	
	
	}
	
	public void drawCircles(Graphics g, int rank)
	{
		
		int valFor2=(tileWidth/3);
		int xFor2= (diameter+tileWidth/3)-radius;
	 
		
		int quarterOfTileWidth=(tileWidth/4);
		int y4=tileWidth/5;
		//bottom 
		int thirdOfWidth= (wid)/3;
		int startingX=(smallPolygonWidth*2)+thirdOfWidth;
		int startingYb=(wid/2)+radius;
		int y7u=(wid/2)/4;
		int valueOfX=(wid/4);
		int x7u=(smallPolygonWidth*2)+valueOfX;
		
		
		
		g.setColor(Color.RED);
		switch( rank)
		{
		
		case 1: 
			
			
			g.fillOval(smallPolygonWidth*3, smallPolygonWidth, wid, wid);
			g.setColor(Color.green);
			g.fillOval(tileWidth/2, tileWidth/2, diameter, diameter);
			break;
		case 4:  
		
			g.fillOval(xFor2, xFor2+valFor2, diameter, diameter);
		
			g.fillOval(xFor2+valFor2, (tileWidth/3)-radius, diameter, diameter);
		
			g.fillOval(xFor2, (tileWidth/3)-radius, diameter, diameter);
			
			g.fillOval(xFor2+valFor2, xFor2+valFor2, diameter, diameter);
		break;
			 
		case 2:  
			//top left
			g.fillOval(smallPolygonWidth*2+(tileWidth/2), (tileWidth/3)-radius, diameter, diameter);
			//bottom right
			g.fillOval(xFor2, xFor2+valFor2, diameter, diameter);
		
	
			break;
		case 5:  
			//top left
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth), quarterOfTileWidth, diameter, diameter);
			//center
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth, 3*quarterOfTileWidth, diameter, diameter);
		case 3:  
			//top left
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth, quarterOfTileWidth, diameter, diameter);
			//center
			g.fillOval((smallPolygonWidth*2)+(2*quarterOfTileWidth), 2*quarterOfTileWidth, diameter, diameter);
			
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth), 3*quarterOfTileWidth, diameter, diameter);
			break;
		
		
		case 6:  
			//top left
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth, quarterOfTileWidth, diameter, diameter);
			//center
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth, 2*quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth, 3*quarterOfTileWidth, diameter, diameter);
			
			
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth), quarterOfTileWidth, diameter, diameter);
			//center
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth), 2*quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth), 3*quarterOfTileWidth, diameter, diameter);
			break;
			
		case 7:  
			//top left
			
			
			g.fillOval(x7u, y7u, diameter, diameter);
			//center
			g.fillOval(x7u+valueOfX, 2*y7u, diameter, diameter);
			g.fillOval(x7u+(2*valueOfX), 3*y7u, diameter, diameter);
			
				
				
				 g.fillOval(startingX, startingYb, diameter, diameter); //center
				 g.fillOval(startingX, startingYb+thirdOfWidth, diameter, diameter);
				 g.fillOval(startingX+thirdOfWidth, startingYb, diameter, diameter);
				 g.fillOval(startingX+thirdOfWidth, startingYb+thirdOfWidth, diameter, diameter);
				
				 
			break;
			
		case 8:  
			//top left
			g.fillOval((smallPolygonWidth*2)+y4, y4, diameter, diameter);
			//center
			g.fillOval((smallPolygonWidth*2)+y4, 2*y4, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+y4, 3*y4, diameter, diameter);
			
			
			g.fillOval((smallPolygonWidth*2)+y4, 4*y4, diameter, diameter);


			g.fillOval((smallPolygonWidth*2)+(3*y4), y4, diameter, diameter);
			//center
			g.fillOval((smallPolygonWidth*2)+(3*y4), 2*y4, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+(3*y4), 3*y4, diameter, diameter);
			
			
			g.fillOval((smallPolygonWidth*2)+(3*y4), 4*y4, diameter, diameter);
			break;
			
		case 9:  
			//top left
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth-radius, quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth-radius, 2* quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+quarterOfTileWidth-radius, 3*quarterOfTileWidth, diameter, diameter);
			//center-radius
			g.fillOval((smallPolygonWidth*2)+(2*quarterOfTileWidth)-radius, quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+(2*quarterOfTileWidth)-radius, 2*quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+(2*quarterOfTileWidth)-radius, 3*quarterOfTileWidth, diameter, diameter);
			
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth)-radius, quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth)-radius, 2*quarterOfTileWidth, diameter, diameter);
			g.fillOval((smallPolygonWidth*2)+(3*quarterOfTileWidth)-radius, 3*quarterOfTileWidth, diameter, diameter);
			break;
		
			
		default :System.err.println("value is out of bounds");
		break;
		}
	}
	public class Circle   {

		private int x;
		private int y;
		private Color color;
		private int diameter;
		private int radius;
		private boolean hasLine;
		public Circle(int x, int y, Color color,int diameter,boolean hasLine) {
			super();
			
			this.color = color;
			this.diameter=diameter;
			radius=diameter/2;
			this.x = x-radius;
			this.y = y-radius;
			this.hasLine=hasLine;
		}

		public void  draw(Graphics g)
		{
		g.setColor(color);
		
		
		g.fillOval(x, y, diameter, diameter);
	 
		if(hasLine)
		{
			g.setColor(Color.black);
			g.drawLine( radius+x, y, radius+x,y+diameter);
			g.drawLine( x, y+radius, x+diameter,y+radius);
		}
			
		}

	}
	
	
	/*
	 * public class Pancake extends Circle{
	 * 
	 * 
	 * 
	 * public void draw(Graphics g) {
	 * 
	 * } }
	 */
	/*
	 * public static void main(String[] args) { JFrame frame = new JFrame();
	 * 
	 * frame.setLayout(new FlowLayout());
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * frame.setTitle("Circle Tiles");
	 * 
	 * frame.add(new CircleTile(1)); frame.add(new CircleTile(2)); frame.add(new
	 * CircleTile(3)); frame.add(new CircleTile(4)); frame.add(new CircleTile(5));
	 * frame.add(new CircleTile(6)); frame.add(new CircleTile(7)); frame.add(new
	 * CircleTile(8)); frame.add(new CircleTile(9));
	 * 
	 * frame.pack(); frame.setVisible(true); }
	 */
}
