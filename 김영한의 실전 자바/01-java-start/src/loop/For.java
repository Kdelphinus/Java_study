package loop;

public class For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (; ; ) {
            System.out.println("무한 반복");
            break;
        }

        for (int i = 0; ; i++) {
            if (i > 10)
                break;

            System.out.println(i);
        }
    }
}
