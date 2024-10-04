package Lab5;

public class InventoryCart {
	
	private int itemlimit;
	private int count;
	private int last;
	private Product[] products;
	
	public InventoryCart (int itemlimit) {
		this.itemlimit = itemlimit;
		this.products = new Product[itemlimit];
		this.count = 0;
	}
	
	public void add (Product p) {
		if(this.count < this.itemlimit) {
			this.products[count] = p;
			this.last = this.count;
			this.count++;
		}
	}
	
	public Product getProduct () {
		if(this.last >= 0) {
			Product returnProd = this.products[this.last];
			this.products[this.last] = null;
			this.last--;
			this.count = this.last;
			
			return returnProd;
		}
		return null;
	}
	
	public Product[] getAllProduct () {
		Product[] returnProds = this.products;
		this.products = new Product[this.itemlimit];
		
		return returnProds;
	}
}
