import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Uebung6 {

    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\s51645\\Desktop\\New Folder");
        createFiles(dir);
        // rename_files(dir);
        // delete_files(dir);
    }

    public static void createFiles(File directory) throws IOException {

        for (int i = 0; i < 10; i++) {

            File file = new File(directory.getCanonicalPath() + "//"
                    + ThreadLocalRandom.current().nextInt() + ".mp3");

            if (file.createNewFile()) {
                System.out.println("CREATE: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists!");
            }
        }
    }

    public static void rename_files(File directory) {

        if (directory.isDirectory()) {
            for (File oldFile : directory.listFiles()) {
                File newFile = new File(oldFile.getParent() + "\\1_ " + oldFile.getName());
                if (oldFile.renameTo(newFile)) {
                    System.out.println("RENAME: " + oldFile.getAbsolutePath() + " to " + newFile.getAbsolutePath());
                } else {
                    System.out.println("Sorry the file can't be renamed");
                }
            }

        }
    }

    public static void delete_files(File directory) {
        if (directory.isDirectory()) {
            for (File file : directory.listFiles())
                file.delete();

        }
    }
}

