//package lab3;

import java.util.HashMap;

public class CharacterTile extends Tile{
protected char symbol;

//static hashmap
public static HashMap<Character, Character>  map=new 	HashMap<Character, Character>();
static 
{
	//In a static initializer block, add all the English to Chinese character mappings
	
	map.put('1', '\u4E00');
	map.put('2', '\u4E8C');
	map.put('3', '\u4E09');
	map.put('4', '\u56DB');
	map.put('5', '\u4E94');
	map.put('6', '\u516B');
	map.put('7', '\u4E03');
	map.put('8', '\u516B');
	map.put('9', '\u4E5D');
	map.put('N', '\u5317');
	map.put('E', '\u6771');
	map.put('W', '\u897F');
	map.put('S', '\u5357');
	map.put('C', '\u4E2D');
	map.put('F', '\u767C');
	 
	
	
}



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




//Create a method public String toChinese() that returns the Chinese character that corresponds to the tile's symbol or English character.
public String toChinese() 
{
	System.out.println(map);
	String chinese = Character.toString(map.get(symbol));
	return chinese;
	
}
}
