//package lab6;

import	java.util.*;


public class TileDeck
{
	private	ArrayList<Tile>	deck = new ArrayList<>(144);

	public TileDeck()
	{
		for (int i = 0; i < 4; i++)
		{
			// CharacterTiles
			for (char c = '1'; c <= '9'; c++)
				getDeck().add(new CharacterTile(c));
			getDeck().add(new CharacterTile('N'));
			getDeck().add(new CharacterTile('E'));
			getDeck().add(new CharacterTile('W'));
			getDeck().add(new CharacterTile('S'));
			getDeck().add(new CharacterTile('C'));
			getDeck().add(new CharacterTile('F'));

			// CircleTiles
			for (int j = 1; j < 10; j++)
				getDeck().add(new CircleTile(j));

			// BambooTiles
			for (int j = 2; j < 10; j++)
				getDeck().add(new BambooTile(j));

			// Special Tiles
			getDeck().add(new WhiteDragonTile());
			getDeck().add(new Bamboo1Tile());
		}

		// FlowerTiles
		getDeck().add(new FlowerTile("Chrysanthemum"));
		getDeck().add(new FlowerTile("Orchid"));
		getDeck().add(new FlowerTile("Plum"));
		getDeck().add(new FlowerTile("Bamboo"));

		// SeasonTiles
		getDeck().add(new SeasonTile("Spring"));
		getDeck().add(new SeasonTile("Summer"));
		getDeck().add(new SeasonTile("Fall"));
		getDeck().add(new SeasonTile("Winter"));
	}
//	Shuffles the deck of tiles randomly
	public void shuffle()
	{
 
		
		Collections.shuffle(getDeck());	
	}
	//Shuffles the deck of tiles based on the "gameNumber." Doing this will allow a player to replay a game represented by a game number
	public void shuffle(long gameNumber)
	{
		Collections.shuffle(deck,new Random(gameNumber));	
		
	}
	
	
	//Removes a tile from the deck and returns it; returns null if the deck is empty.
	//Tiles may be conveniently removed from either the beginning or the end of the deck; 
	//it's more efficient to remove them from the end, but this operation takes place infrequently, so speed is of little concern
	public Tile deal()
	{
		 if(getDeck().isEmpty())
		 {
			 return null;
		 }
		 Tile removedTile =getDeck().remove(getDeck().size()-1);
		return removedTile;
		
	}
	public ArrayList<Tile> getDeck() {
		return deck;
	}
	public void setDeck(ArrayList<Tile> deck) {
		this.deck = deck;
	}
	
}

