package factory;

public class Car implements Vehicle{

	@Override
	public void startEngine() {
		System.out.println("start a new engine of car");
	}

}
