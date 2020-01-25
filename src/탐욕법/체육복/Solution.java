package 탐욕법.체육복;

import java.util.Arrays;

public class Solution {

  public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;

    for (int i = 0; i < lost.length; i++) {
      int s = Arrays.binarySearch(reserve, --lost[i]);
      if (s >= 0) {
        reserve[s] = lost[i] = 0;
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(new Solution().solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    System.out.println(new Solution().solution(5, new int[]{2, 4}, new int[]{3}));
    System.out.println(new Solution().solution(3, new int[]{3}, new int[]{1}));
    System.out.println(new Solution().solution(10, new int[]{3, 9, 10}, new int[]{3, 8, 9}));
  }

}
