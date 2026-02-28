package sistemaGestionVehiculos.vehiculo.ciclomotor;

public class Quad extends Ciclomotor {
	
	private String tamano;

	public Quad(String marca, String modelo, String matricula, int cilindrada, String tamano) {
		super(marca, modelo, matricula, cilindrada);
		this.tamano = tamano;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public void acelerar() {
		System.out.println("El quad acelera levantando tierra.");
	}

	@Override
	public String toString() {
		return String.format("Quad [marca= %s, modelo= %s, matricula= %s, cilindrada= %d, tamano= %s]", 
				this.getMarca(), this.getModelo(), this.getMatricula(), this.getCilindrada(), this.tamano);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Quad other = (Quad) obj;
		return super.equals(obj) && this.tamano.equals(other.tamano);
	}
}