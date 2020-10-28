package week2;

import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;


public class HttpClientTest {
	public static void main(String[] args) throws IOException {
		
		HttpClient client = new HttpClient();
		HttpMethod method = new GetMethod(" http://localhost:8801");
		client.executeMethod(method);

		System.out.println(method.getStatusLine());
		System.out.println(method.getResponseBodyAsString());

		method.releaseConnection();
	}
}