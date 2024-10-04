package Lab13_1;

import java.io.Writer;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		String isNotDone = "y";
		String name;
		double price;
		int quantity;
		ArrayList<item> items = new ArrayList<item>();
		double total = 0;
		Scanner sc = new Scanner(System.in);
		
		while(!isNotDone.equals("n")) {
			System.out.println("Enter the name of the item: ");
			name = sc.next();
			System.out.println("Enter the unit price: ");
			price = sc.nextDouble();
			System.out.println("Enter the quantity: ");
			quantity = sc.nextInt();
			
			items.add(new item(name, price, quantity));
			
			System.out.println("continue shopping (y/n)? ");
			isNotDone = sc.next();
		}
		sc.close();
		
		System.out.println("Final Shopping Cart totals");
		for(item i : items) {
			double totalPeritem = i.getQuantity()*i.getPrice();
			total += totalPeritem;
			System.out.println(i.getName()+"\t$"+i.getPrice()+"\t"+i.getQuantity()+"\t$"+totalPeritem);
		}
		
		try {
			Writer fWrite = new FileWriter("sell.txt");
			for(item i : items)
				fWrite.write(i+"\n");
			
			fWrite.close();
			
		}catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}catch (IOException e) {
			System.out.println("Error");
		}

		System.out.println("Total $ Amount in Cart: $"+total);
	}
}
