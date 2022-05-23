import java.io.*;

public class ReadChar {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);


        int c;
        while ((c= fileReader.read()) != -1){
            char character = (char) c;
            System.out.println(character);
        }

        fileReader.close();

    }

}
