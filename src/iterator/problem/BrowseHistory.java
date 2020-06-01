package iterator.problem;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
	private List<String> urls = new ArrayList<>();
	/*
	 * what's the problem:
	 * if we don't want to use list to store the urls, 
	 * we end with several breaking changes (push, pop, getUrls, and main func)
	 * rule: changing the internals of an object should not affect client programmers
	 * breaking changes in BrowseHistory class is tolerable, but only in this class
	 *  
	 * */
	public void push(String url) {
		urls.add(url);
	}
	
	public String pop() {
		int lastIndex = urls.size() - 1;
		String res = urls.get(lastIndex);
		urls.remove(lastIndex);
		return res;
	}
	
	public List<String> getUrls(){
		return this.urls;
	}
}
