import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePincode {
	public static void isValidPin(String pinCode) {
	//	String regex1 = "^([1-9]{1}[0-9]{2}[0-9]{3}$";
	//	String regex2 = "^(!([$&+,:;=?@#|'<>.^*()%!-][a-zA-z]))([1-9]{1}[0-9]{2}[0-9]{3}$)";
	//	String regex3 = "^[1-9]{1}[0-9]{2}[0-9]{3}!([$&+,:;=?@#|'<>.^*()%!-][a-zA-z])$";
		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		boolean result =pinCode.matches(regex);
		if(result) {
			System.out.println("Pincode is valid");
		}
		else
			System.out.println("Pincode is Invalid");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pin;
		System.out.println("Enter the pincode");
		pin = scan.nextLine();
		isValidPin(pin);
	}

}
