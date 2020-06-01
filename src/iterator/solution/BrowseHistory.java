package iterator.solution;

import java.util.ArrayList;
import java.util.List;

// nested class directly access its parent class's data members
public class BrowseHistory {
	private List<String> urls = new ArrayList<>();
	public void push(String url) {
		urls.add(url);
	}
	
	public String pop() {
		int lastIndex = urls.size() - 1;
		String res = urls.get(lastIndex);
		urls.remove(lastIndex);
		return res;
	}
	
	public Iterator createIterator() {
		return new ListIterator();
	}
	
	/*
	 * why nested class?
	 * part of the implementation of BrowseHistory class;
	 * nested class can access all the members, even private members
	 * */
	
	public class ListIterator implements Iterator{
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (this.index < BrowseHistory.this.urls.size());
		}

		@Override
		public String current() {
			// TODO Auto-generated method stub
			return BrowseHistory.this.urls.get(index);
		}

		@Override
		public void next() {
			this.index++;
			
		}
		
	}
}

/*  pass the current browsehistory object to iterator constructor
public class BrowseHistory {
	private List<String> urls = new ArrayList<>();
	
	public void push(String url) {
		urls.add(url);
	}
	
	public String pop() {
		int lastIndex = urls.size() - 1;
		String res = urls.get(lastIndex);
		urls.remove(lastIndex);
		return res;
	}
	
	public Iterator createIterator() {
		return new ListIterator(this);
	}
	

	
	public class ListIterator implements Iterator{
		private BrowseHistory history;
		private int index;
		
		public ListIterator(BrowseHistory history) {
			this.history = history;
		}
		
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (this.index < this.history.urls.size());
		}

		@Override
		public String current() {
			// TODO Auto-generated method stub
			return this.history.urls.get(index);
		}

		@Override
		public void next() {
			this.index++;
			
		}
		
	}
}
*/