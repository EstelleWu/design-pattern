package adapter.solution;

import adapter.solution.avaFilters.Caramel;

/*
 * inheritance between caramelAdapter and caramel
 * 
 * bc there is no multiple inheritance in java (extends multiple classes at the same time)
 * if filter is an abstract class not a interface
 * this approach is not valid
 * 
 * composition over inheritance
 * */
public class CaramelAdapter extends Caramel implements Filter{

	@Override
	public void apply(Image image) {
		init();
		render(image);
		
	}

}
