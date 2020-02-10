package calc;
import java.util.Scanner;
import op.Op;
public class Calc {
	    public static void main(String[] args) {
	    	Scanner sravani = new Scanner(System.in);

	        System.out.println("SIMPLE CALCULATOR\n");
	        System.out.println("1.addition\n");
	        System.out.println("2.subtraction\n");
	        System.out.println("3. Multiplication\n");
	        System.out.println("4. Division\n");
	       
	        System.out.print("Select your Option: \n");
	        int choice = sravani.nextInt();
	        System.out.println();
	        if (choice == 1){
	           Op.addition();
	        }
	        else if (choice == 2){
	            Op.subtraction();
	        
	        }
	        else if (choice == 3){
		           Op. multiplication();
		        }
	        else if (choice == 4){
	            Op.division();
	        }
	       
	        else
	        	System.out.println("Invalid Option");
	        sravani.close();
	    }

}