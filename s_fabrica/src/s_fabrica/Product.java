package s_fabrica;

public class Product {

	private String codigo;
	private String marca;
	private String modelo;
	private double precio;
	private Maker maker;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Maker getMaker() {
		return maker;
	}
	public void setMaker(Maker maker) {
		this.maker = maker;
	}
	
	public Product(String codigo, String marca, String modelo, double precio, Maker maker) {
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.maker = maker;
	}
	
	public void validar() {
		if (
			!((this.codigo.length()-1==5)
			&& (Character.isLetter(this.codigo.charAt(0)))
			&& (Character.isUpperCase(this.codigo.charAt(0)))
			&& (Product.isDigit(this.codigo.substring(1, 4)))
			&& (Character.isLetter(this.codigo.charAt(this.codigo.length()-1)))
			&& (Character.isLowerCase(this.codigo.charAt(this.codigo.length()-1)))
			))
		{
			this.setCodigo("A000a");
			System.out.println(this.codigo);
		}
		
		if ()
	}
	
	private static boolean isDigit(String text) {
		for (int i=0; i<text.length();i++) {
			char character = text.charAt(i);
			if (!(Character.isDigit(character))) {
				return false;
			}
		}
		return true;
	}
	
	private String validarMarca() {
		String marcaFinal=new String();
		for (int i=0;i<this.marca.length();i++) {
			if ((Character.isLetter(this.marca.charAt(i)) || (Character.isDigit(this.marca.charAt(i))))){
				
			}
		}
	}
	}
