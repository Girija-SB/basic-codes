import java.util.Scanner;

class ReverseOfString{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.next();
		String reverse = " ";
		for(int i = str.length()-1; i >= 0; i--){
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of a string " +reverse);
	}
}

import java.util.Scanner
class ReverseAString{
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String reverse = "";
		for(int i = name.length()-1; i >= 0; i--){
			
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse a string " +reverse);
	}	
}



































import java.util.Scanner
class ReverseAString{
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String reverse = "";
		for(int i = name.length()-1; i <= 0; i--){
			
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse a string " +reverse);
	}	
}