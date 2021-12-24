//package lab6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

/*MahJong represents the overall game. It is where main is located. I suggest leaving the default BorderLayout intact.
Put the board in the center and use the border locations for controls (lab 7). For this lab, MahJong remains small and simple.*/
public class MahJong extends JFrame {
	
	private JMenuBar	menuBar;
	private MahJongBoard board;
	private long gameNumber;
	//private JPanel jpanelwithscroll= new JPanel();
	
	public MahJong()
	{
		if(gameNumber==0)
		{
			setTitle("MahJong");
		}
		else
		{
			setTitle("MahJong"+"              Game number:    "+gameNumber);
		}
	
	
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu game = makeMenu("Game", 'G');
		JMenu sound = makeMenu("Sound", 'S');
		JMenu move = makeMenu("Move", 'M');
		JMenu help = makeMenu("Help", 'H');
		JMenu numbered = makeMenu("Numbered", 'N');
		menuBar.add(game);
		menuBar.add(sound);
		menuBar.add(move);
		menuBar.add(help);
		JMenuItem undo=makeMenuItem("Undo", "Undo the last move", "ctrl U", 'U', "undo");
		//add menu items
		move.add(undo);
		undo.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ undo(); }

				
			});	
		JMenuItem removed=makeMenuItem("Removed", "Shows all removed tiles", "ctrl R", 'R', "removed");
		//add menu items
		move.add(removed);
		removed.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ removed(); }

				
			});	

		JMenuItem operation=makeMenuItem("Operation", "how to use implementation of game", "ctrl P", 'P', "operation");
		//add menu items
		help.add(operation);
		undo.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ operation(); }

				
			});
		
		
		JMenuItem gameRules=makeMenuItem("Game Rules", "how to play the game", "ctrl P", 'P', "gameRules");
		//add menu items
		help.add(gameRules);
		undo.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ gameRules(); }

				
			});
		JMenuItem play=makeMenuItem("Play", "Start a new game", "ctrl P", 'P', "play");
		//add menu items
		game.add(play);
		play.addActionListener(new ActionListener()
				{ public void actionPerformed(ActionEvent e)
					{ play(); }

				
			});
		JMenuItem restart=makeMenuItem("Restart", "Restart the current game", "ctrl R", 'R', "restart");
		game.add(restart);
		restart.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e)
			{ restart(); }

		
	});
		
	
		
	 
		JMenuItem newNumberedGame=makeMenuItem("Numbered", "New numbered game", "ctrl N", 'N', "numbered");
		numbered.add(newNumberedGame);
		
		newNumberedGame.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e)
			{ numbered(); }

		
		
	});
		
		JMenuItem enterNumber=makeMenuItem("Enter number to play", "Enter a number to start a game", "ctrl X", 'X', "numbered");
		numbered.add(enterNumber);
		game.add(numbered);
		enterNumber.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e)
			{ enterNumber(); }

		
		
	});
		
		
		JMenuItem exit=makeMenuItem("Exit", "Exit the program", "ctrl E", 'E', "exit");
		game.add(exit);
		exit.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e)
			{ exit(); }

		
	});
		JMenuItem on=makeMenuItem("On", "play the tiles removed or fireworks sounds", "ctrl S", 'S', "on");
		sound.add(on);
		on.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e)
			{ on(); }

		
	});
		JMenuItem off=makeMenuItem("Off", "Do not play the tiles removed or fireworks sounds", "ctrl O", 'O', "off");
		sound.add(off);
		off.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e)
			{ off(); }

		
	});
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		 addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent we) {
			    close();
			  }
			});
		
		board = new MahJongBoard(this);
		//
		pack();
		setSize(1500,1500);
		
		
		board.setLocation(100, 100);
		//add(cont);
		add(board);
		
		
		//add(jpane);
		//board.setLocation(100, 100);
		
		setVisible(true);
	}
	public void close()
	{
		if(JOptionPane.showConfirmDialog(this, "Exit Program","Confirm exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		System.exit(0);
	}
	protected void enterNumber() {
		String fiveDnumber=JOptionPane.showInputDialog(this, "Enter a five  digit number");
		
	 
		try
		{
			long number =Long.parseLong(fiveDnumber);
			//create a new board with new model
			System.out.println(number+" numbered game ");
			remove(board);
			board=new MahJongBoard(this,number);
			setTitle(" MahJong      Game number :"+number);
			//board.setModel(new MahJongModel(board,number));
			
			add(board);
			setVisible(true);
			repaint();
		}
		catch(NumberFormatException e)
		{
			 
			enterNumber();
		}
		
		
    	
	}
	protected void gameRules() {
		// TODO Auto-generated method stub
		
	}
	protected void operation() {
		// TODO Auto-generated method stub
		
	}
	protected void undo() {
	//
		if(!board.getUndoStack().isEmpty())
		{
			Tile t1=board.getUndoStack().pop();
			//tile being returned to board set that it is on board
			t1.setOnBoard(true);
			
	
			board.add(t1,t1.getZOrder());
			Tile t2=board.getUndoStack().pop();
			t2.setOnBoard(true);
			board.add(t2,t2.getZOrder());
			MahJongBoard.score=MahJongBoard.score-2;
			repaint();
		}
		
		
	}
	protected void off() {
	 
		board.setClip(null);
		board.setSound(false);
		//currently null
		//reward.setSound(false);
	}
	protected void on() {
		board.setClip(new PlayClip("audio/stone-scraping.wav", true));
		
	}
	protected void exit() {
		
		int result = JOptionPane.showConfirmDialog(this,"Sure? You want to exit the game?", "Exit game",
	               JOptionPane.YES_NO_OPTION,
	               JOptionPane.QUESTION_MESSAGE);
	
	            if(result == JOptionPane.YES_OPTION)
	            {
	            	System.exit(0);
	            }
		
	}
	public void removed()
	{
		
		 JPanel cont= new JPanel();
		  JScrollPane cs = new JScrollPane();
		  
		  cs.setPreferredSize(new Dimension(400,100)); 
		  for(Tile t:board.getUndoStack()) { cont.add(t); }
		  
		  cs.setViewportView(cont);
		 
		 JOptionPane.showMessageDialog(this, cs, "scrolling ", JOptionPane.PLAIN_MESSAGE);
	}
	protected void numbered() {
  
		
		remove(board);
    	//create a new board with new model
		gameNumber=System.currentTimeMillis()%100000;
		//board.setModel(new MahJongModel(board,gameNumber));
		board=new MahJongBoard(this,gameNumber);
		setTitle(" MahJong      Game number :"+gameNumber);
		add(board);
		setVisible(true);
		repaint();
		
	}
	protected void restart() {
	//restart game using undo
	 while(!board.getUndoStack().isEmpty())
	 {
		 undo();
	 }
		
	}
	

	public  void play() {
	int result = JOptionPane.showConfirmDialog(this,"Sure? You want to start a new game?", "Start new game",
	               JOptionPane.YES_NO_OPTION,
	               JOptionPane.QUESTION_MESSAGE);
		//prompt user to continue with starting a new game
	            if(result == JOptionPane.YES_OPTION)
	            {
	            	remove(board);
	            	//create a new board with new model
	        		board.setModel(new MahJongModel(board));
	        		board=new MahJongBoard(this);
	        		add(board);
	        		setVisible(true);
	        		repaint();
	            }
	               
		
		
	}
	private JMenuItem makeMenuItem(String label, String tip, String accelerator, char mnemonic, Object target)
	{
		JMenuItem	menuItem = new JMenuItem(label, mnemonic);
		menuItem.setToolTipText(tip);				// adds tool tip text
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator));

		// sets up event handling: "method" is called when "menuItem" is selected
		 
		return menuItem;
	}
	private JMenu makeMenu(String label, char mnemonic)
	{
		JMenu	menu = new JMenu(label);
		menu.setMnemonic(mnemonic);
		return menu;
	}
	
	
	
	
	public static void main(String[] args) {
		MahJong ma=new MahJong();
	 
		}

}
