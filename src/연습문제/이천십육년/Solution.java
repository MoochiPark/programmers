package 연습문제.이천십육년;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  public String solution(int a, int b) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2016, a - 1, b);
    HashMap<Integer, String> weeks = new HashMap<>(Map.of(1, "SUN", 2, "MON",
        3, "TUE", 4, "WED", 5, "THU", 6, "FRI", 7, "SAT"));
    return weeks.get(calendar.get(Calendar.DAY_OF_WEEK));
  }

  public static void main(String[] args) {
    System.out.println(new Solution().solution(5, 24));
    System.out.println(new Solution().solution(1, 1));
    System.out.println(new Solution().solution(2, 1));
    System.out.println(new Solution().solution(3, 1));
    System.out.println(new Solution().solution(4, 1));
    System.out.println(new Solution().solution(5, 1));
    System.out.println(new Solution().solution(6, 1));
    System.out.println(new Solution().solution(7, 1));
    System.out.println(new Solution().solution(8, 1));
    System.out.println(new Solution().solution(9, 1));
    System.out.println(new Solution().solution(10, 1));
    System.out.println(new Solution().solution(11, 1));
    System.out.println(new Solution().solution(12, 1));
  }

}
