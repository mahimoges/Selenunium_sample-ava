
public class FibonacciSer {

	public static void main(String[] args) {
		/*
		 * fibonacci series of 7 nymbers;
		 * 
		 */
		// TODO Auto-generated method stub
		int count =7;
		int num1=0;
		int num2=1;
		System.out.print("fibonacci seres of "+count+"numbers:");
		int i=1;
		while(i<=count){
		System.out.println(num1 +  "");
		int sumOftwo=num1 + num2;
		num1 = num2;
		num2 = sumOftwo;
		i++;
		

		}
	}
	}
