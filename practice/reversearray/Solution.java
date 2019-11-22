package io.wisoft.programmers.practice.reversearray;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

  static public int[] solution(long n) {
    return Arrays.stream(new StringBuffer(String.valueOf(n)).reverse().toString().split(""))
        .mapToInt(Integer::parseInt)
        .toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(12345)));
  }

}
