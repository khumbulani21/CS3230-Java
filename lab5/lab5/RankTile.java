//package lab5;

public class RankTile extends Tile{

	protected int rank;
	
	protected static int smallPolygonWidth=Tile.getSideWidth();
	protected static int tileWidth= Tile.getFace().width;
	protected static int wid=(Tile.getFace().width-smallPolygonWidth*2);
	protected static int diameter= smallPolygonWidth*2;
	protected static int radius= diameter/2;
	public RankTile(int rank)
	{
		this.rank=rank;
	}
	//The RankTile class: is true if the Tile matches method returns true AND if the ranks are equal; it is
	//false otherwise
	public boolean matches(Tile other)
	{
		boolean matched=super.matches(other);
		RankTile o= (RankTile)other;
		
		if(matched && this.rank==o.rank)
		{
			return true;
		}
		return false;
		
	} 
	
	
	
	
	
}
