package adapter.solution;

import adapter.solution.avaFilters.Caramel;

/*
 * composition between caramel filter and caramel
 * */
public class CaramelFilter implements Filter{
	private Caramel caramel;
	
	public CaramelFilter(Caramel caramel) {
		this.caramel = caramel;
	}
	@Override
	public void apply(Image image) {
		this.caramel.init();
		this.caramel.render(image);
		
	}

}
