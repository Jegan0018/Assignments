package HttpConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionResponse {
	public static void main(String[] args) {
		ConnectionResponse response = new ConnectionResponse();
		response.jsonResponse();
	}

	private void jsonResponse() {
		String url = "https://reqres.in/api/unknown";
		try {
			URL connection = new URL(url);
			HttpURLConnection httpConnection = (HttpURLConnection) connection.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
			System.out.println(reader.readLine());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
