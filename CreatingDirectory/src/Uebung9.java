import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung9 {

    public static void main(String[] args) throws IOException {

        File file = new File("25-05.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("Zeile 1");
        printWriter.println("Zeile 2");
        printWriter.println("Zeile 3");
        printWriter.print("OhneLN");
        printWriter.print("OhneLN");
        printWriter.println("Zeile 4");
        printWriter.println("Zeile 5");
        printWriter.format("This is a %s program with %d MB", "JAVA", 100); // %s Platz für String(JAVA), %d Platz für digit(100 MB)

        printWriter.flush();
        printWriter.close();
        System.out.println("Fertig");

    }
}
