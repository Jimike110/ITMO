package mypokemons;

import mymoves.archen.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Archen extends Pokemon {
	public Archen (String name, int level) {
		super(name, level);
		
		super.setType(Type.ROCK, Type.FLYING);
		super.setStats(55, 112, 45, 74, 45, 70);
		
		DragonClaw dragonClaw = new DragonClaw(80, 100);
		WingAttack wingAttack = new WingAttack(60, 100);
		DragonBreath dragonBreath = new DragonBreath(60, 100);
		
		super.setMove(dragonClaw, wingAttack, dragonBreath);
	}
}
