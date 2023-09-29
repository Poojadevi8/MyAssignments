package week3.Homeass;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] names1= {3, 2, 11, 4, 6, 7};
	int[] names2= {1, 2, 8, 4, 9, 7};
	List<Integer> list1=new ArrayList<Integer>();
	for (Integer object1 : names1) {
		list1.add(object1);
	}
	
	List<Integer> list2=new ArrayList<Integer>();
	for (Integer object2 : names2) {
		list2.add(object2);
	}
	
	
	for (Integer compare : list1) {
		if(list2.contains(compare)) {
			System.out.println("The intersections are:" +compare);
		}
		
	}
	}	

}


