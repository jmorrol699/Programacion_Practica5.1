package sistemaGestionVehiculos.vehiculo.coche;

public class Ranchera extends Coche {
	
	private int capacidadMaletero;

	public Ranchera(String marca, String modelo, String matricula, String combustible, int capacidadMaletero) {
		super(marca, modelo, matricula, combustible);
		this.capacidadMaletero = capacidadMaletero;
	}

	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	@Override
	public void acelerar() {
		System.out.println("La ranchera acelera de forma estable en la carretera.");
	}

	@Override
	public String toString() {
		return String.format("Ranchera [marca= %s, modelo= %s, matricula= %s, combustible= %s, capacidadMaletero= %d]", 
				this.getMarca(), this.getModelo(), this.getMatricula(), this.getCombustible(), this.capacidadMaletero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Ranchera other = (Ranchera) obj;
		return super.equals(obj) && this.capacidadMaletero == other.capacidadMaletero;
	}
}
