package factory;
/*
 * Enums doesn't support public constructors and hence, 
 * cannot be instantiated
 * */
public enum VehicleType {
	TRUCK{
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	CAR{
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	ELECTRIC{
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	};
	
	abstract Vehicle getVehicle();
}
