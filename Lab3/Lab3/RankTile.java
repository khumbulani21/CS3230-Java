//package lab3;

public class RankTile extends Tile{

	protected int rank;
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
