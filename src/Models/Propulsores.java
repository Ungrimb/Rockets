package Models;

import java.util.List;

public class Propulsores {
	
	private int cantidad;
	private List<Integer> potencia;
	
	public Propulsores(int cantidad, List<Integer> potencia) {
		super();
		this.cantidad = cantidad;
		this.potencia = potencia;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<Integer> getPotencia() {
		return potencia;
	}

	public void setPotencia(List<Integer> potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return cantidad + "\nPotencia = " + potencia + "\n";
	}

}
