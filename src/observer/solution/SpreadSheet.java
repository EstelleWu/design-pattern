package observer.solution;

public class SpreadSheet implements Observer{
	/*
	 * 'concrete observer'
	 * */
	@Override
	public void update() {
		System.out.println("Spread sheet got updated");
		
	}

}
