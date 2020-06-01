package observer.pushstyle;

public class SpreadSheet implements Observer{
	/*
	 * 'concrete observer'
	 * */
	@Override
	public void update(int value) {
		System.out.println("Spread sheet got updated: " + value);
		
	}

}
