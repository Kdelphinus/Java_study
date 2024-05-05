package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("10 + 20 = " + add(10, 20));
        System.out.println("20 + 30 = " + add(20, 30));
        System.out.println("30 + 40 = " + add(30, 40));

        System.out.println("Hello " + add("World", "!"));
        printFooter();
    }

    public static void printHeader() {
        System.out.println("Hello from Method2 class");
    }

    public static void printFooter() {
        System.out.println("Goodbye from Method2 class");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }
}
