import javax.xml.stream.events.EndDocument;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung9Test {

    public static void main(String[] args) throws IOException {
        File file = new File("NeuesFile.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("Das ist Test");
        printWriter.println("Das ist Test");
        printWriter.format("This is a %s program with %d MB", "Java", 200);
        printWriter.format(" ");
        printWriter.print("Das ist Test");
        printWriter.println("Das ist Test");

        printWriter.format("This is a %s program with %d MB", "Java", 200);

        printWriter.flush();
        printWriter.close();
        System.out.println("End");

    }
}
