package observer.solution;

public class Chart implements Observer{

	/*
	 * 'concrete observer'
	 * */
	@Override
	public void update() {
		System.out.println("Chart got updated");
		
	}

}
