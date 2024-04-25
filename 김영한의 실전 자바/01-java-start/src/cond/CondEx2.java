package cond;

public class CondEx2 {
    public static void main(String[] args) {
        int dist = 10;

        if (dist <= 1) {
            System.out.println("도보");
        } else if (dist <= 10) {
            System.out.println("자전거");
        } else if (dist <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }
}
