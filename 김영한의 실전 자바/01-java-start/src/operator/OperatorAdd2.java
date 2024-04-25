package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 전위 연산자
        b = ++a; // a의 값을 증가시키고 대입
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        // 후위 연산자
        b = a++; // a를 대입하고 값을 증가
        System.out.println("a = " + a + ", b = " + b);
    }
}
