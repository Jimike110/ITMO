package mypokemons;

import mymoves.porygon.DreamEater;
import ru.ifmo.se.pokemon.Type;

public class PorygonZ extends Porygon2 {
	public PorygonZ(String name, int level) {
		super(name, level);
		super.setType(Type.NORMAL);
		
		super.setStats(85, 80, 70, 135, 75, 90);
		
		DreamEater dreamEater = new DreamEater(100, 100);
		
		super.addMove(dreamEater);
	}
}
