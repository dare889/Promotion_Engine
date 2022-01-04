package promotionEngine;

public class Product {
	public String id;
	public long price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	public Product(String id) {
		this.id = id;
		switch(id) {
			case "A" :
				this.setPrice(50);
				break;
			case "B" :
				this.setPrice(30);
				break;
			case "C" :
				this.setPrice(20);
				break;
			case "D" :
				this.setPrice(15);
				break;
		}
	}
}
