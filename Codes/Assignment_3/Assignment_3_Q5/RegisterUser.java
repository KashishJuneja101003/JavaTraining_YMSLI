package Assignment_3_Q5;

public class RegisterUser {
	private String userName;
	private String userCountry;
	private final String validCountry = "India";
	
	public RegisterUser(String userName, String userCountry) throws InvalidCountryException{
		super();
		this.userName = userName;
		
		if(!validCountry.equalsIgnoreCase(userCountry)) {
			throw new InvalidCountryException("Country should be India");
		}
		
		this.userCountry = userCountry;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userCountry=" + userCountry + "]";
	}
	
	
}
