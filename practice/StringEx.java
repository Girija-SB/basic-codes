package practice;

import java.util.Scanner;

public class StringEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringEx stringEx = new StringEx();
		stringEx.twoE(str);
		
	}
	
	public boolean twoE(String str) {
		  int count = 0;
		  for (int i=0; i<str.length(); i++) {
		    String sub = str.substring(i, i+1);
		    if (sub.equals("e")) count++;
		  }
		  if (count == 2) {
			  System.out.print(true);
			  return true;
		  }
		  System.out.print(false);
		  return false;
		  // last 2 lines can be written simply as "return (count == 2);"
		}
	
//	public boolean twoEUsingCharAt(String str) {
//		  int count = 0;
//		  for (int i=0; i<str.length(); i++) {
//		    if (str.charAt(i) == 'e') count++;
//		  }
//		  if (count == 2) return true;
//		  return false;
//		  // this last if/else can be written simply as "return (count == 2);"
//		}

}
