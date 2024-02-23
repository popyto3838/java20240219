package ch04.lecture.p1if;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {

    private static Random random = new Random();

    public static void main(String[] args) {
        // 가위바위보 게임 만들기


        Scanner scanner = new Scanner(System.in);

        System.out.print("가위(1), 바위(2), 보(3)를 선택하세요:");

        int user = Integer.parseInt(scanner.nextLine());
        // int user = scanner.nextInt();
        int computer = random.nextInt(3) + 1;


        System.out.println("user=" + user);
        System.out.println("Computer=" + computer);

        if (user == computer) {
            System.out.println("무승부입니다.");
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            System.out.println("사용자가 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }


    }


}
