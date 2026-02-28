package sistemaGestionVehiculos.vehiculo.camion;

import sistemaGestionVehiculos.vehiculo.Vehiculo;

public class Camion extends Vehiculo {
	
	private double capacidadCarga;

	public Camion(String marca, String modelo, String matricula, double capacidadCarga) {
		super(marca, modelo, matricula);
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	public void engancharRemolque() {
		System.out.println("Remolque enganchado al camión " + getMatricula() + ".");
	}

	@Override
	public void acelerar() {
		System.out.println("El camión acelera lentamente debido a su gran masa.");
	}

	@Override
	public String toString() {
		return String.format("Camion [marca= %s, modelo= %s, matricula= %s, capacidadCarga= %.2f]", 
				this.getMarca(), this.getModelo(), this.getMatricula(), this.capacidadCarga);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Camion other = (Camion) obj;
		return super.equals(obj) && this.capacidadCarga == other.capacidadCarga;
	}
}