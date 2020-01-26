class Solution {

    public int[] solution(int[] heights) {
         int[] answer = new int[heights.length];
    for (int i = 1; i < heights.length; i++)
      for (int j = i; j > 0; j--) 
        if (heights[j - 1] > heights[i]) {
          answer[i] = j;
          break;
        }
    return answer;
  }

}
