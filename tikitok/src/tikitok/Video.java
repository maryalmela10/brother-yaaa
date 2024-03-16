package tikitok;

public class Video{
	private String nombre;
	private int comentarios;
	private int likes;
	private double longitud;
	
	public Video(String nombre, double longitud) {
		this.nombre = nombre;
		this.comentarios = 0;
		this.likes = 0;
		this.longitud = longitud;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getComentarios() {
		return comentarios;
	}
	public void setComentarios(int comentarios) {
		this.comentarios = comentarios;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public void agregarLike() {
		this.likes++;
	}
	
	public void agregarComentario() {
		this.comentarios++;
	}
	
	
	
}
