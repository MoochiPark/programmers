package io.wisoft.programmers.practice.sortatwill;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

  public String[] solution(String[] strings, int n) {
    return Arrays.stream(strings)
        .sorted()
        .collect(Collectors.groupingBy(s -> s.charAt(n)))
        .entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .flatMap(i -> i.getValue().stream()).toArray(String[]::new);
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
//    solution.solution(new String[]{"sun", "bed", "car"}, 1);
    System.out.println(Arrays.toString(solution.solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    Queue<List<String>> queue = new LinkedList<>();
  }

}
