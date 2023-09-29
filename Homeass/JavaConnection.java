package week3.Homeass;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("executinq query");
		
	}

}
