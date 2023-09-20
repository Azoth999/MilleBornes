package projet;

public class Parade extends Bataille {

	public Parade(int n, Type t) {
		super(n, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		switch (this.getType()) {
		case FEU: {
			return "Feu vert";
		}
		case ESSENCE:{
			return "Essence";
		}
		case CREVAISON:{
			return "Roue de secours";
		}
		case ACCIDENT:{
			return "Reparations";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.getType());
		}
	}
	
}
