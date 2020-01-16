package 연습문제.하샤드_수;

import java.util.Arrays;

public class Solution {

  public boolean solution(int x) {
    return x % Arrays.stream(String.valueOf(x).split(""))
        .mapToInt(Integer::parseInt).sum() == 0;
  }

}
