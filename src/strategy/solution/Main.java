package strategy.solution;

/* diff between state pattern and strategy pattern:
 * state: 
 * the context object can have one single state,
 * the behaviors depends on the single state
 * 
 * strategy:
 * the context object doesn't have a state, it can have multiple strategy objects
 * diff behaviors are represented using diff strategy objects
 * 
 * */

/*
 * why strategy pattern:
 * Allows passing different algorithms (behaviours) to an object.
 * Allows defining a template (skeleton) for an operation. 
 * Specific steps will then be implemented in subclasses.
 * 
 * */

/* why it is good?
 * when we want to use a diff compressor or diff filter,
 * pass the compressor object or filter object to imageStorage object directly
 * */
public class Main {
	public static void main(String[] args) {
		ImageStorage imageStorage = new ImageStorage();
		imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
	}
}


