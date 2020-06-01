package composite.problem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group1 = new Group();
		group1.add(new Shape());  // square
		group1.add(new Shape());  // square
		
		Group group2 = new Group();
		group2.add(new Shape());  // circle
		group2.add(new Shape());  // circle
		
		
		Group group = new Group();
		group.add(group1);
		group.add(group2);
		group.render();
	}

}
