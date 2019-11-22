package io.wisoft.programmers.summercoding2018.budget;

import java.util.Arrays;

public class Solution {

  public static int solution(int[] d, int budget) {
    int sum = 0, cnt = 0;
    for (int n :Arrays.stream(d)
        .sorted()
        .toArray()) {
      if (sum + n <= budget) {
        sum += n;
        cnt++;
      } else break;
    }
    return cnt;
  }

  public static void main(String... args) {
    System.out.println(solution(new int[]{1,3,2,5,4}, 9));
    System.out.println(solution(new int[]{2,2,3,3}, 10));
  }

}
