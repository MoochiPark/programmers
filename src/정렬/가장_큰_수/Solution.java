import java.util.Arrays;
import static java.util.stream.Collectors.joining;

public class Solution {

  public String solution(int[] numbers) {
    String answer = Arrays.stream(numbers).parallel()
        .mapToObj(Integer::toString)
        .sorted((a, b) -> (b + a).compareTo(a + b))
        .collect(joining());

    return answer.startsWith("0") ? "0" : answer;
  }
}
