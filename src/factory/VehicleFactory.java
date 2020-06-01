package factory;
/*
 * We give the responsibility of creating specific objects to a factory class
 * rather than having our client worry about the specific details of how to
 * create an object
 * */
public class VehicleFactory {
	public Vehicle getVehicle(VehicleType vehicleType) {
		return vehicleType.getVehicle();
	}
}
