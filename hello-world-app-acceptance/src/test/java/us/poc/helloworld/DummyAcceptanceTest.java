package us.poc.helloworld;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

public class DummyAcceptanceTest {

	@Test
	public void testConnection() throws IOException {
		String urlString = System.getProperty("service.url");
		System.out.println("testing url:" + urlString);

		URL serviceUrl = new URL(urlString + "hello-world");
		HttpURLConnection connection = (HttpURLConnection) serviceUrl.openConnection();
		int responseCode = connection.getResponseCode();
		Assert.assertEquals(200, responseCode);
	}
}
