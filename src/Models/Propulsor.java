package Models;

public class Propulsor {
	
	private int propId,potencia_actual,potencia_maxima;

	public Propulsor(int propId, int potencia_actual, int potencia_maxima) {
		super();
		this.propId = propId;
		this.potencia_actual = potencia_actual;
		this.potencia_maxima = potencia_maxima;
	}
	
	public int getpropId() {
		return propId;
	}

	public void setpropId(int propId) {
		this.propId = propId;
	}

	public int getPotencia_actual() {
		return potencia_actual;
	}

	public void setPotencia_actual(int potencia_actual) {
		this.potencia_actual = potencia_actual;
	}

	public int getPotencia_maxima() {
		return potencia_maxima;
	}

	public void setPotencia_maxima(int potencia_maxima) {
		this.potencia_maxima = potencia_maxima;
	}
	
	public int acelerar() {
		if (potencia_maxima >= (potencia_actual+10)) {
			potencia_actual += 10;
		} else {
			System.out.println(propId + " Está a máxima potencia");
			potencia_actual=potencia_maxima;
		}
		System.out.println(potencia_actual);
		return potencia_actual;
	}
	
	public int frenar() {
		if (0 <= (potencia_actual-10)) {
			potencia_actual -= 10;
		} else {
			System.out.println("Está a potencia 0");
			potencia_actual=0;
		}
		System.out.println(potencia_actual);
		return potencia_actual;
	}
	@Override
	public String toString() {
		return propId + " PA = " + potencia_actual + ", PM = " + potencia_maxima + "\n";
	}
}
