package io.wisoft.programmers.kakaoblind2018.dartgame;

import static java.lang.Math.*;

public class Solution {

  public int solution(String dartResult) {
    String[] numbers = dartResult.split("\\D+");
    String[] options = dartResult.split("\\d+");
    int[] scores = new int[numbers.length];
    int answer = 0;
    for (int i = 0; i < numbers.length; i++) {
      scores[i] = Integer.parseInt(numbers[i]);
      scores[i] = options[i + 1].startsWith("S") ? scores[i] : (int) (options[i + 1].startsWith("D") ? pow(scores[i], 2) : pow(scores[i], 3));
      if (options[i + 1].length() > 1) {
        if (options[i + 1].endsWith("*")) {
          if (i == 0) {
            scores[i] *= 2;
          } else {
            scores[i] *= 2;
            scores[i - 1] *= 2;
          }
        } else {
          scores[i] *= -1;
        }
      }
    }
    for (int score : scores) {
      answer += score;
    }
    return answer;
  }

  public static void main(String[] args) {
//    System.out.println(new Solution().solution("1S*1D*1T*"));
    System.out.println(new Solution().solution("1D2S3T*"));
//    System.out.println(new Solution().solution("10T#10T*10S*"));
  }

}
