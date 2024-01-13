package assignments.week1;

public class IsPrime {
	
	public static void main(String[] args) {
		int num=23;
		boolean prim=false;
		for (int i=2;i<=num-1;i++) {
			if (num%i==0) {
				prim=true;
				break;
				}
		}
			if (!prim) {
				System.out.println(num+" is prime number");
				}
			else {
				System.out.println(num+" is not prime number");
			}
			
				
		}
}
	

		
		






