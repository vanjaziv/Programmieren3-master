import java.io.IOException;
import java.io.StringWriter;

public class uebung9_stringwriter {

    public static void main(String[] args) throws IOException {

        String data = "das sind neuen Daten";

        StringWriter stringWriter = new StringWriter();
        stringWriter.write(data);
        stringWriter.write(" HI");
        stringWriter.flush();
        stringWriter.close();

        System.out.println(stringWriter);
    }

}
