package 연습문제.시저_암호;

public class Solution {

  private static String solution(final String s, final int n) {
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isLowerCase(c)) {
        c += (char) n;
        if (c > 122) c -= 26;
      } else if (Character.isUpperCase(c)) {
        c += (char) n;
        if (c > 90) c -= 26;
      }
      answer.append(c);
    }
    return answer.toString();
  }

}
