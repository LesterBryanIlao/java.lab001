import java.util.Scanner;
public class Answer1 {

	public static void main(String[] args) {  
		Scanner scanner = new Scanner(System.in);
		
		// Program entry point
		System.out.print("Enter mark: ");
		int mark = scanner.nextInt();   // Set the value of "mark" here!
	    System.out.println("The mark is " + mark);
	 
        // if-else statement
        if ( mark>=50 ) {
        	System.out.println("PASS");
        	
        } else {
        	System.out.println("FAIL");
        }
        
        System.out.println("DONE");
        scanner.close();
	}
}
