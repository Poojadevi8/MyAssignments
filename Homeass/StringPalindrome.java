package week3.Homeass;

public class StringPalindrome {

	public static void main(String[] args) {
		String word = "Madam", reverse= "";
		int strlength = word.length();
		
				for (int i = (strlength - 1); i >=0; --i) {
		      reverse = reverse + word.charAt(i);
		    
				}
			if(word.toLowerCase().equals(reverse.toLowerCase())) {
				System.out.println(word+" is a palindrome");
			}
			else {
				System.out.println(word +" is no a palindrome");
				
			}
			
		}
	}

	

