package arrayList_agenda;

public class Contacto_Empresa {
	private int id;
	private String telefono;
	private String correo;
	private String direccion_postal;
	private String sector;
	
	public Contacto_Empresa(int id, String telefono, String correo, String direccion_postal, String sector) {
		this.id = id;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion_postal = direccion_postal;
		this.sector = sector;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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
		return "Contacto_Empresa [id=" + id + ", telefono=" + telefono + ", correo=" + correo + ", direccion_postal="
				+ direccion_postal + ", sector=" + sector + "]";
	}
	
	
	
	

}
