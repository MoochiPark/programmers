package 큐.프린터;

import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  public int solution(int[] priorities, int location) {
    int answer = 0;
    Queue<Point> waitingQueue = IntStream.range(0, priorities.length)
        .mapToObj(i -> new Point(i, priorities[i])).collect(Collectors.toCollection(LinkedList::new));

    while (!waitingQueue.isEmpty()) {
      Point point = waitingQueue.poll();
      if (waitingQueue.isEmpty()) return ++answer;
      if (point.y >= Collections.max(waitingQueue, Comparator.comparing(Point::getY)).y) {
        answer++;
        if (point.x == location) {
          return answer;
        }
      } else {
        waitingQueue.add(point);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
//    System.out.println(new Solution().solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    System.out.println(new Solution().solution(new int[]{3, 3, 4, 2}, 3));
  }

}
