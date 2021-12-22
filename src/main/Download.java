package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Download {
	
	public void asyncDownloadFromUrl(String url, String path)
	{
		AsyncHttpClient client = Dsl.asyncHttpClient();
		Request getRequest = Dsl.get("http://www.baeldung.com").build();
	}

}
