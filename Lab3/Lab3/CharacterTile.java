//package lab3;

public class CharacterTile extends Tile{
protected char symbol;

public CharacterTile(char symbol) {

	this.symbol = symbol;
}

@Override
public String toString() {
	String returnString=null;
	switch(symbol)
	{
	case 'N': returnString="North Wind"; break;
	case 'E': returnString="East Wind"; break;
	case 'W': returnString="West Wind"; break;
	case 'S': returnString="South Wind"; break;
	case 'C': returnString="Red Dragon"; break;
	case 'F': returnString="Green Dragon"; break;
	default: returnString= "Character "+symbol;

	}
 return returnString ;
}


public boolean matches(Tile other)
{
	boolean matched=super.matches(other);
	CharacterTile o= (CharacterTile)other;
	//The CharacterTile class: is true if the Tile matches method returns true AND if the symbols are equal;
	//it is false otherwise
	if(matched  && this.symbol==o.symbol)
	{
		return true;
	}
	return false;
	
}


}
