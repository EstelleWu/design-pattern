package adapter.solution;

import adapter.solution.avaFilters.Caramel;

/* Why adapter pattern?
 * Allows converting the interface of a class into another interface 
 * that clients expect. 
 * 
 * 
 * */
public class Main {

	public static void main(String[] args) {
		ImageView imageView = new ImageView(new Image());
		imageView.apply(new CaramelFilter(new Caramel())); 

	}

}
