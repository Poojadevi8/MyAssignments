package week3.Homeass;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement we=new WebElement();
		we.click();
		we.setText("hi guys");

	}
	public void click() {
		System.out.println("click");
	}
	public void setText(String text) {
		System.out.println("your text here: "+text);
	}

}
