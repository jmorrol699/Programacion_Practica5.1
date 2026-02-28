package sistemaGestionVehiculos.vehiculo.ciclomotor;

import sistemaGestionVehiculos.vehiculo.Vehiculo;

public abstract class Ciclomotor extends Vehiculo {
	
	private int cilindrada;

	public Ciclomotor(String marca, String modelo, String matricula, int cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return String.format("Ciclomotor [marca= %s, modelo= %s, matricula= %s, cilindrada= %d]", 
				this.getMarca(), this.getModelo(), this.getMatricula(), this.cilindrada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Ciclomotor other = (Ciclomotor) obj;
		return super.equals(obj) && this.cilindrada == other.cilindrada;
	}
}