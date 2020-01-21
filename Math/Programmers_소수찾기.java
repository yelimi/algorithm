class Solution {
  public int solution(int n) {
      int answer = 0;
      boolean[] check = new boolean[n+1];
      
      for(int i=2;i<n;i++){
          for(int j=2;j<n;j++){
              if(i * j <= n){
                  if(check[(i * j)] == false)
                      check[(i * j)] = true;
              }
              else
                  break;
          }
      }
      
      for(int i=2;i<=n;i++){
          if(check[i] == false)
              answer++;
      }
      return answer;
      
  }
}
