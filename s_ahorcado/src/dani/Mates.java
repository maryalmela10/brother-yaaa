package dani;

public class Mates {

	   public static boolean comprobarPrimo(int n){
	        for(int i=2; i<n; i++){
	            if(n%i==0){
	                return false;
	            }
	        }
	        return true;
	    }
	    public static int randomInt(int nInicial, int nFinal){
	        int aleatorio=0;
	        aleatorio=(int) (nInicial+(Math.random()*(nFinal-nInicial+1)));
	        return aleatorio;
	    }
	    public static int factorial(int n){
	        int r=1;
	        for(int i=2; i<=n; i++){
	            r=r*i;
	        }
	        return r;
	    }
}
