import java.io.*;
import java.nio.charset.StandardCharsets;

public class ue9_outputstreamwriter1  {

public static void main(String[]args) throws IOException {


        String data="ä ö ü EXAMPLE - example";

        FileOutputStream fileOutputStream=new FileOutputStream("test3.txt");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);


        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();
        }
}
