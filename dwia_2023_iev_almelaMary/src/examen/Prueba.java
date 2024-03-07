package examen;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mago1 creado
		Mago mago= new Mago("Asth Shej", 2, true);
		
		//mago2 
		Mago mago2= new Mago("Asth Sheij", 22, true);
		
		System.out.println(mago);
		//dragon creado
		Dragon dragon=new Dragon("negro", "maryland", 20);
		System.out.println(dragon);
		
		//dragon 2 creado
		Dragon dragon2=new Dragon("amarillo", "maryland", 20);
		System.out.println(dragon2);
		
		//mago1 promociona
		mago.promocionaMago();
		System.out.println(mago.getPoder());
		
		//mago2 no promociona
		mago2.promocionaMago();
		System.out.println(mago2.getPoder());
		
		
		//combate con el dragon
		//mago 1 no derrota al dragon
		System.out.println(mago.combateDragon(dragon));
		//mago2 si derrota al dragon
		System.out.println(mago2.combateDragon(dragon));
		//mago 1 derrota al dragon 2
		System.out.println(mago.combateDragon(dragon2));
		
	}

}
