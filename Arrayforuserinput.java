package learn1;
import java.util.Scanner;

public class Arrayforuserinput {
	



	    public static void main(String[] args) {
	        String[] Arrayforuserinput = new String[10];
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < Arrayforuserinput.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            Arrayforuserinput[i] = scanner.nextLine();
	        }
	        System.out.println("\nYou entered:");
	        for (int i = 0; i < Arrayforuserinput.length; i++) {
	            System.out.println("Index " + i + ": " + Arrayforuserinput[i]);
	        }

	        scanner.close();
	    }
	

}
