package composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Object> objects = new ArrayList<>();
	
	public void add(Object shape) {
		objects.add(shape);
	}
	
	/*
	 * what is the problem:
	 * we need to check the type of every object
	 * and explicitly cast it to a new type and then do render()
	 * 
	 * what if we have other methods other like render()
	 * we have to do type checking and type casting for each method
	 * */
	public void render() {
		
		for (Object s : objects) {
			if (s instanceof Shape) {
				((Shape) s).render();
			}else {
				((Group) s).render();
			}
		}
	}
}
