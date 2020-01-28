package 연습문제.문자열_내림차순으로_배치하기;

import java.util.*;
import static java.util.stream.Collectors.joining;

public class Solution {

  public String solution(String s) {
    return Arrays.stream(s.split(""))
        .sorted(Comparator.reverseOrder())
        .collect(joining());
  }

//  public String solution(String s) {
//    return new StringBuffer(s).reverse().toString();
//  }

}
