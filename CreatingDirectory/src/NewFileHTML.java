import java.io.File;
import java.io.IOException;

public class NewFileHTML {

    public static void main(String[] args) throws IOException {

            // find out which separator this PC's operating system uses
            String fileSeparator = System.getProperty("file.separator");
            System.out.println("File Separator: " + fileSeparator);

            // using "file separator" instead of "\\"
            //File file = new File("C:\\Users\\User\\Desktop\\P3");
            //File file2 = new File("C:" + fileSeparator +"Users"+ fileSeparator +"User" + fileSeparator + "Desktop" + fileSeparator + "P3");
            File html = new File ("test1.html");

            try{
                if(html.createNewFile()){

                    System.out.println("new file");
                    System.out.println(html.getName());
                    System.out.println(html.getAbsolutePath());
                    System.out.println(html.getAbsoluteFile());

                }else{
                    System.out.println("already exists");
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

