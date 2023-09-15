package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int m1=0,m2=1,m3,i,count=8;

		
	System.out.print(m1+" "+m2);	
	
	for( i = 2; i <= count-1; i++) {
		m3=m1+m2;
		System.out.print(" "+m3);
		m1=m2;
		m2=m3;
		
	}
				
}
	}






















