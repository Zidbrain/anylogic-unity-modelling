package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Methods {
    public static Integer getAgentsAmount() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(
                HttpRequest.newBuilder().GET().uri(new URI("http://localhost:5000/")).build(),
                HttpResponse.BodyHandlers.ofString()
        );
        return Integer.parseInt(response.body());
    }
}
