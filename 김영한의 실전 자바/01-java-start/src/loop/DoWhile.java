package loop;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;

        // 최초 한 번은 항상 실행되도록 만듬
        do {
            System.out.println("현재 숫자: " + i);
            i++;
        } while (i < 3);
    }
}
