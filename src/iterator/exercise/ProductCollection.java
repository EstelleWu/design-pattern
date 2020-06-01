package iterator.exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection{
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }
  
  public Iterator createIterator() {
	  return new ProductIterator();
  }
  
  private class ProductIterator implements Iterator{
	private int index = 0;
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.index < ProductCollection.this.products.size();
	}

	@Override
	public Product next() {
		// TODO Auto-generated method stub
		Product res = ProductCollection.this.products.get(this.index);
		this.index++;
		return res;
		
	}


	  
  }

}
