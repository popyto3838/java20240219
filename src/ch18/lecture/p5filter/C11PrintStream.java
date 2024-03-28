package ch18.lecture.p5filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class C11PrintStream {
    public static void main(String[] args) throws FileNotFoundException {

        String file = "temp/output11.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);

        ps.print("hello world");
        ps.print("hello world");
        ps.println("hello world");
        ps.printf("hello world");
        ps.print("hello world");
    }
}
