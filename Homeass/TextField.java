package week3.Homeass;

public class TextField extends WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField tf=new TextField();
		tf.getText();
		tf.click();
		tf.setText("hi guys");
		

	}
	public void getText() {
		System.out.println("getText");
	}

}
