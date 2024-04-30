package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        System.out.println("int value: " + intValue);

        longValue = intValue;
        System.out.println("long value: " + longValue);

        doubleValue = intValue;
        System.out.println("double value: " + doubleValue);
    }
}
