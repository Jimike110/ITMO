package mypokemons;

import mymoves.archeops.FocusBlast;

public class Archeops extends Archen {
	public Archeops (String name, int level) {
		super(name, level);
		super.setStats(75, 140, 65, 112, 65, 110);
		
		FocusBlast focusBlast = new FocusBlast(120, 70);
		
		super.setMove(focusBlast);
	}
}
