package io.wisoft.programmers.practice.squareroot;

public class Solution {

  public long solution(long n) {
    double d = Math.sqrt(n);
    return d % 1 == 0 ? (long)(++d * d) : -1;
  }

  public static void main(String[] args) {
  }

}
