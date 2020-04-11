package TechGig.samples;

import java.util.Scanner;

public class ReadInput {

	public static boolean isInteger (String s) {
		try { 
			Integer.valueOf(s);
		} catch (NumberFormatException nbe) {
			return false;
		} catch (NullPointerException npe) {
			return false;
		}
		return true;
	}
	public static boolean isFloat (String s) {
		try { 
			Float.valueOf(s);
		} catch (NumberFormatException nbe) {
			return false;
		} catch (NullPointerException npe) {
			return false;
		}
		return true;
	}
	public static boolean isString (String s) {
		try { 
			String.valueOf(s);
		} catch (NumberFormatException nbe) {
			return false;
		} catch (NullPointerException npe) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        if(isInteger(sentence)) {
    		System.out.println("This input is of type Integer");
        } else if (isFloat(sentence)) {
    		System.out.println("This input is of type Float");
        } else if (isString(sentence)) {
    		System.out.println("This input is of type string");
        } 
        else {
    		System.out.println("This is something else.");

        }
    }

}
