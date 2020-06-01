package state.problem;

public class Canvas {
	private ToolType currentTool;
	
	/* what's the problem?
	 * all the method would have this repetition
	 * more tools supported, longer the decision making
	 * result: not maintainable (high degree of coupling); less extensible (when new tools added)
	 * 
	 * what you really want to do?
	 * canvas should behave differently depending on the current tool
	 * 
	 * how to solve it?
	 * based on 4 principles of OOD: inheritance, polymorphysm, abstraction, encapsulation
	 * polymorphysm come to use
	 * 
	 * */
	
	public void mouseDown() {
		if (currentTool == ToolType.SELECTION) {
			System.out.print("Selection icon");
		}else if (currentTool == ToolType.BRUSH) {
			System.out.print("BRUSH icon");
		}else if (currentTool == ToolType.ERASER) {
			System.out.print("ERASER icon");
		}
	}
	
	public void mouseUp() {
		
		if (currentTool == ToolType.SELECTION) {
			System.out.print("Draw dashed rectangle");
		}else if (currentTool == ToolType.BRUSH) {
			System.out.print("Draw a line");
		}else if (currentTool == ToolType.ERASER) {
			System.out.print("Erase something");
		}
	}

	public ToolType getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(ToolType currentTool) {
		this.currentTool = currentTool;
	}
}
