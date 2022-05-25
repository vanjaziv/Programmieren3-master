import java.io.*;

public class MeineNoten {


    public static void main(String[] args) throws IOException {

        File file = new File("noten.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while((line = bufferedReader.readLine()) !=null){    // (!(line = buffered.Reader.readline()).equals("STOP")){printWriter.println(line);sout()line;bufferefReader.close();
            System.out.println(line);
            if(line.equals("STOP")){
                break;
            }
            printWriter.println(line);
        }

        printWriter.flush();
        printWriter.close();

    }
}
