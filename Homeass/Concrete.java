package week3.Homeass;

public class Concrete implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete dc=new Concrete();
		dc.connect();
		dc.disconnect();
		dc.executeUpdate();
	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connecting");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnecting");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("execute Updating");
	}

}
