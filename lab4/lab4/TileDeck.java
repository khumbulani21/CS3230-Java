//package lab3;

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
				deck.add(new CharacterTile(c));
			deck.add(new CharacterTile('N'));
			deck.add(new CharacterTile('E'));
			deck.add(new CharacterTile('W'));
			deck.add(new CharacterTile('S'));
			deck.add(new CharacterTile('C'));
			deck.add(new CharacterTile('F'));

			// CircleTiles
			for (int j = 1; j < 10; j++)
				deck.add(new CircleTile(j));

			// BambooTiles
			for (int j = 2; j < 10; j++)
				deck.add(new BambooTile(j));

			// Special Tiles
			deck.add(new WhiteDragonTile());
			deck.add(new Bamboo1Tile());
		}

		// FlowerTiles
		deck.add(new FlowerTile("Chrysanthemum"));
		deck.add(new FlowerTile("Orchid"));
		deck.add(new FlowerTile("Plum"));
		deck.add(new FlowerTile("Bamboo"));

		// SeasonTiles
		deck.add(new SeasonTile("Spring"));
		deck.add(new SeasonTile("Summer"));
		deck.add(new SeasonTile("Fall"));
		deck.add(new SeasonTile("Winter"));
	}
//	Shuffles the deck of tiles randomly
	public void shuffle()
	{
 
		
		Collections.shuffle(deck);	
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
		 if(deck.isEmpty())
		 {
			 return null;
		 }
		 Tile removedTile =deck.remove(deck.size()-1);
		return removedTile;
		
	}
	
}

