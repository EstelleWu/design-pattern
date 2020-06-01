package state.solution;

public class Main {
	/*
	 * why state pattern:
	 * Allows an object to behave differently depending on the state 
	 * it is in
	 * */
	
	/*
	 * open closed principle:
	 * class should be opened for extension, and closed for modification
	 * add new functionality without changing existing code
	 * support new function by adding new classes
	 * 
	 * */
	
	/*
	 * why it is good?
	 * extensible
	 * say we want to support a new tool
	 * add a new class that implement the Tool interface
	 * 
	 * */
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.setCurrentTool(new EraserTool());
		canvas.mouseDown();
		canvas.mouseUp();

	}

}
