package factory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle.startEngine();
	}

}
