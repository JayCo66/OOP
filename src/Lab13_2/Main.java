package Lab13_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import Lab13_1.item;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<item> items = new ArrayList<item>();
		Reader R = new FileReader("sell.txt");
		BufferedReader bufferR = new BufferedReader(R);
		String data;
		while((data = bufferR.readLine()) != null) {
			String[] goods = data.split(",");
			item i = new item(goods[0],Double.parseDouble(goods[1]),Integer.parseInt(goods[2]));
			items.add(i);
		}
		bufferR.close();
		R.close();
		
		for(item i : items) {
			System.out.println(i+"\n");
		}
	}
}