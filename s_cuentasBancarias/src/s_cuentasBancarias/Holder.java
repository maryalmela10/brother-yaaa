package s_cuentasBancarias;

public class Holder {

	private String nif;
	private String name;
	private String last_name;
	private Fecha birth_date;
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Fecha getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Fecha birth_date) {
		this.birth_date = birth_date;
	}
	public Holder(String nif, String name, String last_name, Fecha birth_date) {
		this.nif = nif;
		this.name = name;
		this.last_name = last_name;
		this.birth_date = birth_date;
	}
	
}
