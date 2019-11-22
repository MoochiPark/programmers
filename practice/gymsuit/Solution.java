package io.wisoft.programmers.practice.gymsuit;

import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Solution {

  public int solution(int n, int[] lost, int[] reserve) {
    List<Integer> lostList = Arrays.stream(lost).boxed().collect(toList());
    for (int i = 0; i < lostList.size(); i++) {
      for (int j = 0; j < reserve.length && !lostList.isEmpty(); j++) {
        if (Math.abs(lostList.get(i) - reserve[j]) == 1 && reserve[j] != 0) {
          lostList.remove(i);
          reserve[j] = 0;
        }
      }
    }
    return n - lostList.size();
  }

  public static void main(String[] args) {
    System.out.println(new Solution().solution(5, new int[] {2, 4}, new int[] {1, 3, 5}));
    System.out.println(new Solution().solution(5, new int[] {2, 4}, new int[] {3}));
    System.out.println(new Solution().solution(3, new int[] {3}, new int[] {1}));
  }

}
