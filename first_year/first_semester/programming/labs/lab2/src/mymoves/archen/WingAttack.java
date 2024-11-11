package mymoves.archen;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WingAttack extends PhysicalMove {
	public WingAttack(double pow, double acc) {
		super(Type.FLYING, pow, acc);
	}

	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length - 1];
	}
}
