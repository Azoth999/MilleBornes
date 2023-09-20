package projet;

public class Botte extends Probleme {

	public Botte(int n, Type t) {
		super(n, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		switch (this.getType()) {
		case FEU: {
			return "Véhicule prioritaire";
		}
		case ESSENCE:{
			return "Citerne d'essence";
		}
		case CREVAISON:{
			return "Increvable";
		}
		case ACCIDENT:{
			return "As du volant";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.getType());
		}
	}
	
}
