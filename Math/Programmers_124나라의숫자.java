class Solution {
  public String solution(int n) {
      String answer = "";
      int rest = 0;
      
      while(n > 0){
          rest = n % 3;
          n = n / 3;
          if(rest == 0){
              n = n - 1;
              rest = 4;
          }
          answer = rest + answer;
      }
      
      return answer;
      
  }
}
