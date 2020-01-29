import java.util.*;

public class Solution {

  public int[] solution(String[] genres, int[] plays) {
    LinkedList<Integer> answer = new LinkedList<>();
    HashMap<String, PriorityQueue<Music>> classifiedHash = new HashMap<>();
    HashMap<String, Integer> sumHash = new HashMap<>();

    for (int j = 0; j < genres.length; j++) {
      if (!sumHash.containsKey(genres[j])) {
        sumHash.put(genres[j], plays[j]);
      } else {
        sumHash.put(genres[j], sumHash.get(genres[j]) + plays[j]);
      }
    }
    for (int i = 0; i < genres.length; i++) {
      if (!classifiedHash.containsKey(genres[i])) {
        classifiedHash.put(genres[i], new PriorityQueue<>(Comparator.comparing(Music::getPlay, Comparator.reverseOrder())));
      }
        classifiedHash.get(genres[i]).offer(new Music(i, plays[i]));
    }
    sumHash
        .entrySet()
        .stream()
        .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
        .forEach(entry -> {
          String genre = entry.getKey();
          answer.add(classifiedHash.get(genre).poll().getIndex());
            if (classifiedHash.get(genre).size() >= 1) {
              answer.add(classifiedHash.get(genre).poll().getIndex());
            }
        });

    return answer.stream().mapToInt(i -> i).toArray();
  }

  class Music {

    private int index;
    private int play;

    public Music(int index, int play) {
      this.index = index;
      this.play = play;
    }

    public int getIndex() {
      return index;
    }

    public int getPlay() {
      return play;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("Music{");
      sb.append("index=").append(index);
      sb.append(", play=").append(play);
      sb.append('}');
      return sb.toString();
    }
  }


}
