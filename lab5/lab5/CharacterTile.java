//package lab5;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CharacterTile extends Tile{
protected char symbol;
protected static  char wan;
protected   static int wanWidth;
//static hashmap
public static HashMap<Character, Character>  map=new 	HashMap<Character, Character>();

static 
{
	//In a static initializer block, add all the English to Chinese character mappings
	
	map.put('1', '\u4E00');
	map.put('2', '\u4E8C');
	map.put('3', '\u4E09');
	map.put('4', '\u56DB');
	map.put('5', '\u4E94');
	map.put('6', '\u516B');
	map.put('7', '\u4E03');
	map.put('8', '\u516B');
	map.put('9', '\u4E5D');
	map.put('N', '\u5317');
	map.put('E', '\u6771');
	map.put('W', '\u897F');
	map.put('S', '\u5357');
	map.put('C', '\u4E2D');
	map.put('F', '\u767C');

	
	
}



public CharacterTile(char symbol) {

	this.symbol = symbol;
	setToolTipText(toString());
	if(Character.isDigit(symbol))
	{
		wan='\u842C';
	}
	
	
}

@Override
public String toString() {
	String returnString=null;
	switch(symbol)
	{
	case 'N': returnString="North Wind"; break;
	case 'E': returnString="East Wind"; break;
	case 'W': returnString="West Wind"; break;
	case 'S': returnString="South Wind"; break;
	case 'C': returnString="Red Dragon"; break;
	case 'F': returnString="Green Dragon"; break;
	default: returnString= "Character "+symbol;

	}
 return returnString ;
}


public boolean matches(Tile other)
{
	boolean matched=super.matches(other);
	CharacterTile o= (CharacterTile)other;
	//The CharacterTile class: is true if the Tile matches method returns true AND if the symbols are equal;
	//it is false otherwise
	if(matched  && this.symbol==o.symbol)
	{
		return true;
	}
	return false;
	
}




