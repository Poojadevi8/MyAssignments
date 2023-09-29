package week3.Homeass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list= {3, 2, 11, 4, 6, 7};
		Arrays.sort(list);
		
		List<Integer> num=new ArrayList<Integer>();
		for (Integer integer : list) {
			num.add(integer);
			
		}
		int i= list.length-2;
				
		int secondlargest=num.get(i);
		System.out.println("The second largest no. is: " + secondlargest);
			}
            }
