package main.java.problem;

/**
 * 문제 설명
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 */
public class 짝수와홀수 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        짝수와홀수 p = new 짝수와홀수();
        System.out.println("p.solution(0) = " + p.solution(0));
        System.out.println(-3 % 2);
    }
}
