package NesteddTryCatchBlock;

public class try_cach {
	//main try_blick
	 {
		//try_block2
		try {
			//try_block3
			try {
				int arr[] = {1,2,3,4};
				System.out.println(arr[10]);
			} catch(ArithmeticEcewption e) { 
				System.out.println("Artimetic Exception");
				System.out.println("handled in try-block3");
			}
			
			catch(ArithmeticEcewption e) {
				System.out.println("Artimetic Exception");
				System.out.println("handled in try-block2");
				}
				catch(ArithmeticEcewption e3) {
					System.out.println("Artimetic Exception");
					System.out.println("handled in try-block");
					}
					catch (arrayindezoutofboundsexception e4){
					System.out.println("arrayindezoutofboundsexception");
					System.out.println("handled in try-block");}
								
					catch (Exception e5) {System.out.print("Exception");
					{System.out.println("Exceptoion");
					System.out.println("Inside parent try catch block");
					}
					{System.out.println("next statement");
					}
					}
					
					}
					
		