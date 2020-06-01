package observer.pushstyle;

public class Chart implements Observer{

	/*
	 * 'concrete observer'
	 * */
	@Override
	public void update(int value) {
		System.out.println("Chart got updated: " + value);
		
	}

}
