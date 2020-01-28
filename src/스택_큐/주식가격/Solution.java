package 스택_큐.주식가격;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    Queue<Integer> queue = new LinkedList<>();
    int i, j, p;

    for (int price : prices)
      queue.add(price);

    for (i = 0; i < prices.length - 1; i++) {
      p = queue.poll();
      answer[i] = queue.size();
      j = 1;
      for (int q : queue) {
        if (p > q) {
          answer[i] = j;
          break;
        } j++;
      }
    }
    return answer;
  }

}