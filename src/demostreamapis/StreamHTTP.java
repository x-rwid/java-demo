package demostreamapis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Stream;

public class StreamHTTP {
    static void main() {

        // file'ni URI'si
        URI uri = URI.create("https://www.gutenberg.org/files/98/98-0.txt");

        // HTTP request'ni tuziw ucun code'ni ociw
        try (HttpClient client = HttpClient.newHttpClient();) {
            HttpRequest request = HttpRequest.newBuilder(uri).build();

            // request'ni yuboriw
            HttpResponse<Stream<String>> response = client.send(request, HttpResponse.BodyHandlers.ofLines());
            List<String> lines;
            try (Stream<String> stream = response.body()) {
                lines = stream
                        .dropWhile(line -> !line.equals("A TALE OF TWO CITIES"))
                        .takeWhile(line -> !line.equals("*** END OF THE PROJECT GUTENBERG EBOOK A TALE OF TWO CITIES ***"))
                        .toList();
            }
            IO.println("# line'lar = " + lines.size());
        } catch (IOException | InterruptedException _) {
            IO.println("Bu exception'ga to'g'ri iwlov beriw kerak.");
        }
    }
}
