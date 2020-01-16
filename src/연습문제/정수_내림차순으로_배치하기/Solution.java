package 연습문제.정수_내림차순으로_배치하기;

import java.util.*;
import static java.util.stream.Collectors.joining;

public class Solution {

  public long solution(long n) {
    return Long.parseLong(Arrays.stream(String.valueOf(n).split(""))
        .sorted(Comparator.reverseOrder())
        .collect(joining()));
  }

  public static void main(String[] args) {

  }

}
