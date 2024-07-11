class SpecialChar{

	public static void main(String args[]){
	
		String s = "CloudTech$%^&";
		int count = 0;
		String specialCharRemoved = "";
		
		for(int i=0; i < s.length(); i++){
			
			if(!Character.isDigit(s.charAt(i)) &&
			   !Character.isLetter(s.charAt(i)) &&
			   !Character.isWhitespace(s.charAt(i))){
				   
				count++;
			} else {
				specialCharRemoved = specialCharRemoved + s.charAt(i);
			}
		}
		if(count == 0){
			System.out.println("There are no special characters in string");
		} else {
			System.out.println("Special characters found " +count);
		}
		
		System.out.println("Special Characters removed " +specialCharRemoved);
	}
}