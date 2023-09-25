package week3.Homeass;

public class RadioButton extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rb=new RadioButton();
		rb.selectRadioButton();
		rb.submit();
		rb.click();
		rb.setText("hi guys");
	}

	
	public void selectRadioButton() {
		System.out.println("select radio button");
	}

}
