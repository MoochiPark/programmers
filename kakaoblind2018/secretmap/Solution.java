package io.wisoft.programmers.kakaoblind2018.secretmap;

import java.util.stream.IntStream;
import static java.lang.Integer.*;

public class Solution {

  public String[] solution(int n, int[] arr1, int[] arr2) {
    return IntStream.range(0, n)
        .mapToObj(i -> toBinaryString(arr1[i] | arr2[i]))
        .map(s -> "0".repeat(n - s.length()) + s)
        .map(s -> s.replaceAll("0", " ").replaceAll("1", "#"))
        .toArray(String[]::new);
  }

}
