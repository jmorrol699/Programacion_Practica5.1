package sistemaGestionVehiculos.vehiculo.furgoneta;

import sistemaGestionVehiculos.vehiculo.Vehiculo;

public class Furgoneta extends Vehiculo {
	
	private String tipo;

	public Furgoneta(String marca, String modelo, String matricula, String tipo) {
		super(marca, modelo, matricula);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		System.out.println("La furgoneta acelera con fuerza para mover la carga.");
	}

	@Override
	public String toString() {
		return String.format("Furgoneta [marca= %s, modelo= %s, matricula= %s, tipo= %s]", 
				this.getMarca(), this.getModelo(), this.getMatricula(), this.tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Furgoneta other = (Furgoneta) obj;
		return super.equals(obj) && this.tipo.equals(other.tipo);
	}
}
