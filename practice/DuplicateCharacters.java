package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {
	
	public static void main(String[] srgs) {
		
//		Scanner sc = new Scanner(System.in);
//		int array[] = sc.nextInt();
		
		
		// BRUTE FORCE METHOD( suitable for only one duplicate element, for more than one duplicate element the output will not be correct) 
		int array[] = {2, 4, 9, 1, 8, 9, 3, 1, 1};
		
		for(int i=0; i < array.length-1; i++) {
			for(int j=i+1; j < array.length; j++) {
				if(array[i] == array[j] && i != j) {
					System.out.print(array[j] + ", ");
				}
			}
		}
		
		//SET INTERFACE
		Set<Integer> set = new HashSet<Integer>();
		for(int number : array) {
			if(set.add(number) == false) {
				System.out.print(number + ", ");
			}
		}
		
		//HASH TABLE
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int number : array) {
			Integer count = map.get(number);
			if(count == null) {
				map.put(number, 1);
			} else {
				count = count + 1;
				map.put(number, count);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> es = map.entrySet();
		for(Map.Entry<Integer, Integer> mapEntry : es) {
			if(mapEntry.getValue() > 1) {
				System.out.print(mapEntry.getKey() +" ");
			}
		}
	}
	
}
