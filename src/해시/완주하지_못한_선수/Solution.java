package 해시.완주하지_못한_선수;

class Solution {

  public String solution(String[] participant, String[] completion) {
    String joined = String.join("", participant);
    for (String comp : completion) {
      joined = joined.replaceFirst(comp, "");
    }
    return joined;
  }

}