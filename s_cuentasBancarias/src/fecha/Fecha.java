package fecha;

public class Fecha {

		private int dia;
		private int mes;
		private int año;
		
		public Fecha() {
			this.dia=1;
			this.mes=1;
			this.año=1900;
		}

		
		public Fecha(int dia, int mes, int año) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
			this.validar();
		}
		
		private void validar() {
			if (dia<1 || dia>31) {
				this.dia=1;
			}
			
			if (mes<1 || mes>12) {
				this.mes=1;
			}
			
			if (año<1900 && año>2050) {
				this.año=1900;
			}
		}
		
		public boolean bisiesto() {
			boolean esBisiesto=false;
			if (((this.año%4==0) && (this.año%100 !=0))
				|| (this.año%400==0)) {
				esBisiesto=true;
			}
			
			return esBisiesto;
		}
		
		public int diaMes() {
			int dias;
			switch (this.mes) {
			case 1, 3, 5, 7, 8, 10, 12: 
				dias=31;
			break;
			case 2: 
				if (this.bisiesto()) {
					dias=29;
					}else {
						dias=28;
					}
			break;
			case 4,6,9,11: 
				dias=30;
			break;
			
			default: 
				dias=-1;
			}
			return dias;
		}
		
		public void siguiente() {
			this.dia++;
			if (this.dia>this.diaMes()) {
				this.dia=1;
				this.mes++;
				if(this.mes>12) {
					this.mes=1;
					this.año++;
					if (this.año==2500 && this.mes==12&&this.dia==31) {
						 this.año= 1900;
				         this.mes= 1;
				         this.dia= 1;
					}
				}
			}
		}
		
		public void anterior(){
			this.dia--;
			if (this.dia<1) {
				this.mes--;
				this.dia=this.diaMes();
				if (this.mes<1) {
					this.año--;
					this.mes=12;
					this.dia=this.diaMes();
					if (this.año==1900&&this.mes==1&&this.dia==1) {
			            this.año= 2500;
			            this.mes= 12;
			            this.dia= 31;
			}
		} 
	}	
}		
		public boolean igualQue(Fecha otra) {
			boolean esIgual=false;
			if (otra.dia==this.dia && otra.año==this.año && otra.mes==this.mes) {
				esIgual=true;
			}
			return esIgual; 
		}
		
		
		public boolean menorQue(Fecha fechaComparar) {
			boolean esMenor=false;
			if (this.dia<fechaComparar.dia && this.mes==fechaComparar.mes && this.año==fechaComparar.año) {
	            esMenor=true;
			} else {
				if (this.mes<fechaComparar.mes && this.año==fechaComparar.año) {
					esMenor=true;
				} else {
					if (this.año<fechaComparar.año) {
						esMenor=true;
					} else {
						return esMenor;
					}
				}
			}
			return esMenor;      
	   }
		
		public boolean mayorQue(Fecha fechaComparar) {
			boolean esMayor=false;
			if (this.dia>fechaComparar.dia && this.mes==fechaComparar.mes && this.año==fechaComparar.año) {
				esMayor=true;
			} else {
				if (this.mes>fechaComparar.mes && this.año==fechaComparar.año) {
					esMayor=true;
				} else {
					if (this.año>fechaComparar.año) {
						esMayor=true;
					} else {
						return esMayor;
					}
				}
			}
			return esMayor;      
	   }
		
		public int diferenciaDias(Fecha otra) {
			Fecha fecha1=null, fecha2=null;
			int contadorDias=0;
			
			if(this.menorQue(otra)) {
				fecha1=new Fecha(this.dia, this.mes, this.año);
				fecha2=new Fecha(otra.dia, otra.mes, otra.año);
				
			} else {
				
				if (this.mayorQue(otra)) {
					fecha1=new Fecha(otra.dia, otra.mes, otra.año);
					fecha2=new Fecha(this.dia, this.mes, this.año);
				}
				
				while (fecha1.menorQue(fecha2)) {
					fecha1.siguiente();
					contadorDias++;
					System.out.println(fecha1.toString());
				}
				
			//	fecha1.regresarFecha(contadorDias);
			}
			
			return contadorDias;
		}
		
		/*private void regresarFecha(int contador) {
			while (contador>0) {
				this.anterior();
				contador--;
			}
		}*/
		
		@Override
		public String toString() {
			return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
		}
		
	}

	

