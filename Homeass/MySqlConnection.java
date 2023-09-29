package week3.Homeass;

public abstract class MySqlConnection implements DatabaseConnection{

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


	public abstract void executeQuery();


}