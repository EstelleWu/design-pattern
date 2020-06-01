package observer.pushstyle;

public interface Observer {
	/*
	 * observer object know nothing about the data source
	 * it receive data from it
	 * */
	void update(int value);
}
