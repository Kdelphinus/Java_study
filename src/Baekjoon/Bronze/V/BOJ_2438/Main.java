package Baekjoon.Bronze.V.BOJ_2438;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String star = "*";
        for (int i = 0; i < n; i++) {
            System.out.println(star);
            star += "*";
        }

        sc.close();
    }
}
