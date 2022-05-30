package java.ecommerce.cart;

public class CartItem {

	private long productId;
    private int quantity;
    private int price;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }

    @Override
    public boolean equals(Object o){
        CartItem item = (CartItem) o;
        return item!= null && item.getProductId()==this.getProductId();
    }
}
