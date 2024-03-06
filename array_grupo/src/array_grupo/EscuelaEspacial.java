package array_grupo;

public class EscuelaEspacial {

	private Grupo[] grupos;
	private int numeroGrupos;
	
	public EscuelaEspacial(int cantidadGrupos) {
		this.grupos=new Grupo[cantidadGrupos];
		this.numeroGrupos=0;
	}
	
	public boolean añadirGrupo(Grupo grupo) {
		boolean esAñadido=false;
		if(!this.lleno()) {
			this.grupos[this.numeroGrupos]=grupo;
			this.numeroGrupos++;
			esAñadido=true;
		}
		return esAñadido;
	}
	
	public boolean borrarGrupo(Grupo grupo) {
		boolean esBorrado=false;
		for(int i=0;i<this.numeroGrupos;i++) {
			if(this.grupos[i].getId()==grupo.getId()) {
				this.grupos[i]=this.grupos[this.numeroGrupos-1];
				this.numeroGrupos--;
				break;
			}
		}
		
		return esBorrado;
	}
	
	public boolean lleno() {
		if(this.numeroGrupos==this.grupos.length) {
			return true;
		}else {
		return false;
	}
	
	}	
}
