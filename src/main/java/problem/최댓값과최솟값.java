package main.java.problem;

import java.util.Objects;

/**
 * 문제 설명
 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
 * 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 *
 * 제한 조건
 * s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
 */
public class 최댓값과최솟값 {
    public String solution(String s) {
        String[] s1 = s.split(" ");
        int max, min, currNum;
        max = min = Integer.parseInt(s1[0]);
        for (int i = 1; i < s1.length; i++) {
            currNum = Integer.parseInt(s1[i]);
            max = getMax(max, currNum);
            min = getMin(min, currNum);
        }

        return min + " " + max;
    }

    public int getMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public int getMin(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        최댓값과최솟값 o = new 최댓값과최솟값();
        System.out.println(o.solution("1 2 3 4"));
        System.out.println(o.solution("-1 -2 -3 -4"));
        System.out.println(o.solution("-1 -1"));
    }
}
