class MaximumMinimum{
	
	public static void main(String args[]){
		
		int a[] = {4,3,5,2,1,6};
		int max = a[0];
		for(int i=1; i < a.length; i++){
		
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println("Maximum element is "+max);
		
		//Minimim
		int min = a[0];
		for(int i=1; i < a.length; i++){
		
			if(a[i] < min){
				min = a[i];
			}
		}
		System.out.println("Minimum element is "+min);
	}
}