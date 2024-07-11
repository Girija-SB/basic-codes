class LinearSearch{
	public static void main(String args[]){
		
		LinearSearch linearSearch = new LinearSearch();
		linearSearch.integerLinearSearch();
		linearSearch.stringLinearSearch();
			
	}
	
	//Integer
	void integerLinearSearch(){
	
		int array[] = {5,3,6,1,4,2};
		int item = 4;
		int temp=0;
		for(int i=0; i < array.length; i++){
			if(array[i] == item){
				System.out.println("Item present in "+i+" index position");
				temp = temp + 1;
			}
		}
		if(temp == 0){
			System.out.println("Item not present in the list");
		}
	}
	
	//String
	void stringLinearSearch(){
		
		String str[] = {"deepak", "amit", "rahul", "veronika", "Rupesh"};
		int temp = 0;
		String string = "amit";
		for(int i=0; i<str.length; i++){
			if(str[i].equals(string)){
				System.out.println("string present in "+i+" index position");
				temp = temp + 1;
			}
		}
		if(temp == 0){
			System.out.println("String is not present in the list");
		}
	}
}