package loop;

public class LoopEx3 {
    public static void main(String[] args) {
        int num = 1;
        int total = 0;
        int cnt = 0;

        while (cnt < 100) {
            total += num;
            num++;
            cnt++;
        }
        System.out.println(total);

        total = 0;
        for (int i = 1; i <= 100; i++)
            total += i;
        System.out.println(total);
    }
}
