package sistemaGestionVehiculos.vehiculo.coche;

import sistemaGestionVehiculos.vehiculo.Vehiculo;

public abstract class Coche extends Vehiculo {
	
	private String combustible;

	public Coche(String marca, String modelo, String matricula, String combustible) {
		super(marca, modelo, matricula);
		this.combustible = combustible;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return String.format("Coche [marca= %s, modelo= %s, matricula= %s, combustible= %s]", 
				this.getMarca(), this.getModelo(), this.getMatricula(), this.combustible);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Coche other = (Coche) obj;
		return super.equals(obj) && this.combustible.equals(other.combustible);
	}
}
