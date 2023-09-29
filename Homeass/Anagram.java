package week3.Homeass;


import java.util.Arrays;

public class Anagram {

			
		public static void main(String[] args) {
		    
		String text1 = "stops";
		String text2 = "potss";
								if(text1.length() != text2.length()){
									System.out.println("it is mismatched");
									
									}
								
									char[] name1=text1.toCharArray();
									char[] name2=text2.toCharArray();
									text1=text1.toLowerCase();
									text2=text2.toLowerCase();
									
									Arrays.sort(name1);
									Arrays.sort(name2);
									boolean result=Arrays.equals(name1,name2);
									if(result) {
							System.out.println("The given strings are Anagram");
						}
						else {
							System.out.println("The given strings are not an Anagram");
						}
					}
	}
				
			
					

	                


