package strategy.solution;

public class ImageStorage {
	/*
	 *'context' in the overall uml
	 * */
	
	public void store(String fileName, Compressor compressor, Filter filter) {
		// delegate the responsibility (compressing) to compressor object
		compressor.compress(fileName);
		filter.apply(fileName);
	}
}
