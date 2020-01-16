package 연습문제.행렬의_덧셈;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

  public static int[][] solution(int[][] arr1, int[][] arr2) {
    IntStream.range(0, arr1.length)
        .forEach(i ->
          IntStream.range(0, arr1[0].length)
              .forEach(j -> arr1[i][j] += arr2[i][j]));
    return arr1;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
  }

}
