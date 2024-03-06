package agenda_interfaz;

public class Contacto_Empresa extends Contacto{
	private String direccion_postal;
	private String sector;
	
	public Contacto_Empresa(int id, String telefono, String correo, String direccion_postal, String sector) {
		super(id, telefono, correo);
		this.direccion_postal = direccion_postal;
		this.sector = sector;
	}

	public String getDireccion_postal() {
		return direccion_postal;
	}

	public void setDireccion_postal(String direccion_postal) {
		this.direccion_postal = direccion_postal;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Contacto_Empresa" + super.toString() + ", direccion_postal=" + direccion_postal + ", sector=" + sector + "]";
	}
	
	

}
