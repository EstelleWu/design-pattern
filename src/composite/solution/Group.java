package composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
	private List<Component> components = new ArrayList<>();
	
	public void add(Component shape) {
		this.components.add(shape);
	}
	
	/*
	 * what is the problem:
	 * we need to check the type of every object
	 * and explicitly cast it to a new type and then do render()
	 * 
	 * what if we have other methods other like render()
	 * we have to do type checking and type casting for each method
	 * */
	@Override
	public void render() {
		for (Component c : this.components) {
			c.render();
		}
	}

	@Override
	public void move() {
		for (Component c : this.components) {
			c.move();
		}
		
	}
}
