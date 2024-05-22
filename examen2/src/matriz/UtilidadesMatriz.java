package matriz;

public class UtilidadesMatriz {

	 public static boolean esNumeroEnteroPositivo(String texto) {
	        if(texto == null || texto.isEmpty()) {
	            return false;
	        } else {
	        	 for(int i = 0; i < texto.length(); i++) {
	 	            if(!Character.isDigit(texto.charAt(i))) {
	 	                return false;
	 	            }
	 	        }
	        	 int numero = Integer.parseInt(texto);
	        	 if(numero>=0) {
	        		 return true;
	        	 } else {
	        		 return false;
	        	 }}
	        }
	        
	        public static int[][] metodo2(String[][] array) {
	        	int numerito=0;
	        	int[][] resultado= new int[2][array[0].length];
	    		for(int i=0; i<array[0].length;i++) {
	    			int numeroMayor=0;
		        	int indiceMayor = -1;
	    			for(int j=0;j<array.length;j++) {
	    				if(UtilidadesMatriz.esNumeroEnteroPositivo(array[j][i])) {
	    					numerito=Integer.parseInt(array[j][i]);
	    					if(numerito>numeroMayor) {
	    						numeroMayor=numerito;
	    						indiceMayor = j;
	    					} if(numerito==numeroMayor) {
	    						if(j<indiceMayor) {
	    							indiceMayor=j;
	    						}
	    					} 
	    				} 
	    			}
					resultado[0][i]=indiceMayor;
					resultado[1][i]=numeroMayor; 
	    		}
	        	return resultado;
	    	}
	        
	}