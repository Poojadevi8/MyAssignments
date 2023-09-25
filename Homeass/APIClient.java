package week3.Homeass;

public class APIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient ac=new APIClient();
		ac.sendRequest("hi");
		ac.sendRequest("hi", "welcome", "all");

	}
public void sendRequest(String endpoint) {
	System.out.println(endpoint);
}

public void sendRequest(String endpoint,String requestBody,String requestStatus) {
	System.out.println(endpoint+" "+requestBody+" "+requestStatus);
}
}
