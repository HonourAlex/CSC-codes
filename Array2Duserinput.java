package learn1;
import java.util.Scanner;

public class Array2Duserinput {
	


	    public static void main(String[] args) {
	        String[][] Array2Dforuserinput = new String[10][10];
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < Array2Dforuserinput.length; i++) {
	            for (int j = 0; j < Array2Dforuserinput[i].length; j++) {
	                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
	                Array2Dforuserinput[i][j] = scanner.nextLine();
	            }
	        }

	        System.out.println("\nYou entered:");
	        for (String[] row : Array2Dforuserinput) {
	            for (String value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	

}
