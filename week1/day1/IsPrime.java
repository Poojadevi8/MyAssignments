package week1.day1;

public class IsPrime {

	private void isPrimeNumber(int num) {
		// TODO Auto-generated method stub



boolean flag = false;
		

			for (int i = 2; i < num/2; i++) {
				if(num%i ==0) {
					flag =false;
					break;
				}
	            else
	            {
	                flag = true;
	            }
	         
			}
			if(flag!=true) {
					System.out.println(num +" not a prime number");
				}
				else {
					System.out.println(num  + " a prime number");
					
			}
			
				
			}
	
		public static void main(String[] args) {
			IsPrime isPrimeNumber=new IsPrime();
			isPrimeNumber.isPrimeNumber(61);
		}
				
}
	
	

