package io.wisoft.programmers.practice.xspacingn;

import java.util.stream.LongStream;

public class Solution {

  public long[] solution(int x, int n) {
    return LongStream.rangeClosed(1, n).parallel()
        .map(i -> x * i)
        .toArray();
  }

}
