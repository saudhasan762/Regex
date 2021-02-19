import java.util.Scanner;

public class UserRegistration {
	static String first,last,regex,email,pnumber,pass;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first name: ");
	    first = sc.next();
	    checkFirstName();
	    System.out.println("Enter last name: ");
	    last = sc.next();
	    checkLastName();
	    System.out.println("Enter email: ");
	    email = sc.next();
	    checkEmail();
		System.out.println("Enter Mobile Number: ");
		pnumber = sc.next();
	    checkMobileNumber();
	    System.out.println("Enter Password: ");
	    pass = sc.next();
	    checkPassword();                         
	}
	
	static void checkFirstName() {
		regex = "^[A-Z]{1}[a-z]{2,}";
		boolean result = first.matches(regex);
		if(result)
	         System.out.println("Valid first name");
	    else 
	         System.out.println("Invalid first name");			
	}
	
	static void checkLastName() {
		regex = "^[A-Z]{1}[a-z]{2,}";
		boolean result = last.matches(regex);
		if(result)
	         System.out.println("Valid last name");
	    else 
	         System.out.println("Invalid last name");      
	}
	
	static void checkEmail() {
		regex = "^[a-zA-Z0-9_+-.]+@[a-z]+.[a-z]+(.?)([a-z]+?)$";
		boolean result = email.matches(regex);
		if(result)
	         System.out.println("Valid Email");
	    else
	         System.out.println("Invalid Email");      
	}
	
	static void checkMobileNumber() {
		regex = "^([9]{1}[1]{1})[0-9]{10}";
		boolean result = pnumber.matches(regex);
		if(result)
	         System.out.println("Valid Number");
	    else 
	         System.out.println("Invalid Number");      
	}
	
	static void checkPassword() {
	//	regex1 = "^[a-zA-z0-9]{8,}$";
	//	regex2 = "^(?=.*?[A-Z])[A-Za-z]{8,}$";
	//	regex3 = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z]).{8,}$";
		regex = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z])(?=.*[#?!@$%^&*-]).{8,}$";
		boolean result = pass.matches(regex);
		if(result)
	         System.out.println("Valid password");
	    else 
	         System.out.println("Invalid password");      
	}
}
