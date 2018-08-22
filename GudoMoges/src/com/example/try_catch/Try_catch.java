package com.example.try_catch;

public class Try_catch {
	public static void main(String[]args )
	{int num1;
	int num2;
	
	
	try {
		num1= 0;
		num2=50/num1;
				System.out.println(num1);}
	catch (Exception e) {
		System.out.println("error dividing numbers");
	}
	System.out.println("error dividing numbers");
	catch (Exception e) {
			{System.out.println("some thing happend");
			finally
			/*
			 * finally block will always execute even if there is no exception in try block
			 */
			
			{System.out.println("this is finally block");
			}
			
			try {
				int arr[]= new int[7];
				arr[10]= 10/5;
	
						System.out.println("last statement of try block");}
			catch (ArithmeticException e) {
				System.out.println("error dividing numbers");
			}
			System.out.println("you shoukd not dividee a number by zero");
			catch (ArrayIndexOutOfBoundsExcepton e) 
					{System.out.println("Accessing array elements outside of the limit");}
					catch(exception e) 
					{System.out.println("some other exception");
					}
					
					
					
					{System.out.println("this is finally block");
					
					}
		
			}


