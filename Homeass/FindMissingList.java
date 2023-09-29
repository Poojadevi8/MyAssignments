package week3.Homeass;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class FindMissingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] num={1, 2, 3, 4, 10, 6, 8};
     Arrays.sort(num);
     
     List<Integer> name=new ArrayList<Integer>();
     for (Integer create : num) {
    	 name.add(create);
		
	}
     for(int i = 0; i< name.size() -1; i++){
        	 int first=name.get(i);
    	 int second=name.get(i+1);
		if(first + 1 != second){
			int missingElement = first + 1;
			System.out.println("missingElement:" + missingElement);
		}
     }
	}
}

