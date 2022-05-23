import java.io.File;
import java.util.Scanner;

public class CreatingDirectory1 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Directory name, which should be created");
            String path = scanner.next();
            System.out.println("New Directory: " + path);

            File file = new File(path);
            boolean created = file.mkdir();

            if(created){
                System.out.println("Directory has been created");}
            else{
                System.out.println("Directory has not been created");
            }
        }
    }

