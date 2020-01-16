package 연습문제.자릿수_더하기;

import java.util.Arrays;

public class Solution {

  public int solution(int n) {
    return Arrays.stream(String.valueOf(n).split(""))
        .mapToInt(Integer::parseInt)
        .sum();
  }

}
