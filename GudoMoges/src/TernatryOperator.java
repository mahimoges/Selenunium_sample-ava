import java.util.Scanner;

public class TernatryOperator {

	//variable num=(expression)? value if true: value if false
		// if value is true print the value on the left side : if value is false , print the right side
		
		public static void main(String[] args)
		{
			int num1;
			int num2;
			int num3;
			
			num1=25;
			
			num2=(num1==10)? 100:200;
			
			System.out.println(num2);
			
			num2=(num1==25)? 100:200;
			System.out.println(num2);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first numer");
			int numb1 = scan.nextInt();
			System.out.println("Enter the second number");
			int numb2= scan.nextInt();
			System.out.println("Enter the third number");
			int numb3= scan.nextInt();
		
			
			int temp = (numb1>numb2)? numb1:numb2;
			int result= (numb3>temp)? numb3:temp;
			
			System.out.println(result);
			
			Scanner scan1= new Scanner(System.in);
			System.out.println("Enter the first numer");
				int number1 = scan.nextInt();
				System.out.println("Enter the second number");
				int number2= scan.nextInt();
				System.out.println("Enter the third number");
				int number3= scan.nextInt();
			
			int lowest=(number1<number2)? number1:number2;
			int result2 = (number3<lowest)? number3:lowest;
			
			System.out.println(result2);
			scan.close();

			
			
}
}
