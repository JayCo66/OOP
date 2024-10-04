package Lab12_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<item> itemList = new ArrayList<item> ();
		String choice = new String("y");
		double total = 0;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("Enter the name of the item: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Enter the unit price: ");
			double price = sc.nextDouble();
			System.out.print("Enter the quantity: ");
			int quantity = sc.nextInt();
			
			itemList.add(new item(name,price,quantity));
			
			System.out.print("Continue shopping (y/n)? ");
			choice = sc.next();
			}while(choice.equals("y"));
		
		sc.close();
		
		System.out.println("Final Shop Cart totals");
		
		for(int i=0; i<itemList.size(); i++) {
			System.out.println(itemList.get(i));
			total += (itemList.get(i).getPrice() * itemList.get(i).getQuantity());
		}
		System.out.println("total $ Amount in Cart: $"+total);
	}

}
