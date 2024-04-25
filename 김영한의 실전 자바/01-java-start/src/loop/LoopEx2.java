package loop;

public class LoopEx2 {
    public static void main(String[] args) {
        int i = 2;

        while (true) {
            if (i > 20)
                break;

            System.out.println(i);
            i += 2;
        }

        for (int j = 2; j <= 20; j += 2) {
            System.out.println(j);
        }
    }
}
