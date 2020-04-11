package TechGig.samples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInputDataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			sc.nextInt();
    		System.out.println("This input is of type Integer");
		} catch (InputMismatchException ime) {
			try {
			sc.nextFloat();
    		System.out.println("This input is of type Float");
			} catch (InputMismatchException ime2) {
				
				try {
					sc.next();
		    		System.out.println("This input is of type string");

				} catch (InputMismatchException ime3) {
		    		System.out.println("This is something else.");

				}
			}
		}
		
	}
}
