package Models;

public class Rocket {
	
	private String codiId;
	private int propulsores;
	
	public Rocket(String codiId, int propulsores) {
		this.codiId = codiId;
		this.propulsores = propulsores;
	}

	public String getCodiId() {
		return codiId;
	}

	public void setCodiId(String codiId) {
		this.codiId = codiId;
	}

	public int getPropulsores() {
		return propulsores;
	}

	public void setPropulsores(int propulsores) {
		this.propulsores = propulsores;
	}

	@Override
	public String toString() {
		return "Codigo = " + codiId + "\nPropulsores = " + propulsores + "\n";
	}
}
