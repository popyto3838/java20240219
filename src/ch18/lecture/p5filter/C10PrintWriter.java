package ch18.lecture.p5filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C10PrintWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output10.txt";
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);


        pw.print("hello world");
        pw.print("😂😊🤣");
        pw.println("점심뭐먹지?");
        pw.println("배고프다");
        pw.println("%s을 먹을까?");

        pw.close();
    }
}
