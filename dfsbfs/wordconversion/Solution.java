package io.wisoft.programmers.dfsbfs.wordconversion;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class Solution {

  class Node {

    String word;
    int count;

    public Node(String word, int count) {
      this.word = word;
      this.count = count;
    }

  }

  private boolean check(String current, String word) {
    return IntStream.range(0, word.length())
        .filter(i -> current.charAt(i) != word.charAt(i))
        .count() <= 1;
  }

  public int solution(String begin, String target, String[] words) {
    int answer = 0;
    Queue<Node> queue = new LinkedList<>(List.of(new Node(begin, 0)));
    boolean[] visit = new boolean[words.length];

    while (!queue.isEmpty()) {
      Node current = queue.poll();
      if (current.word.equals(target)) {
        answer = current.count;
        break;
      }
      IntStream.range(0, words.length)
          .filter(i -> !visit[i] && check(current.word, words[i]))
          .forEach(i -> {
            queue.offer(new Node(words[i], current.count + 1));
            visit[i] = true;
          });
    }
    return answer;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution("hot", "hit", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
  }

}
