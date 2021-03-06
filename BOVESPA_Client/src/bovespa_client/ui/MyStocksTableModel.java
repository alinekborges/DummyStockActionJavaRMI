/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bovespa_client.ui;

import bovespa.Order;
import bovespa.Stock;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Table model to fill UI of my stocks
 * @author alineborges
 */
public class MyStocksTableModel extends AbstractTableModel {
    
    public ArrayList<Stock> stocks;
            
    public MyStocksTableModel(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    @Override
    public int getRowCount() {
        return stocks.size();
    }

    @Override
    public String getColumnName(int col) {
        if (col == 0) { return "STOCK"; }
        if (col == 1) { return "PRICE"; }
        if (col == 2) { return "QUANTITY"; }
        
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Stock stock = stocks.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return stock.name;
            case 1:
                return stock.price;
            case 2:
                return stock.quantity;
            default:
                return "";
        }
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

}
