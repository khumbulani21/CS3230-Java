//package lab3;

import java.util.ArrayList;
import java.util.HashMap;

public class WhiteDragonTile extends Tile{

	@Override
	public String toString() {
		ArrayList<String> list = new ArrayList<>();
		HashMap<Character, Character> map = new HashMap<>();
		map.put('N', '\u5317');
		return "White Dragon";
	}

}
