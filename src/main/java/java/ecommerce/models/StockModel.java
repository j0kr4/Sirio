package java.ecommerce.models;

public class StockModel {

    public String product_name = "";
    public String stock = "0";

    public StockModel(String product_name, String stock) {
        this.setProductName(product_name);
        this.setStock(stock);
    }

    public String getProductName() {
        return product_name;
    }

    public void setProductName(String product_name) {
        this.product_name = product_name;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}