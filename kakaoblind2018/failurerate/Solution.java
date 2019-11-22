package io.wisoft.programmers.kakaoblind2018.failurerate;

import java.awt.Point;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.Comparator.*;

public class Solution {

  public int[] solution(int N, int[] stages) {
    HashMap<Integer, Point> hashMap = new HashMap<>();

    for (int i = 1; i <= N; i++) {
      if (!hashMap.containsKey(i)) {
        hashMap.put(i, new Point());
      }
    }
    for (int stage : stages) {
      Point point = hashMap.get(stage);
      if (stage != N + 1) {
        point.setLocation(point.x + 1, point.y + 1);
        for (int s = stage - 1; s > 0; s--) {
          point = hashMap.get(s);
          point.setLocation(point.x, point.y + 1);
        }
      } else {
        for (int s = N; s > 0; s--) {
          point = hashMap.get(s);
          point.setLocation(point.x, point.y + 1);
        }
      }
    }
    return IntStream.rangeClosed(1, N)
        .mapToObj(i -> Map.entry(i,
            hashMap.get(i). y == 0 ? 0 : (double) hashMap.get(i).x / hashMap.get(i).y))
        .sorted(comparing(Map.Entry::getValue, reverseOrder()))
        .mapToInt(Map.Entry::getKey)
        .toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
  }

}
