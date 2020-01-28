package 스택_큐.다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

  public int solution(int bridgeLength, int weight, int[] truckWeights) {
    int answer = 0;
    Queue<Integer> wait = new LinkedList<>();
    Queue<Integer> passing = new LinkedList<>();
    Queue<Integer> pass = new LinkedList<>();
    Queue<Integer> time = new LinkedList<>();
    int currentTruckWeight = 0;
    int totalWeight = 0;

    for (int truckWeight : truckWeights)
      wait.add(truckWeight);

    while (pass.size() != truckWeights.length) {
      currentTruckWeight = wait.isEmpty() ? 0 : wait.peek();
      if (wait.size() != truckWeights.length &&
          time.peek() + bridgeLength == answer) {
        pass.add(passing.peek());
        time.remove();
        totalWeight -= passing.poll();
        System.out.println(totalWeight);
      }
      if (totalWeight + currentTruckWeight <= weight) {
        passing.add(wait.peek());
        time.add(answer);
        if (!wait.isEmpty())
          totalWeight += wait.poll();
      }
      answer++;
    }
    return answer;
  }

}