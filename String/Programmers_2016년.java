class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
      int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      int sum = 0;
      
      for(int i=0;i<a-1;i++)
          sum = sum + date[i];
      
      sum = sum + b - 1; // -1을 하지 않으면 1월 1일도 하루가 지난 것으로 침.
      
      answer = day[sum % 7];
      return answer;
      
  }
}
