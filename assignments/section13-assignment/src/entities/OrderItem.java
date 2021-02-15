package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {}
	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		setPrice(product.getPrice());
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return quantity*price;
	}
	
	@Override
	public String toString() {
		return "Order items: \n" + product.getName() + ", $ " + 
				String.format("%.2f", price) + ", Quantity: " +
				", Subtotal: $" + String.format("%.2f", subTotal());
	}
}
