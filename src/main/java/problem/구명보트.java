package main.java.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 문제 설명
 * 무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
 * 예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.
 * 구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
 * 사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다.
 * 각 사람의 몸무게는 40kg 이상 240kg 이하입니다.
 * 구명보트의 무게 제한은 40kg 이상 240kg 이하입니다.
 * 구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는 경우는 없습니다.
 */
public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int i = 0;
        int j = people.length - 1;

        // 몸무게 순으로 정렬
        int[] sortedPeople = Arrays.stream(people).sorted().toArray();

        while (i <= j) {
            answer++;
            if (i==j) break;

            int sum = sortedPeople[i] + sortedPeople[j];

            if (sum > limit) {
                j--;
            } else {
                i++;
                j--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        구명보트 o = new 구명보트();

        System.out.println(o.solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(o.solution(new int[]{70, 80, 50}, 100));
        System.out.println(o.solution(new int[]{70, 80, 50, 30, 30, 20, 10, 10}, 100));
    }
}
