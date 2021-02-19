import java.util.Scanner;

public class ValidateEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String email = sc.next();
	//    String regex1 = "^[a-z]+";                             //UC1
	//    String regex2 = "^[a-z]+@[a-z]+$";                     //UC2
    //    String regex3 = "^[a-z]+@[a-z]+.[a-z]+$";              //UC3     
	//    String regex5 = "^[a-z_+-.]+@[a-z]+.[a-z]+$";          //UC4
	      String regex = "^[a-zA-Z0-9]+([_+-.]{0,1})([@]{1})[a-z0-1]+.[a-z]+(.?)([a-z]{2}?)$";     //UC5
	      boolean result = email.matches(regex);
	      if(result) {
	         System.out.println("Given email-id is valid");
	      } else {
	         System.out.println("Given email-id is not valid");
	      }
	}
}
