class Solution {
  public int solution(int n) {
      int answer = 0;
      int sum = 0;
      int num = 0;
      
      for(int i=1;i<=n/2;i++){
          sum = 0;
          num = i;
          
          while(sum < n){
              sum = sum + num;
              num++;
          }
          
          if(sum == n)
                  answer++;
          if(sum > n)
              continue;
      }
      answer++;
      
      return answer;
      
  }
}
