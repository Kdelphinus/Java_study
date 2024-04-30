package scanner;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

//        while (true) {
//            int number = scanner.nextInt();
//            if (number == -1) {
//                System.out.println("입력한 숫자들의 합계: " + sum);
//                System.out.println("입력한 숫자들의 평균: " + (double) sum / cnt);
//                break;
//            }
//            sum += number;
//            cnt++;
//        }

        int input;
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            cnt++;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + (double) sum / cnt);
    }
}
