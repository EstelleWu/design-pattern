package iterator.exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// implement java.lang iteratable and iterator
public class ProductCollection implements Iterable<Product>{
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

@Override
public Iterator<Product> iterator() {
	// TODO Auto-generated method stub
	return products.iterator();
}
  

 

}
