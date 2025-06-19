package main.java.problem;

/**
 * 문제 설명
 * 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다.
 * 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
 * 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 성공적으로 수행할 수 있으면 1을,
 * 아닐 경우 0을 리턴해주면 됩니다.
 *
 * 예를 들어, 문자열 S = baabaa 라면
 * b aa baa → bb aa → aa →
 * 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.
 *
 * 제한사항
 * 문자열의 길이 : 1,000,000이하의 자연수
 * 문자열은 모두 소문자로 이루어져 있습니다.
 */
public class 실패_짝지어제거하기 {
    public int solution(String s) {
        return removeCouple(s) ? 1 : 0;
    }

    public boolean removeCouple(String s) {
        StringBuffer sb = new StringBuffer();
        boolean repeat = false;

        if (s.length() == 0) return true;
        if (s.length() == 1) return false;

        // 짝 제거
        for(int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);

            // 짝이면 제거하고 repeat = true
            if (c1 == c2) {
                repeat = true;
                if (i+2 < s.length()) {
                    sb.append(s.substring(i+2));
                }
                break;
            } else {
                sb.append(s.substring(i, i+1));
            }
        }

        // 확인 후 재호출
        if (repeat == true) {
            return removeCouple(sb.toString());
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        실패_짝지어제거하기 o = new 실패_짝지어제거하기();

        System.out.println(o.solution("bbaabbaaccdd"));
        System.out.println(o.solution("bbaabbaacdcd"));
        System.out.println(o.solution("a"));
        System.out.println(o.solution(""));
        System.out.println(o.solution("aslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdjaslifdj"));

    }

}
