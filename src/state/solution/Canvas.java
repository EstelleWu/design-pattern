package state.solution;

public class Canvas {
	/*
	 * context in uml
	 * */
	
	/*
	 * Canvas class is delegating to a specific tool
	 * to determine what should happen when a user
	 * presses or releases the mouse button
	 * */
	private Tool currentTool;
	
	public void mouseDown() {
		this.currentTool.mouseDown();
	}
	
	public void mouseUp() {
		this.currentTool.mouseUp();
	}
	
	public Tool getCurrentTool() {
		return currentTool;
	}
	
	public void setCurrentTool(Tool currentTool) {
		this.currentTool = currentTool;
	}
}
