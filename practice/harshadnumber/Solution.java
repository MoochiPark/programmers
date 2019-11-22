package io.wisoft.programmers.practice.harshadnumber;

import java.util.Arrays;

public class Solution {

  public boolean solution(int x) {
    return x % Arrays.stream(String.valueOf(x).split(""))
        .mapToInt(Integer::parseInt).sum() == 0;
  }

}
