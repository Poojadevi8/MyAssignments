package week3.Homeass;

public class LoginTestData extends TestData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login=new LoginTestData();
		login.enterUsername();
		login.enterPassword();
		login.enterCredentials();
		login.navigateToHomePage();
	}
	public void enterUsername() {
		System.out.println("username");
	}
	public void enterPassword() {
		System.out.println("Password");
	}

}
