package Models;

import java.util.List;

public class Rocket3 {
	
	private String codiId;
	private List<Propulsor> propulsores;
	private Double velocidad_actual;
	
	public Rocket3(String codiId, List<Propulsor> propulsores1) {
		this.codiId = codiId;
		this.propulsores = propulsores1;
	}

	public Double getVelocidad_actual() {
		return velocidad_actual;
	}

	public void setVelocidad_actual(Double velocidad_actual) {
		this.velocidad_actual = velocidad_actual;
	}

	public String getCodiId() {
		return codiId;
	}

	public void setCodiId(String codiId) {
		this.codiId = codiId;
	}

	public List<Propulsor> getPropulsores() {
		return propulsores;
	}

	public void setPropulsores(List<Propulsor> propulsores) {
		this.propulsores = propulsores;
	}

	public Double vAct (Double Vo) {
		Double output=0.0;
		Double sum_prop = 0.0;
		for (int i=0;i<propulsores.size();i++) {
			sum_prop += propulsores.get(i).getPotencia_actual();
		}
		output = Vo + 100*Math.sqrt(sum_prop);
		return output;
	}
	@Override
	public String toString() {
		return "Codigo = " + codiId + "\nPropulsores = \n" + propulsores + "\n";
	}
}
