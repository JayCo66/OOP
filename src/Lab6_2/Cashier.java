package Lab6_2;

import lab7_2.*;
import Lab6_3.FixedSalary;
import Lab7_2.DebitCard;
import Lab8_1.SavingsAccount;

public class Cashier {
	
	private String name;
	private double total;
	private double discount;
	private Product[] icProd;
	
	public Cashier (String name) {
		this.name = name;
	}
	
	public Cashier () {
	}
	
	public void printReceipt () {		
		
		System.out.println("\tPumpkin Shop ");
		
		for(Product prod : icProd) {
			if(prod != null) {
			System.out.println("\n"+prod);
			}
		}
		
		System.out.println("\t-------------\n");
		System.out.println("\tCARD DISCOUNT "+this.discount+" %\n");
		System.out.println("\tTotal\t" + total+"$");
	}
	
	public void doPayment(InventoryCart ic,SavingsAccount.DebitCard C) {
		System.out.println("\tCARD TYPE:"+C.type());
		System.out.println("CARD NUMBER:xxx-xxx-"+C.getSsn().substring(8));
		
		this.total = 0;
		this.discount = C.getDiscount();
		icProd = ic.getAllProduct();
		
		for(Product prod : icProd) {
			if(prod != null) {
			total += prod.getPrice();
			}
		}
		total = total - ((C.getDiscount()/100) * total);
		
	}

}
