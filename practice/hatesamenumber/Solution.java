package io.wisoft.programmers.practice.hatesamenumber;
import java.util.*;

public class Solution {
  public int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();
    int prev  = -1;

    for (int i : arr) {
      if (i != prev) {
        list.add(i);
      }
      prev = i;
    }
    return list.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
  }

}