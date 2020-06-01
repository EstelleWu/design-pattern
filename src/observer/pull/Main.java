package observer.pull;

public class Main {
	/*
	 * when subject has changes, it notifies all its observers
	 * (subject has a list of observers)
	 * each observer object can decide what kind of info it want from its datasource
	 * (observer object has its own data source)
	 * */
	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		Observer sheet1 = new SpreadSheet(dataSource);
		Observer sheet2 = new SpreadSheet(dataSource);
		Observer chart1 = new Chart(dataSource);
		dataSource.addObserver(sheet1);
		dataSource.addObserver(sheet2);
		dataSource.addObserver(chart1);
		dataSource.setValue(1);
	}

}
