package 연습문제.약수의_합;

public class Solution {

  public int solution(int n) {
    int answer = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        answer += i;
    }
    return answer + n;
  }

}