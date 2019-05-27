package Models;

public class Rocket2 {
	
	private String codiId;
	private Propulsores propulsores;
	
	public Rocket2(String codiId, Propulsores propulsores) {
		this.codiId = codiId;
		this.propulsores = propulsores;
	}

	public String getCodiId() {
		return codiId;
	}

	public void setCodiId(String codiId) {
		this.codiId = codiId;
	}

	public Propulsores getPropulsores() {
		return propulsores;
	}

	public void setPropulsores(Propulsores propulsores) {
		this.propulsores = propulsores;
	}

	@Override
	public String toString() {
		return "Codigo = " + codiId + "\nPropulsores = " + propulsores + "\n";
	}
}
