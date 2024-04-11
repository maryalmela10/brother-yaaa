package tikitok;

public class Video{
	private String nombreVideo;
	private int comentarios;
	private int likes;
	private double longitud;
	private String nombreUsuario; 
	
	public Video(String nombreVideo, double longitud, String nombreUsuario) {
		this.nombreVideo = nombreVideo;
		this.comentarios = 0;
		this.likes = 0;
		this.longitud = longitud;
		this.nombreUsuario=nombreUsuario;
	}
	
	public String getNombre() {
		return nombreVideo;
	}
	public void setNombre(String nombre) {
		this.nombreVideo = nombre;
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

	@Override
	public String toString() {
		return nombreVideo + ", " + comentarios + ", " + likes + ", "
				+ longitud + ", " + nombreUsuario ;
	}
	
	
	
}
