package iterator.exercise1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ProductCollection pc = new ProductCollection();
		Product p1 = new Product(1, "1");
		Product p2 = new Product(2, "2");
		Product p3 = new Product(3, "3");
		pc.add(p1);
		pc.add(p2);
		pc.add(p3);
		Iterator pcIterator = pc.iterator();
		while (pcIterator.hasNext()) {
			System.out.println(pcIterator.next());
		}
		

	}

}
