package 연습문제.두_정수_사이의_합;

import java.util.stream.LongStream;

public class Solution {

  public long solution(int a, int b) {
    if (a > b) {
      int tmp = a;
      a = b;
      b = tmp;
    }
    return LongStream.rangeClosed(a, b)
        .sum();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution(2, -1));
  }

}
