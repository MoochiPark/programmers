package io.wisoft.programmers.practice.blindphonenumber;

public class Solution {

  public static String solution(String phone_number) {
    int length = phone_number.length() - 4;
    return phone_number.replace(phone_number.substring(0, length), "*".repeat(length));
  }

}
