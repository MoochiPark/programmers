package 정렬.K번째수;

import java.util.Arrays;

public class Solution {

  public int[] solution(int[] array, int[][] commands) {
    return Arrays.stream(commands)
        .map(arr -> {
          int[] tmp = Arrays.copyOfRange(array, --arr[0], arr[1]);
          Arrays.sort(tmp);
          return tmp[--arr[2]];})
        .mapToInt(i -> i)
        .toArray();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] array = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
        new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    System.out.println(Arrays.toString(array));
  }

}
