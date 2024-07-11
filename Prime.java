import java.util.Scanner;

class Prime{

	public static void main(String args[]){
	
		/* prints whether the number is prime or not
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int temp =0;
		for(int i = 2; i <= number-1; i++){
			if(number % i == 0){
				temp =temp +1;
			} 
		}
		if(temp > 0){
			System.out.println("Number is not a prime");
		} else {
			System.out.println("Number is a prime number");
		}
		*/
		
		//prints list of prime numbers
		for(int no = 1; no <= 100; no++){
			int temp = 0;
			for(int j = 2; j <= no-1; j++){
				if(no % j == 0){
						temp = temp + 1;
				}
			}
			if(temp == 0){
				System.out.println(no);
			}
		}
	}
}