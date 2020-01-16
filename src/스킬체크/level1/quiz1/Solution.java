package 스킬체크.level1.quiz1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

  public int[] solution(int[] arr, int divisor) {
    int[] answer = Arrays.stream(arr)
        .filter(n -> n % divisor == 0)
        .sorted()
        .toArray();
    return answer.length != 0 ? answer : new int[]{-1};
  }
}
