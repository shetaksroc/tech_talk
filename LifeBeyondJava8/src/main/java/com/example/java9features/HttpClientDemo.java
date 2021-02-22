package com.example.java9features;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author akshay on 18/02/21
 */
public class HttpClientDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://ams-data.rboomerang.com:8082/ams/v1/clients"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
