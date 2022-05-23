import java.io.File;

public class Uebung3 {

    public static void main(String[] args) {

        File dir = new File("C:\\Users\\User\\Desktop\\P3");

        listFilesAndDirectories(dir.getAbsolutePath());

    }

    public static void listFilesAndDirectories(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {

            if (f.isDirectory()) {
                //rekursiv
                System.out.println("Dir: " + f.getAbsolutePath());
                listFilesAndDirectories(f.getAbsolutePath());
            }
            else {
                System.out.println("File: " + f.getAbsolutePath());
            }

        }
    }
}


