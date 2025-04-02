import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DatabaseContact {

    private final String urlString;

    DatabaseContact(int length) {
        this.urlString = "https://random-word-api.herokuapp.com/word?number=1&length=" + length;
    }

    public String getWord() {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            if (connection.getResponseCode() != 200)
                throw new RuntimeException("HTTP Hatası: " + connection.getResponseCode());

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = br.readLine();
            br.close();

            connection.disconnect();
            return response.substring(2, response.length()-2);
        } catch (Exception e) {
            System.out.println("There was a problem connecting to the database");
        }

        return null;
    }
}
