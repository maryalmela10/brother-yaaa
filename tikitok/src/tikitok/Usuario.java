package tikitok;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int seguidores;
	private ArrayList<Video> videos;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.seguidores = 0;
		this.videos = new ArrayList<Video>();
	}
	
	public void agregarSeguidores() {
		this.seguidores++;
	}
	
	public void agregarVideo(Video video) {
		this.videos.add(video);
	}
	
	public void agregarVideoNuevo(String nombre, double longitud) {
		Video video = new Video(nombre, longitud);
		this.videos.add(video);
	}
	
	public boolean agregarLikeVideo(String nombreVideo) {
		for(Video video: this.videos) {
			if (video.getNombre().equalsIgnoreCase(nombreVideo)) {
				video.agregarLike();
				return true;
			}
		}
		return false;
	}
	
	public boolean agregarComentarioVideo(String nombreVideo) {
		for(Video video: this.videos) {
			if (video.getNombre().equalsIgnoreCase(nombreVideo)) {
				video.agregarComentario();
				return true;
			}
		}
		return false;
	}
	
	public int cantidadVideos() {
		return this.videos.size();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}

	public ArrayList<Video> getVideos() {
		return videos;
	}

	public void setVideos(ArrayList<Video> videos) {
		this.videos = videos;
	}
	
	
	
}
