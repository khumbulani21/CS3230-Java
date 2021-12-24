//package lab3;

public class PictureTile extends Tile {
	private String name;

	public PictureTile(String name) {

		this.name = name;
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
	
	
	
}