//Create a method public String toChinese() that returns the Chinese character that corresponds to the tile's symbol or English character.
public String toChinese() 
{
	System.out.println(map);
	String chinese = Character.toString(map.get(symbol));
	return chinese;
	
}
public void paintComponent(Graphics g)
{
	super.paintComponent(g);
	/*
	 * Draw the indicated character in red in the upper right hand corner. For
	 * numerically ranked tiles, draw the rank in black above the red wan character.
	 * For the wind characters and for the red and green dragon, draw the symbol
	 * full size. Add a tool tip in the constructor to display the tile' s name:
	 * 
	 * setToolTipText(toString());
	 */
	
	 int wanFontSize=Tile.getSideWidth()*5;
	 Font      wanFont = g.getFont().deriveFont((float)wanFontSize);
	 
	 
	 Font      symbolFont = g.getFont().deriveFont(10F);
	 int nFontSize=Tile.getSideWidth()*7;
	
	 Font      nFont = g.getFont().deriveFont((float)nFontSize);
	 g.setFont(wanFont);
	 String chineseCha;
	 FontMetrics fm= g.getFontMetrics();
	 int wid;
	 
	 
	 String wa=Character.toString(wan);
	 int wanWidth= wid=fm.stringWidth(wa);
	 int hei;
	 chineseCha=map.get(symbol).toString();
	 
	//size of two small polygons
	 int sideSize=Tile.getSideWidth();
	 int sideSize2=2*Tile.getSideWidth();
	switch(symbol) {
	  case '1':
		 
			  
			  wid=fm.stringWidth(chineseCha);
			  wid=fm.getHeight();
			  g.setColor(Color.BLACK);
			  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
			  
		
			 g.setColor(Color.RED);
			 //put wan in center of tile
			 System.out.println(Tile.getSideWidth());
		
			 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
			 
			 g.setFont(symbolFont);
			 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
	    break;
	  case '2':
		  
		  g.setColor(Color.BLACK);
			  wid=fm.stringWidth(chineseCha);
			  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
			//draws character at position 90
			 g.setColor(Color.RED);
			 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
			 g.setFont(symbolFont);
			 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
	    break;
	  case '3':
		  	g.setColor(Color.BLACK); 
			
			  wid=fm.stringWidth(chineseCha);
			  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
			  
			 g.setColor(Color.RED);
			//draws character at position 90
			 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
			 
			 g.setFont(symbolFont);
			 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
		    break;
	  case '4':
		  g.setColor(Color.BLACK);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
		  
		 g.setColor(Color.RED);
		//draws character at position 90
		 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
		 
		 g.setFont(symbolFont);
		 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
		    break;
	  case '5':
		  g.setColor(Color.BLACK);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
		  
		 g.setColor(Color.RED);
		//draws character at position 90
		 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
		 
		 g.setFont(symbolFont);
		 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
	    break;
	  case '6':
		  g.setColor(Color.BLACK);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
		  
		 g.setColor(Color.RED);
		//draws character at position 90
		 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
		 
		 g.setFont(symbolFont);
		 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
	    break;
	  case '7':
		  g.setColor(Color.BLACK);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
		  
		 g.setColor(Color.RED);
		//draws character at position 90
		 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
		 
		 g.setFont(symbolFont);
		 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
		    break;
	  case '8':
		  g.setColor(Color.BLACK);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
		  
		 g.setColor(Color.RED);
		//draws character at position 90
		 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
		 
		 g.setFont(symbolFont);
		 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
		    break;
	  case '9':
		  g.setColor(Color.BLACK);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth()+sideSize2)-wid)/2, (4*sideSize));
		  
		 g.setColor(Color.RED);
		//draws character at position 90
		 g.drawString(wa, ((getWidth()+sideSize2)-wanWidth)/2, getHeight()-(4*sideSize));
		 
		 
		 g.setFont(symbolFont);
		 g.drawString(Character.toString(symbol), (getWidth()-15), 10);
	    break;
	  case 'N':
			
		 
		  //draws character at position 90
		
			 int nWidth=fm.stringWidth(wa);
			 //calculate
		  g.setColor(Color.RED);
		  g.setFont(symbolFont);
		  g.drawString(Character.toString(symbol), (getWidth()-15), 10);
			 
		  g.setColor(Color.BLACK);
		  g.setFont(nFont);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth())-wid)/2, getHeight()-(4*sideSize));
		
			 
		
	    break;
	  case 'E':
		   nWidth=fm.stringWidth(wa);
			 //calculate
		  g.setColor(Color.RED);
		  g.setFont(symbolFont);
		  g.drawString(Character.toString(symbol), (getWidth()-15), 10);	
		  
		  
		  g.setColor(Color.BLACK);
		  g.setFont(nFont);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth())-wid)/2, getHeight()-(4*sideSize));
		    break;
	  case 'W':
		  nWidth=fm.stringWidth(wa);
			 //calculate
		  g.setColor(Color.RED);
		  g.setFont(symbolFont);
		  g.drawString(Character.toString(symbol), (getWidth()-15), 10);	
		  
		  
		  g.setColor(Color.BLACK);
		  g.setFont(nFont);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth())-wid)/2, getHeight()-(4*sideSize));
		    break;
	  case 'S':
			
		  nWidth=fm.stringWidth(wa);
			 //calculate
		  g.setColor(Color.RED);
		  g.setFont(symbolFont);
		  g.drawString(Character.toString(symbol), (getWidth()-15), 10);	
		  
		  
		  g.setColor(Color.BLACK);
		  g.setFont(nFont);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth())-wid)/2, getHeight()-(4*sideSize));
	    break;
	  case 'C':
			
		  nWidth=fm.stringWidth(wa);
			 //calculate
		  g.setColor(Color.RED);
		  g.setFont(symbolFont);
		  g.drawString(Character.toString(symbol), (getWidth()-15), 10);	
		  
		  
		  g.setColor(Color.BLACK);
		  g.setFont(nFont);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth())-wid)/2, getHeight()-(4*sideSize));
	    break;
	  case 'F':
			
		  nWidth=fm.stringWidth(wa);
			 //calculate
		  g.setColor(Color.RED);
		  g.setFont(symbolFont);
		  g.drawString(Character.toString(symbol), (getWidth()-15), 10);	
		  
		  
		  g.setColor(Color.BLACK);
		  g.setFont(nFont);
		  wid=fm.stringWidth(chineseCha);
		  g.drawString(chineseCha, ((getWidth())-wid)/2, getHeight()-(4*sideSize));
		    break;
	 
	  default:
	   break;
	}
	
	//g.drawString("khumbulani ", 20, 40);
	
	

}
public static void main(String[] args)
{
	JFrame		frame = new JFrame();
	JPanel		tiles = new JPanel();
	JScrollPane	scroller = new JScrollPane(tiles);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Character Tiles");
	frame.add(scroller);

	// Try something like this if your tiles don't fit on the screen.
	// Replace "tile width" and "tile height" with your values.
	//scroller.setPreferredSize(new Dimension(8 * tile width, 40 + tile height));

	tiles.add(new CharacterTile('1'));
	tiles.add(new CharacterTile('2'));
	tiles.add(new CharacterTile('3'));
	tiles.add(new CharacterTile('4'));
	tiles.add(new CharacterTile('5'));
	tiles.add(new CharacterTile('6'));
	tiles.add(new CharacterTile('7'));
	tiles.add(new CharacterTile('8'));
	tiles.add(new CharacterTile('9'));
	tiles.add(new CharacterTile('N'));
	tiles.add(new CharacterTile('E'));
	tiles.add(new CharacterTile('W'));
	tiles.add(new CharacterTile('S'));
	tiles.add(new CharacterTile('C'));
	tiles.add(new CharacterTile('F'));

	frame.pack();
	frame.setVisible(true);
}

}
