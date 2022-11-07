import java.util.Scanner;
public class Answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program entry point
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter number: ");
	    int number = scanner.nextInt();       // Set the value of "number" here!
	    System.out.println("The number is " + number);
	    
      	if ( number%2==0 ) {
	    	System.out.println("Even Number");   // even number
	    	
	    } else {
	    	System.out.println("Odd Number");   // odd number
	    }
	    
	    System.out.println("bye!");
	    scanner.close();
	}

}
