package Lab5;

public class Cashier {
	
	private String name;
	
	public Cashier (String name) {
		this.name = name;
	}
	
	public void printReceipt (InventoryCart ic) {
		double total = 0;
		Product[] icProd = ic.getAllProduct();
		
		System.out.println("\tPumpkin Shop " + "("+ name +")");
		
		for(Product prod : icProd) {
			if(prod != null) {
			total += prod.getPrice();
			System.out.println("1 x "+prod.getName()+"\t("+prod.getCode()+")\t"+prod.getPrice());
			}
		}
		
		System.out.println("\t-------------");
		System.out.println("\tTotal\t" + total+"$");
	}

}
