package method;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("Hello from Method1 class");
        System.out.println("10 + 20 = " + add(10, 20));
        System.out.println("20 + 30 = " + add(20, 30));
        System.out.println("30 + 40 = " + add(30, 40));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
