package sistemaGestionVehiculos.vehiculo.furgoneta;

public class Camper extends Furgoneta {
	
	private String descripcion;

	public Camper(String marca, String modelo, String matricula, String tipo, String descripcion) {
		super(marca, modelo, matricula, tipo);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void encenderCocina() {
		System.out.println("Cocina de la camper encendida.");
	}

	@Override
	public void acelerar() {
		System.out.println("La camper acelera tranquilamente, llevas la casa a cuestas.");
	}

	@Override
	public String toString() {
		return String.format("Camper [marca= %s, modelo= %s, matricula= %s, tipo= %s, descripcion= %s]", 
				this.getMarca(), this.getModelo(), this.getMatricula(), this.getTipo(), this.descripcion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Camper other = (Camper) obj;
		return super.equals(obj) && this.descripcion.equals(other.descripcion);
	}
}
