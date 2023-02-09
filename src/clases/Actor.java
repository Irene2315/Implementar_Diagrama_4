package clases;

public class Actor {
	private String nombre;
	private int nacimiento;
	// el actor podría tener un arrayList de peliculas por si queremos 
	//motrar la peliculas en la que trabaja un actor
	//	private Pelicula[] pelicula= new Pelicula();	
	Actor(){
		
	}

	public Actor(String nombre, int nacimiento) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}


	public void mostrarActor() {
		System.out.println("Nombre:"+this.nombre + "Nacimiento"+this.nacimiento);
		
	}
	
}
