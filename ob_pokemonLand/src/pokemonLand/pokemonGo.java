package pokemonLand;

public class pokemonGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pokemon pokemon1, pokemon2;
		
		pokemon1=new Pokemon('E',10,0,5);
		pokemon2=new Pokemon('W',15,0,28);
		
		System.out.println(pokemon1);
		System.out.println(pokemon2);
		System.out.println(pokemon1.getPuntosVida());
		System.out.println(pokemon2.getPuntosVida());
		
		System.out.println("El ganador es el pokemon "+pokemon2.lucha(pokemon1));
	}

}
