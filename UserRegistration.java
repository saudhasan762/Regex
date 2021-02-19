import java.util.Scanner;

public class UserRegistration {
	static String first,last,regex,email,pnumber,pass;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		UserRegistration user=new UserRegistration();
		 
	    user.checkFirstName();
	    user.checkLastName(); 
	    user.checkEmail();
	    user.checkMobileNumber();
	    user.checkPassword();                         
	}
	
	void checkFirstName() {
		System.out.println("Enter first name: ");
	    first = sc.nextLine();
		regex = "^[A-Z]{1}[a-z]{2,}";
		boolean result = first.matches(regex);
		if(result)
	         System.out.println("Valid first name");
	    else 
	         System.out.println("Invalid first name");			
	}
	
	void checkLastName() {
		System.out.println("Enter last name: ");
	    last = sc.nextLine();
		regex = "^[A-Z]{1}[a-z]{2,}";
		boolean result = last.matches(regex);
		if(result)
	         System.out.println("Valid last name");
	    else 
	         System.out.println("Invalid last name");      
	}
	
	void checkEmail() {
		System.out.println("Enter email: ");
	    email = sc.nextLine();
		regex = "^[a-zA-Z0-9]+[a-zA-Z0-9([_+-.]{1})]+(@{1})[a-z0-9]+.[a-z]+(.?)([a-z]{2}?)$";
		boolean result = email.matches(regex);
		if(result)
	         System.out.println("Valid Email");
	    else
	         System.out.println("Invalid Email");      
	}
	
	void checkMobileNumber() {
		System.out.println("Enter Mobile Number: ");
		pnumber = sc.nextLine();
		regex = "^([9]{1}[1]{1})\\s{1}[0-9]{10}$";
		boolean result = pnumber.matches(regex);
		if(result)
	         System.out.println("Valid Number");
	    else 
	         System.out.println("Invalid Number");      
	}
	
	void checkPassword() {
		 System.out.println("Enter Password: ");
		    pass = sc.nextLine();
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
