package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C04RPS {

    private static Random random = new Random();

    public static void main(String[] args) {
        // 가위바위보 게임 만들기


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1), 바위(2), 보(3)를 선택하세요: ");
        int userChoice = Integer.parseInt(scanner.nextLine());

        // 컴퓨터의 선택: 1(가위), 2(바위), 3(보)
        int computerChoice = random.nextInt(3) + 1;

        // 사용자의 선택 출력
        switch (userChoice) {
            case 1:
                System.out.println("사용자: 가위");
                break;
            case 2:
                System.out.println("사용자: 바위");
                break;
            case 3:
                System.out.println("사용자: 보");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }

        // 컴퓨터의 선택 출력
        switch (computerChoice) {
            case 1:
                System.out.println("컴퓨터: 가위");
                break;
            case 2:
                System.out.println("컴퓨터: 바위");
                break;
            case 3:
                System.out.println("컴퓨터: 보");
                break;
        }

        // 승부 판정
        if (userChoice == computerChoice) {
            System.out.println("무승부입니다.");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("사용자가 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
    }
}




