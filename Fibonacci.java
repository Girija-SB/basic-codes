//import java.util.Scanner;

class Fibonacci{
	
	public static void main(String args[]){
			
		///Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a number");
		//int number = scanner.nextInt();
		
		int a=0, b=1, c;
		for(int i = 0; i <= 10; i++){
			
			c = a + b;
			System.out.println(" " +c);
			a = b; 
			b = c;
		}
	}	

} 