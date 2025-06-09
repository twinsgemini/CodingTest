package main.java.problem;

import java.util.Arrays;

/**
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
//        int[] answer = {};
        String numStr = String.valueOf(n);
        int[] answer = new int[numStr.length()];

        System.out.println("numStr = " + numStr);

        for (int i = 0; i < numStr.length(); i++) {
            String substring = numStr.substring(numStr.length() - (i + 1), numStr.length() - i);
            System.out.println("substring = " + substring);
            answer[i] = Integer.parseInt(substring);
        }

        return answer;
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 o = new 자연수뒤집어배열로만들기();
        int[] result = o.solution(1234);

        System.out.println("solution = " + Arrays.toString(result));;
    }
}
