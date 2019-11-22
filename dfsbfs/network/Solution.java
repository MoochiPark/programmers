package io.wisoft.programmers.dfsbfs.network;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  public int solution(int n, int[][] computers) {
    int answer = 1;
    List<Computer> computerList = IntStream.range(0, n)
        .mapToObj(i -> new Computer(i, computers[i]))
        .collect(Collectors.toList());
    Queue<Computer> queue = new LinkedList<>(List.of(computerList.get(0)));

    while (!computerList.stream()
        .allMatch(Computer::isVisit)) {

      if (queue.isEmpty()) {
        for (Computer computer : computerList) {
          if (!computer.isVisit()) {
            queue.offer(computer);
            answer++;
            break;
          }
        }
      }
      Computer computer = queue.poll();
      computer.setVisit();
      int[] connection = computer.getConnection();

      IntStream.range(1, n)
          .filter(i -> connection[i] == 1 && computer.getNumber() != i && !computerList.get(i).isVisit())
          .forEach(i -> queue.offer(computerList.get(i)));
    }
    return answer;

  }

  class Computer {

    private int number;
    private int[] connection;
    private boolean visit;

    public Computer(final int number, final int[] connection) {
      this.number = number;
      this.connection = connection;
      this.visit = false;
    }

    public int getNumber() {
      return number;
    }

    public int[] getConnection() {
      return connection;
    }

    public boolean isVisit() {
      return this.visit;
    }

    public void setVisit() {
      this.visit = true;
    }

  }

  public static void main(String[] args) {
    Solution solution = new Solution();
//    System.out.println(solution.solution(4, new int[][]{{1, 1, 0, 1},
//        {1, 1, 0, 1},
//        {0, 0, 1, 0},
//        {1, 1, 0, 1}}));
    System.out.println(solution.solution(4, new int[][]{{1, 0, 0, 1},
        {1, 1, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 0, 1}}));
//    System.out.println(solution.solution(3, new int[][]{{1, 0, 0},
//        {0, 1, 0},
//        {0, 0, 1}}));
//    System.out.println(solution.solution(1, new int[][]{{1}}));
  }

}
