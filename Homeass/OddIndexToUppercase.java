package week3.Homeass;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
	String test="changeme";
	char[] name=test.toCharArray();
		 
		for (int i = 0; i < name.length; i=i+2) {
					
				
			name[i]=Character.toUpperCase(name[i]);
			}
				System.out.println(new String(name));
			}		
			
						
}

	


