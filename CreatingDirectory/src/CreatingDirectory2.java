import java.io.File;
import java.util.Scanner;

public class CreatingDirectory2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory path where new folder should be created");
        String path = scanner.next();
        System.out.println("Enter the name of the NEW Directory");
        path = path + scanner.next();
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

