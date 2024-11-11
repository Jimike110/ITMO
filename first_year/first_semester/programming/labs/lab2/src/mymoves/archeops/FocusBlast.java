package mymoves.archeops;

import lab2.Program;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {
	public FocusBlast(double pow, double acc) {
		super(Type.FIGHTING, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if(Program.chance(0.1)) {
			p.setMod(Stat.SPECIAL_DEFENSE, -1);
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}
}
