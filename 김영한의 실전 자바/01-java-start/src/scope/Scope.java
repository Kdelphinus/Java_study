package scope;

public class Scope {
    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if m: " + m);
            System.out.println("if x: " + x);
        }
        System.out.println("main m: " + m);
        // System.out.println("main x: " + x); // x scope는 if문 내부
        for (int i = 0; i < 2; i++) {
            System.out.println("for m: " + m);
            System.out.println("for i: " + i);
        }
        System.out.println("main m: " + m);
        // System.out.println("main i: " + i); // i scope는 for문 내부
    }
}
