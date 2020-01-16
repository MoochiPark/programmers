package 연습문제.숫자의_표현;

import java.util.stream.IntStream;

public class Solution {

  public long solution(int n) {
    return IntStream.iterate(1, i -> i + 2)
        .limit(n)
        .filter(i -> n % i == 0)
        .count();
  }

  public static void main(String[] args) {
    System.out.println(new Solution().solution(15));
  }

}
