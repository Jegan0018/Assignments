package httpconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObject {
	public static void main(String[] args) {
		JsonObject response = new JsonObject();
		response.jsonResponse();
	}

	private void jsonResponse() {
		String url = "https://reqres.in/api/unknown";
		try {
			URL connection = new URL(url);
			HttpURLConnection httpConnection = (HttpURLConnection) connection.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
			String result = reader.readLine();
			ObjectMapper object = new ObjectMapper();
			Root root = object.readValue(result, Root.class);
			System.out.println(
					"Page : " + root.page + "\nPer Page : " + root.per_page + "\nTotal Pages : " + root.total_pages);
			for (Datum data : root.data) {
				System.out.println("Id : " + data.id + "\nName : " + data.name + "\nYear : " + data.year + "\nColor : "
						+ data.color + "\nPantone Color : " + data.pantone_value);
				System.out.println();
			}
			System.out.println("Support : " + "\nURL : " + root.support.url + "\nText : " + root.support.text);
			JFrame frame = new JFrame("My Frame");
			JPanel panel = new JPanel();
			for (Datum data : root.data) {
				String[] array2 = { "ID:" + String.valueOf(data.id), "Name : " + data.name,
						"Year : " + String.valueOf(data.year), "Color : " + data.color,
						"Pantone Value : " + data.pantone_value };
				panel.add(new JList(array2));
				frame.add(panel);
			}
			frame.setSize(1400, 700);
			frame.show();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Datum {
	public int id;
	public String name;
	public int year;
	public String color;
	public String pantone_value;
}

class Root {
	public int page;
	public int per_page;
	public int total;
	public int total_pages;
	public ArrayList<Datum> data;
	public Support support;
}

class Support {
	public String url;
	public String text;
}
