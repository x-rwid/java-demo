package demoioapis;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class SonnetTest {
    static void main() throws IOException, InterruptedException {

        URI sonnetsURI = URI.create("https://www.gutenberg.org/cache/epub/1041/pg1041.txt");
        HttpRequest request =
                HttpRequest.newBuilder(sonnetsURI)
                        .GET()
                        .build();
        HttpClient client =
                HttpClient.newBuilder().build();
        HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
        InputStream inputStream = response.body();

        int start = 33;

        List<Sonnet> sonnets = new ArrayList<>();

        try (var reader = new SonnetReader(inputStream);) {
            reader.skipLines(start);
            Sonnet sonnet = reader.readNextSonnet();
            while (sonnet != null) {
                sonnets.add(sonnet);
                sonnet = reader.readNextSonnet();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        IO.println("# sonnet'lar = " + sonnets.size());
    }
}