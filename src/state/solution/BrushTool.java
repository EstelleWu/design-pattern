package state.solution;

public class BrushTool implements Tool{

	/*
	 * concrete state in UML
	 * */
	@Override
	public void mouseDown() {
		System.out.println("Brush icon");
		
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw a line");
	}

}
