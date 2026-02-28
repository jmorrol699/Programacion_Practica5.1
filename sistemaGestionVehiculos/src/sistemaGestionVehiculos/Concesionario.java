package sistemaGestionVehiculos;

import java.util.ArrayList;
import java.util.List;
import sistemaGestionVehiculos.vehiculo.Vehiculo;

public class Concesionario {
	
	private List<Vehiculo> vehiculos;

	public Concesionario() {
		this.vehiculos = new ArrayList<>();
	}

	public void anadirVehiculo(Vehiculo v) {
		this.vehiculos.add(v);
	}

	public void eliminarVehiculo(Vehiculo v) {
		this.vehiculos.remove(v);
	}
	
	public void mostrarInventario() {
		System.out.println("Inventario: ");
		for(Vehiculo v : this.vehiculos) {
			System.out.println(v);
		}
	}
	
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
}