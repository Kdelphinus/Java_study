package cond;

public class NewSwitch {
    public static void main(String[] args) {
        int grade = 2;

        // java 14 이상부터 사용 가능
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(coupon);
    }
}
