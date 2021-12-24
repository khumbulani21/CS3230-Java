//package lab6;

 
import java.awt.Color;
 
import java.awt.Dimension;
 
import java.awt.Graphics;
import java.awt.Image;
 
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
 
import javax.swing.border.Border;

public class MahJongBoard extends JPanel implements MouseListener {
	private Fireworks reward;
	private boolean sound;
	
	private MahJong game;
	private MahJongModel model;
	public static int score=0;;
	private Tile first;
	private Tile second;
	private	Border			normal = BorderFactory.createLineBorder(Color.BLACK);	// border of unselected puzzle piece
	private	Border			selected = BorderFactory.createLineBorder(Color.RED);
	JScrollPane jpane= new JScrollPane();
	
	private	Stack<Tile>	undoStack = new Stack<Tile>();

	
	
	public Stack<Tile> getUndoStack() {
		return undoStack;
	}
	private PlayClip clip = new PlayClip("audio/stone-scraping.wav", true);
	

	public MahJongModel getModel() {
		return model;
	}


	public MahJongBoard(MahJong game,long shuffleNumber) {
		this.game = game;
		model = new MahJongModel(this,shuffleNumber);
		 sound=true;
		setLayout(null);
	
		Dimension maxSize= new Dimension(1000,1000);
		
	
			setPreferredSize(maxSize);
			//setSize(maxSize);
			
			//draw top tile
			Tile t=model.getSpecialTile(0);
			t.addMouseListener(this);
			int	 x =(Tile.WID*12)/2+(5 * Tile.WID + 4 * Tile.EDGE)+(Tile.WID/2);
			int  y =(3 * Tile.HEI - 4 * Tile.EDGE)+Tile.HEI/2 ;
			 t.setLocation(x, y);
			 add(t);
			
		for(int layer=model.getTilesX().length-1;layer>=0;layer--)
		{
			 
			  for(int row=model.getTilesX()[layer].length-1;row>=0;row--)
			  {
				 
				  for(int col=0;col<model.getTilesX()[layer][row].length;col++)
				  {
					  //add left most tile
						
						  if(row==4&&col==0) {
						   Tile leftMostTile=model.getSpecialTile(3);
						  //System.out.println("very special tile"+model.getSpecialTile(2)); 
						  x=(Tile.WID*12)/2+(-1 * Tile.WID );
						   y =(3 * Tile.HEI )+Tile.HEI -Tile.HEI/2;
						  leftMostTile.addMouseListener(this); 
						  leftMostTile.setLocation(x, y);
						  add(leftMostTile); }
						 
					  //System.out.println("layer "+layer+ "row "+row+ "col "+col);
					 t=model.getTile(layer, row, col);
						 x =(Tile.WID*12)/2+(col * Tile.WID + layer * Tile.EDGE);
					  y =(row * Tile.HEI - layer * Tile.EDGE) ;
					
				
					//add mouse listener
					if(t!=null)
					{
						
						t.addMouseListener(this);
						 t.setLocation(x, y);
						 add(t);
						
					}
					else
					{
					
						continue;
					}
					  if(row==3&&col==11)
						{
						  //add second rightmost tile
							 t=model.getSpecialTile(1);
								
								 x =(Tile.WID*12)/2+(12 * Tile.WID );
								  y =(3 * Tile.HEI )+Tile.HEI/2 ;
								  t.addMouseListener(this);
									 t.setLocation(x, y);
									 add(t);
									 //add rightmost tile
									 t=model.getSpecialTile(2);
										
									 x =(Tile.WID*12)/2+(13 * Tile.WID );
									  y =(3 * Tile.HEI )+Tile.HEI/2 ;
									  t.addMouseListener(this);
										 t.setLocation(x, y);
										 add(t);
									 continue;
								
						}
					  }
			  } 
		}
 
	 
	}
/*
	 * public static void main(String[] args) { JFrame frame= new JFrame();
	 * MahJongBoard mj= new MahJongBoard(null);
	 * 
	 * 
	 * }
	 */

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// MahJongBoard should have a paintComponent method - all it does is draw the
		// background image.
		Image image = Toolkit.getDefaultToolkit().getImage("images/dragon_bg.png");	
		int startingX=(Tile.WID*12)/2;
		int startingY=(Tile.WID*8)/2;
		g.drawImage(image, 0, 0, this.getWidth(), getHeight(), null);
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// get the clicked Tile 
		Tile temp=(Tile)e.getSource();	
		if (first == null)							// select the clicked puzzle piece
		{
			//check if tile is open first
			if(model.isTileOpen(temp))
			{
				first = temp;
			 
				first.setBorder(selected);
			}
			
			return;
		}
		else if (temp == first)							// deselect the clicked tile piece if clicked for second time by removing border
		{
			first.setBorder(null);
			first = null;
			return;
		}

		second = temp;		
		//check if tiles match
		if(first.matches(second))
		{
			
			//remove tiles
			first.setBorder(null);
			second.setBorder(null);
			first.setOnBoard(false);
			second.setOnBoard(false);
			
			
			second.setZOrder();
			remove(second);
			first.setZOrder();
			remove(first);
			//for jpane
			addToUndo(first, second);
			first = null;
			second =null;
			if(clip!=null)
			{
				clip.play();
			}
			MahJongBoard.score=MahJongBoard.score+2;
			startReward();
			
			repaint();
			
			return;
		}
		else
		{
			first.setBorder(null);
			second.setBorder(null);
			first = null;
			second =null;
			
			
		}
	 score=score+2;
		validate();							 
 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	 

	public void addToUndo(Tile t1, Tile t2)
	{
		undoStack.push(t1);
		undoStack.push(t2);
	

	}

	public void setModel(MahJongModel model) {
		this.model = model;
	}
	public PlayClip getClip() {
		return clip;
	}

	public void setClip(PlayClip clip) {
		this.clip = clip;
	}

	public MahJongBoard(MahJong game)
	{
		this(  game,0);
	}

	 private void startReward() { 
		  if (MahJongBoard.score < 2) return;
	 
		  reward = new Fireworks(this); 
		  reward.setSound(sound);
		  reward.fire(); 
		  }
	 public boolean isSound() {
			return sound;
		}


		public void setSound(boolean sound) {
			this.sound = sound;
		}
	 
}
