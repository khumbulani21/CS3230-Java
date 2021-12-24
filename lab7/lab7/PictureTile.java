//package lab6;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PictureTile extends Tile {
	private String name;
	private static	ImageIcon	[]images=new ImageIcon[9];
	private  	Image	image;

	static
	{
		String []names= {"Bamboo","Orchid","Fall","Plum","Spring","Winter","Chrysanthemum","Summer","Sparrow"};
	 
		for (int i = 0; i < names.length; i++)
		{
			URL	 url = PictureTile.class.getResource("images/"+names[i]+".png");	
			images[i] = new ImageIcon(url);
			//images[i]=Toolkit.getDefaultToolkit().getImage(url);
		}
			 
	
	}
	public PictureTile(String name) {
	
		this.name = name;
	
		switch(name)
		{
		case "Bamboo":
			  
				 	image=images[0].getImage();
				break;
		case "Orchid":
			image=images[1].getImage();
			break;
		case "Fall":
			image=images[2].getImage();
			break;
		case "Plum":
			image=images[3].getImage();
			break;
		case "Spring":
			image=images[4].getImage();
			break;
		case "Winter":
			image=images[5].getImage();	
			break;
		case "Chrysanthemum":
			image=images[6].getImage();
			break;
		case "Summer":
			image=images[7].getImage();
			break;
			default :image=images[8].getImage();
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
	
	/*
	 * public static void main(String[] args) { JFrame frame = new JFrame();
	 * 
	 * frame.setLayout(new FlowLayout());
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * frame.setTitle("Picture Tiles");
	 * 
	 * frame.add(new Bamboo1Tile());
	 * 
	 * frame.add(new FlowerTile("Chrysanthemum")); frame.add(new
	 * FlowerTile("Orchid")); frame.add(new FlowerTile("Plum")); frame.add(new
	 * FlowerTile("Bamboo"));
	 * 
	 * frame.add(new SeasonTile("Spring")); frame.add(new SeasonTile("Summer"));
	 * frame.add(new SeasonTile("Fall")); frame.add(new SeasonTile("Winter"));
	 * 
	 * frame.pack(); frame.setVisible(true); }
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.drawImage(image, Tile.getSideWidth()*2, 0, this);						// Use with Image


	}
}
