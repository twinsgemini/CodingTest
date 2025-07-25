package main.java.problem;

/**
 * 문제 설명
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
 *
 * 예를들어
 *
 * F(2) = F(0) + F(1) = 0 + 1 = 1
 * F(3) = F(1) + F(2) = 1 + 1 = 2
 * F(4) = F(2) + F(3) = 1 + 2 = 3
 * F(5) = F(3) + F(4) = 2 + 3 = 5
 * 와 같이 이어집니다.
 *
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 *
 * 제한 사항
 * n은 2 이상 100,000 이하인 자연수입니다.
 */
public class 피보나치수 {
    public int solution(int n) {
        int answer = 0;
        int m = 1234567;

        // 저장용 배열 생성 및 초기값 설정
        int[] array = new int[n+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        array[0] = 0;
        array[1] = 1;

        if (n <= 1) answer = n;

        for (int i = 2; i <= n; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % m;
        }

        return array[n];
    }

    public static void main(String[] args) {
        피보나치수 o = new 피보나치수();

        System.out.println(o.solution(2));
        System.out.println(o.solution(3));
        System.out.println(o.solution(5));
        System.out.println(o.solution(9999));
    }

}
