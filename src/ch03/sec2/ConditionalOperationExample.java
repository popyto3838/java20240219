package ch03.sec2;

import java.util.Scanner;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'c');


        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};


        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번째 학생의 점수를 입력하세요");

            for (int j = 0; j < 3; j++) {
                System.out.println(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();

            }

        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println()(i+1)+"번학생의 총점은 "+ total+ ",평균은"+average);
        }
        }


    }
}
