package Lab12_2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		int set = 1;
		Set<Integer> A = new TreeSet<Integer>();
		Set<Integer> B = new TreeSet<Integer>();
		String command = new String("");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll(" ","");
		input = input.replaceAll("\\[",",");
		input = input.replaceAll("\\]",",");
		input = input.replaceFirst(",","");
		
		String[] num = input.split(",");
		
		for(String i:num) {
			if("+*-".contains(i)) {
				set = 2;
				if(i.equals("+")) {
					command = "+";
				}else if(i.equals("-")) {
					command = "-";
				}else {
					command = "*";
				}
			}else if(set == 1) {
				A.add(Integer.parseInt(i));
			}else if(set == 2) {
				B.add(Integer.parseInt(i));
			}
		}
		
		if(command.equals("+")) {
			Set<Integer> union = new TreeSet<Integer>(A);
			union.addAll(B);
			System.out.println(union+"");
			
		}else if(command.equals("*")) {
			Set<Integer> intersection = new TreeSet<Integer>(A);
			intersection.retainAll(B);
			System.out.println(intersection+"");
			
		}else {
			Set<Integer> difference = new TreeSet<Integer>(A);
			difference.removeAll(B);
			System.out.println(difference+"");
		}
	}

}
