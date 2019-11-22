package io.wisoft.programmers.practice.gcflcf;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

  public int[] solution(int n, int m) {
    int gcf = IntStream.rangeClosed(1, n)
        .filter(i -> n % i == 0 && m % i == 0)
        .max().getAsInt();
    return new int[] {gcf, (n * m) / gcf};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution().solution(24, 36)));
    System.out.println(Arrays.toString(new Solution().solution(2, 5)));
  }

}
