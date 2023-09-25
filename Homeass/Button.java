package week3.Homeass;

public class Button extends WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b=new Button();
		b.submit();
		b.click();
		b.setText("hi guys");
	}
	public void submit() {
		System.out.println("submit");
	}

}
