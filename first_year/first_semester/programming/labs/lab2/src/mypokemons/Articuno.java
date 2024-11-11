package mypokemons;

import mymoves.articuno.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Articuno extends Pokemon {

	public Articuno(String name, int level) {
		super(name, level);
		
		super.setType(Type.ICE, Type.FLYING);
		super.setStats(90, 85, 100, 95, 125, 85);
		
		Agility agility = new Agility(0, 0);
		Blizzard blizzard = new Blizzard(110, 70);
		Swagger swagger = new Swagger(0, 75);
		
		super.setMove(agility, blizzard, swagger);
	}
}
