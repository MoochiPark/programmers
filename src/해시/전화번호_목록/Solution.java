package 해시.전화번호_목록;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

  public boolean solution(String[] phone_book) {
    Arrays.sort(phone_book);
    return IntStream.range(1, phone_book.length)
        .noneMatch(i -> phone_book[i].startsWith(phone_book[i-1]));
  }

  public static void main(String[] args) {
    System.out.println(new Solution().solution(new String[] {"12", "123", "1235", "567", "88"}));
    System.out.println(new Solution().solution(new String[] {"123", "456", "789"}));
  }

}
