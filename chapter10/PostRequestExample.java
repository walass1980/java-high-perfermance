import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class PostRequestExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        String json = "{\"name\":\"Neo Anderson\",\"email\":\"neo.anderson@thematrix.com\"}";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.not-real-just-an-example.com/users"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}