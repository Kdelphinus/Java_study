package cond;

public class CondEx3 {
    public static void main(String[] args) {
        int dollar = 10;
        int won = 1300;

        if (dollar < 0) {
            System.out.println("Wrong input");
        } else if (dollar == 0) {
            System.out.println("No money");
        } else {
            System.out.println(dollar * won);
        }
    }
}
