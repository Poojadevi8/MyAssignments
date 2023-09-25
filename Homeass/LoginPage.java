package week3.Homeass;

public class LoginPage extends BasePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();

	}
	public void performCommonTasks() {
		System.out.println("new tasks");
	}
}
