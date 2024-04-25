package cond;

public class CondEx5 {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A" -> System.out.println("Excellent");
            case "B" -> System.out.println("Great");
            case "C" -> System.out.println("Good");
            case "D" -> System.out.println("Try");
            case "F" -> System.out.println("Bad");
            default -> System.out.println("Wrong grade");
        }
    }
}
