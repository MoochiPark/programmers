package 연습문제.콜라츠_추측;

public class Solution {

  public static int solution(long num) {
    int cnt = 0;
    while (num != 1) {
      num = (num % 2L == 0) ? (num / 2L) : (num * 3L) + 1L;
      cnt++;
      if (cnt >= 500) return -1;
    }
    return cnt;
  }

  public static void main(String[] args) {
    System.out.println(solution(6));
    System.out.println(solution(16));
    System.out.println(solution(626331));
    System.out.println(solution(1));
  }

}
