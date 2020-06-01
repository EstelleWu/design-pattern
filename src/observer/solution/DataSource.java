package observer.solution;

public class DataSource extends Subject{
	/* the scenario:
	 * we want the data source object talk to spread sheet and chart
	 * without being tightly coupled to them
	 * 
	 * how to solve:
	 * create a common interface for the spread sheet and chart,
	 * have data source talk to the commoni interface
	 * 
	 * 
	 * follow the open closed principle
	 * */
	
	
	/*
	 * 'concrete subject'
	 * */
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
	
}
