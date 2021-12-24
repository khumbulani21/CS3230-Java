//package lab3;

public class Tile {

	
	
	public boolean matches(Tile other)
	{
		//is false if the argument is null
		if(other==null)
		{
			return false;
		}
		//is false if this object and the argument are the same object
		else if(this==other)
		{
			return false;
		}
		//is true if both objects are instances of the same class (strict test, so use "getClass"); 
		//it is falseotherwise
		else if(this.getClass()==other.getClass())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
}
