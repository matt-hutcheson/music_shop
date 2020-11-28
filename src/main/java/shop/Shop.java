package shop;

import instruments.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private double potentialProfit;
    public Shop(){
        this.stock = new ArrayList<>();
        this.potentialProfit = 0;
    }

    public void addStock(ISell newStock){
        this.stock.add(newStock);
    }

    public ArrayList getStock(){
        return stock;
    }

    public ISell sell(ISell soldStock){
        int index = stock.indexOf(soldStock);
        return stock.remove(index);
    }

    public void calcPotentialProfit(){
        for (ISell item: stock){
            potentialProfit += item.calcMarkup();
        }
    }

    public double getPotentialProfit(){
        return potentialProfit;
    }
}
