package selPract;

import java.net.HttpURLConnection;
import java.net.URL;

public class ValidateBrokenLinkStatus {
//	What are HTTP Status Codes.?
//	A server generates HTTP Status codes in response to the request submitted by the client to the server. 
//	There are five types of responses to which we can segregate HTTP  response status codes. 
//	The first digit of the status-code is the response type, and the last two digits have different interpretations associated with the status code. 
//	There are different HTTP status codes, and a few of them are as below:
//
//			200 – Valid Link/success
//			301/302 – Page redirection temporary/permanent
//			404 – Page not found
//			400 – Bad request
//			401 – Unauthorized
//			500 – Internal Server Error
	public static void main(String[] args) {
		  try
	        {
	            URL url = new URL("https://www.google.com");
	 
	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection connection=(HttpURLConnection)url.openConnection();
	            //connection.setConnectTimeout(5000);
	            connection.connect();
	            if(connection.getResponseCode()>=400)
	            {
	             System.out.println(url+" - "+connection.getResponseMessage()+"is a broken link");
	            }    
	       
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(url+" -- "+connection.getResponseMessage());
	                System.out.println(url+" -- "+connection.getResponseCode());
	            }
	        }catch (Exception e) {}

	}

}
