class SecondLargest{
	
	public static void main(String args[]){
		
		int a[] = {6,8,2,4,3,1,5,7};
		int temp;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				
				if(a[i] < a[j]){
					temp = a[i]; 
					a[i] = a[j];
					a[j] = temp;
				}	
			}
			//sorting the elements till ith value is 1 so that unneccessary sorting doesn't happen n save time
			if(i==1){
				break;
			}	
		}
		System.out.println("Second largest Element is :"+a[1]);
		
		//Second way which consumes less time than the above one
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++){
			if(a[i] > largest){
				
				secondLargest = largest;
				largest = a[i];
			} else if(a[i] > secondLargest  && a[i] != largest){
				
				secondLargest = a[i];
			}
			
		}
		if(secondLargest == Integer.MIN_VALUE){
			
			System.out.println("There is no second largest element in the list");
		} else {
			
			System.out.println("second largets element is " +secondLargest);
		}
		
	}
} 