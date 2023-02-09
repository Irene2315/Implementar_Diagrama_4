package clases;

public class Pelicula {
	private String titulo;
	private long director;
	private int duracion;
	private Actor[] actores= new Actor[15];
	private int numeroActores;
	
	Pelicula() {
		
	}

	public Pelicula(String titulo, long director, int duracion, Actor[] actores, int numeroActores) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.actores = actores;
		this.numeroActores = numeroActores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getDirector() {
		return director;
	}

	public void setDirector(long director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Actor[] getActores() {
		return actores;
	}

	public void setActores(Actor[] actores) {
		this.actores = actores;
	}

	public int getNumeroActores() {
		return numeroActores;
	}

	public void setNumeroActores(int numeroActores) {
		this.numeroActores = numeroActores;
	}
	
	public void mostrarPelicula() {
		System.out.println("Director:"+this.director + "Duracion"+this.duracion
				+ "Actores"+this.actores +"Numero_Actores"+ this.numeroActores);
		
	}
	
	

}
