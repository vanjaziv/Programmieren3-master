import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {

    public static void main(String[] args) throws IOException {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            /*
            int c;
            while ((c= fileReader.read()) != -1){
                char character = (char) c;
                System.out.println(character);
            }*/

            fileReader.close();

        }

    }


