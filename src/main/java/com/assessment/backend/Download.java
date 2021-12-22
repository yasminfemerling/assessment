package com.assessment.backend;

import java.nio.file.Path;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

public class Download {
	
	public void asyncDownloadFromUrl(String url, String path) {	
		WebClient client = WebClient.create();
		Flux<DataBuffer> response = client
								    .get()
								    .uri(url)
								    .retrieve()
							        .bodyToFlux(DataBuffer.class); 
		
			//Process response as needed (is it text? a file?)
		DataBufferUtils.write(response, Path.of(path));
		
	}
	

}
