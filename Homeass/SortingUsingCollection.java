package week3.Homeass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] names ={"HCL", "Wipro", "Aspire Systems","CTS"} ;
		  List<String> words=new ArrayList<String>();
		  for (String string : names) {
			words.add(string);
		}
		  Collections.sort(words);
		  Collections.reverse(words);
		  System.out.println(words);
		  	}

}
