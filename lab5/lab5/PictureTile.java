//package lab5;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;

public class PictureTile extends Tile {
	private String name;
	private	Image	image;	
	public PictureTile(String name) {

		this.name = name;
		//	URL url = new URL("images/Bamboo.png");
		switch(name)
		{
		case "Bamboo":
				image = Toolkit.getDefaultToolkit().getImage("images/Bamboo.png");	
				break;
		case "Orchid":
			image = Toolkit.getDefaultToolkit().getImage("images/Orchid.png");	
			break;
		case "Fall":
			image = Toolkit.getDefaultToolkit().getImage("images/Fall.png");	
			break;
		case "Plum":
			image = Toolkit.getDefaultToolkit().getImage("images/Plum.png");	
			break;
		case "Spring":
			image = Toolkit.getDefaultToolkit().getImage("images/Spring.png");	
			break;
		case "Winter":
			image = Toolkit.getDefaultToolkit().getImage("images/Winter.png");	
			break;
		case "Chrysanthemum":
			image = Toolkit.getDefaultToolkit().getImage("images/Chrysanthemum.png");	
			break;
		case "Summer":
			image = Toolkit.getDefaultToolkit().getImage("images/Summer.png");	
			break;
			default :image = Toolkit.getDefaultToolkit().getImage("images/Sparrow.png");
			break;
		}
	
				// Image from Internet
	}

	@Override
	public String toString() {
		String returnString="";
		switch(name)
		{
		case "Chrysanthemum": returnString="Chrysanthemum"; break;
		case "Orchid": returnString="Orchid"; break;
		case "Plum": returnString="Plum"; break;
		case "Bamboo": returnString="Bamboo"; break;
		case "Spring": returnString="Spring"; break;
		case "Summer": returnString="Summer"; break;
		case "Fall": returnString="Fall"; break;
		case "Winter": returnString="Winter"; break;
		}
		return returnString;
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Picture Tiles");

		frame.add(new Bamboo1Tile());

		frame.add(new FlowerTile("Chrysanthemum"));
		frame.add(new FlowerTile("Orchid"));
		frame.add(new FlowerTile("Plum"));
		frame.add(new FlowerTile("Bamboo"));

		frame.add(new SeasonTile("Spring"));
		frame.add(new SeasonTile("Summer"));
		frame.add(new SeasonTile("Fall"));
		frame.add(new SeasonTile("Winter"));

		frame.pack();
		frame.setVisible(true);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.drawImage(image, Tile.getSideWidth()*2, 0, this);						// Use with Image


	}
}
