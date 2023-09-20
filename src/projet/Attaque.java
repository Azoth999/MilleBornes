package projet;

public class Attaque extends Bataille {

	public Attaque(int n, Type t) {
		super(n, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		switch (this.getType()) {
		case FEU: {
			return "Feu rouge";
		}
		case ESSENCE:{
			return "Panne d'essence";
		}
		case CREVAISON:{
			return "Crevaison";
		}
		case ACCIDENT:{
			return "Accident";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.getType());
		}
	}
	
}
