package io.wisoft.programmers.practice.findsmallestnumber;

import java.util.Arrays;

public class Solution {

  public int[] solution(int[] arr) {
    int[] answer = Arrays.stream(arr)
        .filter(n -> n != (Arrays.stream(arr).min().getAsInt()))
        .toArray();
    return answer.length == 0 ? new int[]{-1} : answer;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.solution(new int[]{4, 3, 2, 1})));
    System.out.println(Arrays.toString(solution.solution(new int[]{0})));
  }

}
