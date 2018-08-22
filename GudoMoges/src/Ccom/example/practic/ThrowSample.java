package Ccom.example.practic;

public class ThrowSample {
	 public static void checkEligibility(int studAge,int stuWeight) {
		 
		 if(studAge < 12&& stuWeight<40) {
			 throw new ArithmeticException("student is not eligible");
		 }else {
			 System.out.println("Student Enrty is valid");
		 }
		 
	 }
public static void main(String[]args) {
	checkEligibility(14,15);
	
}
}
///////////
class throwexample{
	void mymethod(int num)throws IOEception,ClassNotFoundEexception{
		if(num == 1 )
			throw new IOException("IOEzception Occurred")
			else
			throw new ClassNotFoundExceptin("classnotfoundwxceptopn")
			public class Ezample1{
			public static void main(Srting args[]) {
				try {
					ThrowEzample obj = new TthrowExample();
					obj.myMEHODS(1);
				}
				catch(Exception ex) {
					System.out.println(ex);
				
				}
			}
		}
	}
	 
	 if(studAge < 12&& stuWeight<40) {
		 throw new ArithmeticException("student is not eligible");
	 }else {
		 System.out.println("Student Enrty is valid");
	 }
	 
}
public static void main(String[]args) {
checkEligibility(14,15);