package projet;

public abstract class Carte {
	
	private int nombre;
	
	protected Carte(int n) {
		this.nombre = n;
	}
	
	public int getNombre() {
		return nombre;
	}
}
	