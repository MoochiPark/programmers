package io.wisoft.programmers.practice.dividearray;

import java.util.Arrays;

public class Solution {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = Arrays.stream(arr)
        .filter(n -> n % divisor == 0)
        .sorted()
        .toArray() ;
    return answer.length == 0 ? new int[]{-1} : answer;
  }
}