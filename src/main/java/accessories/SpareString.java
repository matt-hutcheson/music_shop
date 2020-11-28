package accessories;

import instruments.ISell;

public class SpareString implements ISell {
    private double buyingPrice;
    private double sellingPrice;
    private String stockType;

    public SpareString(double buyingPrice, double sellingPrice){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.stockType = "Stock";
    }

    public double calcMarkup(){
        return (sellingPrice-buyingPrice);
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getStockType() {
        return stockType;
    }
}
