package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {

        File dir = new File("");
        File file1 = new File("");
        File file2 = new File("");
        File file3 = new File("");

        if (dir.exists() == false) {
            dir.mkdirs();
        }
        if (file1.exists() == false) {
            file1.createNewFile();
        }
        if (file2.exists() == false) {
            file2.createNewFile();
        }
        if (file3.exists() == false) {
            file3.createNewFile();
        }


        File temp = new File("");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("");
        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }

            System.out.println();

        }

    }
}
