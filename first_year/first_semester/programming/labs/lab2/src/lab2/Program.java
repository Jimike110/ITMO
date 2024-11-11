package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class Program {

	public static void main(String[] args) {
		Battle b = new Battle();
		
		Articuno articuno = new Articuno("Artem", 1);
		Archen archen = new Archen("Vladimir", 1);
		Archeops archeops = new Archeops("Ivan", 1);
		
		Porygon porygon = new Porygon("Polina", 1);
		Porygon2 porygon2 = new Porygon2("Petr", 1);
		PorygonZ porygonZ = new PorygonZ("Michael", 1);
		
		b.addAlly(articuno);
		b.addAlly(archen);
		b.addAlly(archeops);
		
		b.addFoe(porygon);
		b.addFoe(porygon2);
		b.addFoe(porygonZ);
		
		b.go();
	}
	
	public static boolean chance(double d) {
		return d > Math.random();
	}
}
