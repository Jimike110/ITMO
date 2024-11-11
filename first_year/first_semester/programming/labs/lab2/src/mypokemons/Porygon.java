package mypokemons;

import mymoves.porygon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Porygon extends Pokemon {
	public Porygon(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(65, 60, 70, 85, 75, 40);
		
		Tackle tackle = new Tackle(40, 100);
		DreamEater dreamEater = new DreamEater(100, 100);
		
		super.setMove(tackle, dreamEater);
	}
}
