package state.solution;

public class EraserTool implements Tool{

	/*
	 * concrete class in uml
	 * */
	@Override
	public void mouseDown() {
		System.out.println("Eraser icon");
		
	}

	@Override
	public void mouseUp() {
		System.out.println("Eraser something");
	}

}
