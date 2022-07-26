package home0725;

public class Store {
	public int itemNo;
	public String name;
	public int price;
	
	public Store() {
		
	}
	
	public Store(int itemNo) {
		this.itemNo = itemNo;
	}
	public Store(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	public void maxPriceItem() {
//		
//		for(int i =0; i<list.length; i++) {
//			if()
//		}
//	}
	
	
}
