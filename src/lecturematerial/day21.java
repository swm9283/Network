package lecturematerial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class day21
{
    public static void main(String[] args) {
        try {
            URL url = new
                    URL("http://www.inha.ac.kr");
            URLConnection urlConnection =
                    url.openConnection();
            BufferedReader br = new BufferedReader(   // br에 html에 대한 모든 정보를 넣어뒀다.
                    new InputStreamReader(
                            urlConnection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {   //br에서 정보를 하나 하나 꺼내오겠다.
                System.out.println(line);
            }
            br.close();  // 연결해지.
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            // Handle exceptions
            System.out.println("test");
        }
    }
}
