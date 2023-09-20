package projet;

public abstract class Probleme extends Carte {

	private Type type;
	
	protected Probleme(int n, Type t) {
		super(n);
		this.type=t;
		// TODO Auto-generated constructor stub
	}
	
	public enum Type{
		FEU,ESSENCE,CREVAISON,ACCIDENT
	}
	
	public Type getType() {
		return type;
	}
	
}
