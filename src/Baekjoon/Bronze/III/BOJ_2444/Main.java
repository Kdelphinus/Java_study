package Baekjoon.Bronze.III.BOJ_2444;

/*
 * Author: Kdelphinus, Ko MyoungJun
 */

import java.io.*;
import java.util.*;

public class Main {
    // 여러 메서드에서 공유하기 위해 클래스 변수(static)로 선언
    static BufferedReader br;  // 입력을 빠르게 읽기 위한 클래스
    static BufferedWriter bw;  // 출력을 빠르게 쓰기 위한 클래스
    static StringTokenizer st;  // 문자열을 공백/기호 기준으로 쉽게 나누는 유틸

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));  // 백준 제출용
        bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 버퍼 결정

        int n = Integer.parseInt(br.readLine());
        int i = 0;
        while (i < n) {
            for (int j = 1; j < n - i; j++)
                bw.write(" ");
            for (int j = 0; j < 1 + 2 * i; j++)
                bw.write("*");
            bw.write("\n");
            i++;
        }
        i -= 2;
        while (i >= 0) {
            for (int j = 1; j < n - i; j++)
                bw.write(" ");
            for (int j = 0; j < 1 + 2 * i; j++)
                bw.write("*");
            bw.write("\n");
            i--;
        }

        bw.flush();  // 출력 버퍼에 남은 데이터 전송
        bw.close();  // 출력 스트림 닫기
        br.close();  // 입력 스트림 닫기
    }
}