package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.StockPrice;

public interface StockPriceController {
	 public StockPrice insertStock(StockPrice stock);
     public StockPrice updateStock(StockPrice stock);
    public List<StockPrice> getStockPrice() throws SQLException;

}
