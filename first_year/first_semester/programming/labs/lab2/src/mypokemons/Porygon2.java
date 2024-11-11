package mypokemons;

import mymoves.porygon2.DefenseCurl;

public class Porygon2 extends Porygon {
	public Porygon2(String name, int level) {
		super(name, level);
		
		super.setStats(85, 80, 90, 105, 95, 60);
		
		DefenseCurl defenseCurl = new DefenseCurl(0, 40);
		
		super.addMove(defenseCurl);
	}
}
