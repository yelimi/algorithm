class Solution {
  public String solution(String s) {
      String answer = "";
      int i = 0;
      
      if(s.length() % 2 == 0){
          i = s.length() / 2;
          answer = s.substring(i-1,i+1);
      }
      else{
          i = s.length() / 2;
          answer = s.substring(i,i+1);
          //answer = Character.toString(s.charAt(i)); 
      }
      
      return answer;
      
  }
}
