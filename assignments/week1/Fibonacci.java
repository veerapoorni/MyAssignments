package assignments.week1;

public class Fibonacci {

	public static void main(String[] args) {
		int range=10;
		int first=0;
		int second=1;
		for (int i=0;i<=range;i++) {
			System.out.println(first+" ");
			int three = first + second;
			first = second;
			second = three;			
		}
		//System.out.println("");

	}

}
