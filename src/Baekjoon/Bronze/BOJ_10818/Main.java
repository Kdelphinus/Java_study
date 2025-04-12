package Baekjoon.Bronze.BOJ_10818;

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

        int num = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] parts = line.split(" ");

        List<Integer> numbers = new ArrayList<Integer>();
        for (String s: parts) {
            numbers.add(Integer.parseInt(s));
        }

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        bw.write(min + " " + max + "\n");

        bw.flush();  // 출력 버퍼에 남은 데이터 전송
        bw.close();  // 출력 스트림 닫기
        br.close();  // 입력 스트림 닫기
    }
}