package io.wisoft.programmers.skillcheck.level1.quiz2;

public class Solution {

  public String solution(String[] participant, String[] completion) {
    String joined = String.join("", participant);
    for (String comp : completion) {
      joined = joined.replaceFirst(comp, "");
    }
    return joined;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution(new String[]{"eden", "edenleo", "leo"}, new String[]{"leo", "edenleo"}));
  }

}
