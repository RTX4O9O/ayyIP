import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api64.ipify.org?format=text");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String externalIP = reader.readLine();
            System.out.println("External IP address: " + externalIP);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
