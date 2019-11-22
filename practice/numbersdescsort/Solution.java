package io.wisoft.programmers.practice.numbersdescsort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {

  public long solution(long n) {
    return Long.parseLong(Arrays.stream(String.valueOf(n).split(""))
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining()));
  }

  public static void main(String[] args) {

  }

}
