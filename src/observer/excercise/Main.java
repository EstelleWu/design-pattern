package observer.excercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockListView stockListView = new StockListView();
		StatusBar statusBar = new StatusBar();
		Stock1 stock1 = new Stock1("1", 1);
		
		stockListView.addStock(stock1);
		statusBar.addStock(stock1);
		
		stock1.setPrice(2);
	}

}
