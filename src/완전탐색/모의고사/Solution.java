package 완전탐색.모의고사;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {

  public int[] solution(int[] answers) {
    int[] supo1 = {1, 2, 3, 4, 5};
    int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] corrects = new int[3];
    for (int i = 0; i < answers.length; i++) {
      int answer = answers[i];
      if (answer == supo1[i % supo1.length])
        corrects[0]++;
      if (answer == supo2[i % supo2.length])
        corrects[1]++;
      if (answer == supo3[i % supo3.length])
        corrects[2]++;
    }
    return IntStream.rangeClosed(1, 3)
        .mapToObj(i -> Map.entry(i, corrects[i-1]))
        .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
        .filter(m -> Arrays.stream(corrects).max().getAsInt() == m.getValue())
        .map(Map.Entry::getKey)
        .mapToInt(i -> i)
        .toArray();
  }

  public static void main(String[] args) {
    new Solution().solution(new int[]{1, 2, 3, 4, 5});
    new Solution().solution(new int[]{1, 3, 2, 4, 2});
  }

}
