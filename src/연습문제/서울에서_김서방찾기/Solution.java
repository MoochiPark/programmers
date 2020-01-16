package 연습문제.서울에서_김서방찾기;

public class Solution {

  public static String solution(final String[] seoul) {
    String answer = "";
    for (int i = 0; i < seoul.length; i++) {
      if (seoul[i].equals("Kim")) answer = "김서방은 " + i + "에 있다";
    }
    return answer;
  }

}


