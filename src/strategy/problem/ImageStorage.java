package strategy.problem;

public class ImageStorage {
	/* what is the problem?
	 * 1) violate the single responsibility principle
	 * not only store, but also compress and filter
	 * 2) not maintainable, not extensible (as the problem in state pattern)
	 * 
	 * how to solve it?
	 * polymorphysm
	 * 
	 * */
	private String compressor;
	private String filter;
	
	public ImageStorage(String compressor, String filter) {
		this.compressor = compressor;
		this.filter = filter;
	}
	
	public void store(String fileName) {
		// diff image compress algo: JPEG, PGN, ...
		// diff filter algo: B&W, High Contrast
		if (compressor == "jpeg") {
			System.out.println("Compressing using JPEG");
		}else if (compressor == "png") {
			System.out.println("Compressing using PNG");
		}
		
		
		if (filter == "b&w") {
			System.out.println("Applying B&W filter");
		}else if (filter == "high-contrast") {
			System.out.println("Applying high contrast");
		}
	}
}
