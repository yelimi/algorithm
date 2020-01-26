class Solution {
  public String solution(String s) {
      String answer = "";
      int temp = 0;
      
      for(int i=0;i<s.length();i++){
          if(s.charAt(i) == ' '){
              temp = 0;
              answer = answer + " ";
          }
          else{
              if(temp % 2 == 0){
                  answer = answer + Character.toUpperCase(s.charAt(i));
                  temp++;
              }
              else{
                  answer = answer + Character.toLowerCase(s.charAt(i));
                  temp++;
              }
          }
      }
      
      return answer;
      
  }
}
