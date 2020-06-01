package observer.pull;

public class Chart implements Observer{

	/*
	 * 'concrete observer'
	 * */
	
	private DataSource dataSource;
	
	public Chart(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public void update() {
		System.out.println("Chart got updated: " + this.dataSource.getValue());
		
	}

}
