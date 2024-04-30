package scanner;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            System.out.println("이름: " + name + ", 나이: " + age);

            // nextInt에서 10\n 중 10만 가져 간다. 따라서 남아 있는 개행을 다음 입력 때 바로 사용 한다.
            scanner.nextLine(); // 개행 제거
        }
    }
}
