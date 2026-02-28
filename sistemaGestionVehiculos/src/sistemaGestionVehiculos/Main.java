package sistemaGestionVehiculos;

import sistemaGestionVehiculos.vehiculo.Vehiculo;
import sistemaGestionVehiculos.vehiculo.camion.Camion;
import sistemaGestionVehiculos.vehiculo.ciclomotor.Moto;
import sistemaGestionVehiculos.vehiculo.ciclomotor.Quad;
import sistemaGestionVehiculos.vehiculo.coche.Ranchera;
import sistemaGestionVehiculos.vehiculo.coche.Sedan;
import sistemaGestionVehiculos.vehiculo.furgoneta.Camper;
import sistemaGestionVehiculos.vehiculo.furgoneta.Furgoneta;

public class Main {

	public static void main(String[] args) {
		
		Concesionario concesionario = new Concesionario();
		
		Moto moto = new Moto("Yamaha", "MT-07", "1111AAA", 689, "Naked");
		Quad quad = new Quad("Suzuki", "LTZ", "2222BBB", 400, "Mediano");
		Sedan sedan = new Sedan("Toyota", "Corolla", "3333CCC", "Gasolina", 5);
		Ranchera ranchera = new Ranchera("Audi", "A4 Avant", "4444DDD", "Diesel", 505);
		Camion camion = new Camion("Volvo", "FH16", "5555EEE", 20000);
		Furgoneta furgoneta = new Furgoneta("Ford", "Transit", "6666FFF", "L2H2");
		Camper camper = new Camper("Volkswagen", "California", "7777GGG", "L1H1", "Cama, fregadero, placas solares y nevera");
		
		concesionario.anadirVehiculo(moto);
		concesionario.anadirVehiculo(quad);
		concesionario.anadirVehiculo(sedan);
		concesionario.anadirVehiculo(ranchera);
		concesionario.anadirVehiculo(camion);
		concesionario.anadirVehiculo(furgoneta);
		concesionario.anadirVehiculo(camper);
		
		concesionario.mostrarInventario();
		
		System.out.println("\nDemostración de polimorfismo (acelerar):");
		for(Vehiculo v : concesionario.getVehiculos()) {
			v.acelerar(); 
		}
		
		System.out.println("\nComportamientos específicos:");
		moto.hacerCaballito();
		camion.engancharRemolque();
		camper.encenderCocina();
		
		System.out.println("\nEliminando vehículo:");
		concesionario.eliminarVehiculo(sedan);
		concesionario.mostrarInventario();
	}

}
