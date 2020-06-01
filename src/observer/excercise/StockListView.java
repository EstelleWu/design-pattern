package observer.excercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer{
    private List<Stock1> stocks = new ArrayList<>();

    public void addStock(Stock1 stock) {
        stocks.add(stock);
        stock.addObserver(this);   // this is brilliant!!!! 
    }

    public void show() {
        for (Stock1 stock : stocks)
            System.out.println(stock);
    }

	@Override
	public void update() {
		show();
		
	}
}
