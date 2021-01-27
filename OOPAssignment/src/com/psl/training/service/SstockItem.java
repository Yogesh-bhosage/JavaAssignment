package com.psl.training.service;

import com.psl.training.model.StockItem;

public class SstockItem {
    StockItem stockItems[]=new StockItem[5];

    public SstockItem(){
        initStock();
    }
    public StockItem[] initStock(){
        //2.	Create 5 items - Milk, Chicken, Egg, Apple and Orange

        stockItems[0]=new StockItem(10001,"Milk",80,100);
        stockItems[1]=new StockItem(10002,"Chicken",400,100);
        stockItems[2]=new StockItem(10003,"Egg",100,50);
        stockItems[3]=new StockItem(10004,"Apple",400,80);
        stockItems[4]=new StockItem(10005,"Orange",350,100);
        return stockItems;

    }

    public StockItem getStockItemByName(int stockItemId){
        for (StockItem stockItem : stockItems) {
            if(stockItem.getItemNo()==stockItemId)
                return stockItem;
        }
        return null;
    }

    public int getStockqnt(int stockItemId){
        for (StockItem s:stockItems) {
            if(s.getItemNo()==stockItemId){
                return s.getQuantity();
            }
        }
        return 0;
    }

}
