package 연습문제.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

public class Solution {

  static public int[] solution(long n) {
//    return Arrays.stream(new StringBuffer(String.valueOf(n)).reverse().toString().split(""))
//        .mapToInt(Integer::parseInt)
//        .toArray();
    return new StringBuilder(String.valueOf(n)).reverse().chars().map(i -> i-48).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(12345)));
  }

}
