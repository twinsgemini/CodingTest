package main.java.problem;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 문제 설명
 * 0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
 *
 * x의 모든 0을 제거합니다.
 * x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
 * 예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
 *
 * 0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * s의 길이는 1 이상 150,000 이하입니다.
 * s에는 '1'이 최소 하나 이상 포함되어 있습니다.
 */
public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int cnt = 0;
        int zeroCnt = 0;

        // 문자열에 1이 없거나 길이가 0인 경우 경우 return
        if (!s.contains("1") || s.length() == 0) {
            return answer;
        }

        while(!"1".equals(s)) {
            // 0 제거
            StringBuilder sb = new StringBuilder();
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '0') {
                    zeroCnt++;
                } else {
                    sb.append(charArray[i]);
                }
            }

            // length -> 이진수
            int length = sb.length();
            s = Integer.toBinaryString(length);

            cnt++;
        }

        answer[0] = cnt;
        answer[1] = zeroCnt;

        return answer;
    }

    public static void main(String[] args) {
        이진변환반복하기 o = new 이진변환반복하기();
        System.out.println(Arrays.toString(o.solution("000")));
        System.out.println(Arrays.toString(o.solution("110010101001")));
        System.out.println(Arrays.toString(o.solution("01110")));
        System.out.println(Arrays.toString(o.solution("1111111")));
    }

}
