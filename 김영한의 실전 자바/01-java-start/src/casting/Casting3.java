package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = Integer.MAX_VALUE;
        long maxIntOver = maxIntValue + 1;
        int intValue;

        intValue = (int) maxIntOver;
        System.out.println("max int value: " + maxIntValue);
        System.out.println("max int over: " + maxIntOver);
        System.out.println("int value: " + intValue);
    }
}
