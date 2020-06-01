package iterator.solution;

public class Main {
	/* 
	 * Why iterator pattern:
	 * Allows iterating over an object without having to 
	 * expose the object’s internal structure 
	 * (which may change in the future)
	 * 
	 * */
	public static void main(String[] args) {
		BrowseHistory1 history = new BrowseHistory1();
		history.push("a");
		history.push("b");
		history.push("c");
		
		Iterator iterator = history.createIterator();
		while (iterator.hasNext()) {
			String url = iterator.current();
			System.out.println(url);
			iterator.next();
		}

	}

}
