package iterator.solution;

import java.util.ArrayList;
import java.util.List;

/* internal changed to array
 * array iterator
 */
public class BrowseHistory1 {
	private String[] urls = new String[10];
	private int count = 0;
	public void push(String url) {
		urls[count] = url;
		count++;
	}
	
	public String pop() {
		count--;
		return urls[count];
	}
	
	public Iterator createIterator() {
		return new ArrayIterator();
	}
	
	/*
	 * why nested class?
	 * part of the implementation of BrowseHistory class;
	 * nested class can access all the members, even private members
	 * */
	
	public class ArrayIterator implements Iterator{
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return this.index < BrowseHistory1.this.count;
		}

		@Override
		public String current() {
			// TODO Auto-generated method stub
			return BrowseHistory1.this.urls[index];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			this.index++;
			
		}
		
	}
}

