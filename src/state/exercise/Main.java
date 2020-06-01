package state.exercise;

public class Main {

	public static void main(String[] args) {
		DirectionService ds = new DirectionService();
		ds.setTravelMode(new Transit());
		ds.getEta();
		ds.getDirection();

	}

}
