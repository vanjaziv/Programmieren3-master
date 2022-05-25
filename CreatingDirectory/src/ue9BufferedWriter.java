import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ue9BufferedWriter {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test25-05.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Zeile1 \n");
        bufferedWriter.newLine();
        bufferedWriter.write("Zeile2");
        bufferedWriter.newLine();
        bufferedWriter.write("Zeile3");
        bufferedWriter.newLine();


        bufferedWriter.flush();
        bufferedWriter.close();

    }

}
