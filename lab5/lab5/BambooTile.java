//package lab5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

 

public class BambooTile extends RankTile {
	private  List<Bamboo> bamboos;
	
	
	public BambooTile(int rank) {
		super(rank);

		setToolTipText(toString());

	
		
		bamboos=new ArrayList<>();
	
		 int x=Tile.getSideWidth()*4+Tile.getSideWidth()/2;
		  int y=(tileWidth/3)/2 ;
		  int height=(tileWidth/3);
		
		switch(rank)
		{
		
		  case 5: //top left
			  
			  Bamboo fiveA= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2),2* (tileWidth/3)/2, Color.green);
		
			  bamboos.add(fiveA);
			
		  case 4:
			 
			  Bamboo fourA= new Bamboo( x,y, Color.green); 
			  Bamboo fourB= new Bamboo(x,y+1+height, Color.blue); 
			  
			  
			  Bamboo fourC= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2, y,Color.green);
			 Bamboo fourD= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2,y+1+height, Color.blue); 
			  bamboos.add(fourA);
			  bamboos.add(fourB);
			  bamboos.add(fourC); 
			  bamboos.add(fourD); 
		  break;
		 
		  case 2:
			Bamboo twoA= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2), (tileWidth/3)/2, Color.green);
			System.out.println("center of face tile "+(Tile.getSideWidth()*2+(tileWidth/2)));
			Bamboo twoB= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2), (tileWidth/3)/2+1+(tileWidth/3), Color.green);
			//System.out.println(smallPolygonWidth*2+(tileWidth/2));
			System.out.println((tileWidth));
			bamboos.add(twoA);
			bamboos.add(twoB);
		  
		  
		  break; 
		
		
		  
		  
		  
		  
		  case 3: //top left
		  
			//  Bamboo threeA= new Bamboo( x,y, Color.green,  diameter); 
			  Bamboo threeB= new Bamboo(x,y+1+height, Color.blue); 
			  
			  
			  Bamboo threeC= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2),y, Color.green);
			  Bamboo threeD= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2,y+1+height, Color.blue);
			  //bamboos.add(threeA);
			  bamboos.add(threeB);
			 bamboos.add(threeC); 
			  bamboos.add(threeD); 
		  
		  break;
		  
		  
		  case 6: //top left
		  
			
			    Bamboo sixA= new Bamboo( x,y, Color.green); 
			    Bamboo sixC= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2, y,Color.green);
			 	Bamboo sixE= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2),y, Color.green);
			  
			  Bamboo sixD= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2,y+2+height, Color.blue); 
			  Bamboo sixF= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2),y+2+height, Color.green);; 
			  Bamboo sixB= new Bamboo(x,y+2+height, Color.blue); 
			  
				  bamboos.add(sixA); 
				  bamboos.add(sixB);
				  bamboos.add(sixC); 
				  bamboos.add(sixD);
				  bamboos.add(sixE);
				  bamboos.add(sixF);
				 
		  break;
		  
		
		  case 8: //top left
		  
		  
			  Bamboo eigthA= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2),0, Color.green);
			  Bamboo eightB= new Bamboo( Tile.getSideWidth()*2+(tileWidth/2)-(Tile.getSideWidth()+Tile.getSideWidth()/2),1+height, Color.green); 
				 Bamboo eightC= new Bamboo( Tile.getSideWidth()*2+(tileWidth/2),2+2*height, Color.green);
				 
				 
				
				  Bamboo eightD= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2, 0,Color.green);
				  //
				 Bamboo eightE = new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2-(Tile.getSideWidth()+Tile.getSideWidth()/2),1+height, Color.blue);
				 Bamboo eightF= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2,2+2*height, Color.blue); 
				 
				 Bamboo eightG= new Bamboo( x,0, Color.green); 
				 Bamboo eightH= new Bamboo( x,2+2*height, Color.green); 
			 
				
				  bamboos.add(eigthA);
				  bamboos.add(eightB);
				  bamboos.add(eightC); 
				 bamboos.add(eightD); 
				  bamboos.add(eightE); 
				 bamboos.add(eightF);
				
				 bamboos.add(eightG); 
				 bamboos.add(eightH); 
				  
		  
		  break; // 
		  case 9: //top left
			  Bamboo nineD= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2, 0,Color.green);
			  Bamboo nineG= new Bamboo( x,0, Color.green); 
				 bamboos.add(nineD); 
				  bamboos.add(nineG); 
		  
		  case 7: 
			  
			  Bamboo sevenA= new Bamboo(Tile.getSideWidth()*2+(tileWidth/2),0, Color.green);
			  
			  Bamboo sevenB= new Bamboo( Tile.getSideWidth()*2+(tileWidth/2),1+height, Color.green); 
				 Bamboo sevenC= new Bamboo( Tile.getSideWidth()*2+(tileWidth/2),2+2*height, Color.green);
				 
				 
				
				  Bamboo sevenD= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2, 0,Color.green);
				  
				 Bamboo sevenE= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2,1+height, Color.blue);
				 Bamboo sevenF= new Bamboo(tileWidth+Tile.getSideWidth()*2 -Tile.getSideWidth()*3+Tile.getSideWidth()/2,2+2*height, Color.blue); 
				 
			
				 
				 Bamboo sevenH= new Bamboo( x,2+2*height, Color.green); 
				 Bamboo sevenI= new Bamboo( x,1+height, Color.green);
				
				 bamboos.add(sevenA);
				  bamboos.add(sevenB);
				  bamboos.add(sevenC); 
				// bamboos.add(sevenD); 
				  bamboos.add(sevenE); 
				 bamboos.add(sevenF);
				
				// bamboos.add(sevenG);

				 bamboos.add(sevenH); 
				  bamboos.add(sevenI); 
		  
		  break;
		  
		 
		  
		  default :System.err.println("value is out of bounds"); break;
		  
		}
		 
		
		
	}

	@Override
	public String toString() {
	 
		return "Bamboo "+ this.rank ;
	}

	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);


		for (Bamboo c : bamboos)
			if (c != null)
			{
				c.draw(g);
				c.toString();
			}
				
		
	
	
	}
	
	
	
	public class Bamboo   {

		private int x;
		private int y;
		private Color color;
		//height of bamboo is 1/3 of tile height
		//thickness is 1/10 of small side
		public Bamboo(int x, int y, Color color) {
			super();
			
			this.color = color;
		
			
			this.x = x;
			this.y = y;
		
		}
		public void draw(Graphics g)
		{
			int tileHeight=Tile.getFace().width/3-2;
			
			
			Graphics2D g2=(Graphics2D)g;
			 g2.setColor(Color.green);
			 
			 
			  Polygon SIDE5; 
			  int[] x2 = {x-Tile.getSideWidth()/2	,x+Tile.getSideWidth()/2	 	,x+Tile.getSideWidth()/2	,x-Tile.getSideWidth()/2 }; 
			  int[] y2 = { y						,y							,y+tileHeight				,y+tileHeight };
			  
			  SIDE5 = new Polygon(x2, y2, 4);
			  
			  g2.fillPolygon(SIDE5);
			  
			  
			 
			  
			  //add arcs 50 apart and center of rectangle twice the size of width of
			 g2.fillArc(x-Tile.getSideWidth()/2-3, y, Tile.getSideWidth()+6, 5, 0, 180); 
			 g2.fillArc(x-Tile.getSideWidth()/2-3,y+ tileHeight/2, Tile.getSideWidth()+6, 5, 0, 180); 
			 g2.fillArc(x-Tile.getSideWidth()/2-3, y+tileHeight-2, Tile.getSideWidth()+6, 5, 0, 180); 
			 
			 
			  
 
			 	
		}

	}

	
	
	 
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bamboo Tiles");

		frame.add(new BambooTile(2));
		frame.add(new BambooTile(3));
		frame.add(new BambooTile(4));
		frame.add(new BambooTile(5));
		frame.add(new BambooTile(6));
		frame.add(new BambooTile(7));
		frame.add(new BambooTile(8));
		frame.add(new BambooTile(9));

		frame.pack();
		frame.setVisible(true);
	}

}
