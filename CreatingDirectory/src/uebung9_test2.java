import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class uebung9_test2 {

    public static void main(String[] args) throws IOException {


        FileWriter fileWriter = new FileWriter("test2_25-05.txt");


        fileWriter.write("Zeile1 \n"); // nema fileWriter.newLine();
        fileWriter.write("Zeile2");
        fileWriter.write("Zeile3");


        fileWriter.flush();
        fileWriter.close();

    }
}