package loop;

public class While {
    public static void main(String[] args) {
        int cnt = 1;
        int sum = 0;

        while (cnt <= 10) {
            sum += cnt;
            ++cnt;
        }
        System.out.println(sum);
    }
}
