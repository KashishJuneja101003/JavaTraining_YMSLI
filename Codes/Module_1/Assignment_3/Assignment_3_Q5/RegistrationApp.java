package Assignment_3_Q5;

public class RegistrationApp {

	public static void main(String[] args) {
		try {
			RegisterUser user1 = new RegisterUser("Kashish", "India");
			System.out.println(user1 + " registered Successfully.");
			
			RegisterUser user2 = new RegisterUser("Alex", "Australia");
			System.out.println(user2 + " registered Successfully.");
			
		} catch (InvalidCountryException e) {
			System.out.println("Registation Failed: " + e.getMessage());
		}
		
	}

}
