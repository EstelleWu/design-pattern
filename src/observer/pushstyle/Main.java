package observer.pushstyle;

public class Main {

	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		Observer sheet1 = new SpreadSheet();
		Observer sheet2 = new SpreadSheet();
		Observer chart1 = new Chart();
		dataSource.addObserver(sheet1);
		dataSource.addObserver(sheet2);
		dataSource.addObserver(chart1);
		dataSource.setValue(1);
	}

}
