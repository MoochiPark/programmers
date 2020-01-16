package 연습문제.문자열_내_p와_y의_개수;

public class Solution {

  static boolean solution(String s) {
    int p = 0, y = 0;
    for (String c : s.toLowerCase().split("")) {
      if (c.equals("p")) p++;
      else if (c.equals("y")) y++;
    }
    return p == y;
  }

  public static void main(String[] args) {
    System.out.println(solution("pPoooyY"));
    System.out.println(solution("Pyy"));
  }

}
