package Baekjoon.Bronze.BOJ_1000;

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
        //br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/Baekjoon.Bronze.BOJ_1000.Main/input.txt"))); // 로컬 테스트용
        bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 버퍼 결정

        st = new StringTokenizer(br.readLine()); // 한 줄을 공백 기분으로 분리
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write((a + b) + "\n");  // 개행이 없으면 출력 버퍼에 쌓인 상태로 출력되지 않음

        bw.flush();  // 출력 버퍼에 남은 데이터 전송
        bw.close();  // 출력 스트림 닫기
        br.close();  // 입력 스트림 닫기
    }
}