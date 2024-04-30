package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 10.5;
        int intValue;

        // intValue = doubleValue; // Type mismatch: cannot convert from double to int
        intValue = (int) doubleValue;

        System.out.println("double value: " + doubleValue);
        System.out.println("int value: " + intValue);
    }
}
