package state.solution;

public class SelectionTool implements Tool{

	/*
	 * concrete state in UML
	 * */
	@Override
	public void mouseDown() {
		System.out.println("Selection icon");
		
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw a dashed rectangle");
		
	}

}
