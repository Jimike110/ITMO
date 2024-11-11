package mymoves.articuno;

import lab2.Program;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {
	public Blizzard(double pow, double acc) {
		super(Type.ICE, pow, acc);
	}
	 
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		if (Program.chance(0.1) && !p.hasType(Type.ICE)) {
			Effect.freeze(p);
		}
	}

	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}
}
