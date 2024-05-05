package method;

public class MethodCasting {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); // 컴파일 오류
        printNumber((int) number);
        System.out.println("number in main: " + number);
    }

    public static void printNumber(int number) {
        System.out.println("number in printNumber: " + number);
    }
}
