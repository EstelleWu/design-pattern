package observer.pull;

public class SpreadSheet implements Observer{
	/*
	 * 'concrete observer'
	 * it needs to know the concrete subject
	 * */
	
	private DataSource dataSource;
	
	public SpreadSheet(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public void update() {
		/*
		 * actively pull data from concrete subject
		 * */
		System.out.println("Spread sheet got updated: " + this.dataSource.getValue());
		
	}

}
