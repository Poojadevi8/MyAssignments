package week3.Homeass;

public class ReverseOddWords {

	public static void main(String[] args) {
	String str = "words plam a software testers";
	
	String[] words = str.split(" ");
	System.out.println("The sentence is: ");
	for (int i = 0; i <= words.length-1; i++) {
		
		if(i%2==0) {
			
			String me2=words[i];
			for (int k = 0; k < me2.length(); k++) {
				
			char[] charArray=me2.toCharArray();
           
				System.out.print(charArray[k]);
			
				}System.out.print(" ");
				}
		
		else {
			String me1=words[i];
			for (int j = me1.length()-1;j>=0;j--) {
				char[] charArray=me1.toCharArray();
			
				System.out.print(charArray[j]);
								
				}
			System.out.print(" ");
			}}}}
		
	
	
	

	
	
	
	
	
	