package 연습문제.X만큼_간격이_있는_n개의_숫자;

import java.util.stream.LongStream;

public class Solution {

  public long[] solution(int x, int n) {
    return LongStream.rangeClosed(1, n).parallel()
        .map(i -> x * i)
        .toArray();
  }

}
