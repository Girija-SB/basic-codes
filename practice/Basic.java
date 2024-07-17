package practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Basic {
	
	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		
		//swap two numbers without using 3rd variable
//		System.out.println("Enter two numbers ");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println(a);
//		System.out.println(b);
		
		//Reverse of string
//		System.out.println("Enter a string : ");
//		String str = scanner.next();
//		String rev = " ";
//		for(int i = str.length()-1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
		
		//nth largest number
		int array[] = {11, 4, 9, 2, 5, 6};
		int temp;
		for(int i=0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j]; 
					array[j] =temp;
				}
			}
		}
		System.out.println("Second largest number : " +array[1]);
		
		/*
		 * int a=10, b=20, c=30;
		 * if(a>b && a>c){
		 * sop("a is greater");
		 * } else if(b>c && b>a){
		 * sop("b is greater");
		 * } else {
		 * sop("c is greater");
		 * }
		 * 
		 * 
		 * even or odd
		 * int no=12;
		 * if(no%2 == 0){
		 * sop(no is even);
		 * } else (
		 * sop(no is odd)
		 * }
		 */
		
	}

}
