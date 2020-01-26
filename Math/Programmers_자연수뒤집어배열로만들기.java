class Solution {
  public int[] solution(long n) {
      String str = Long.toString(n);
      int[] answer = new int[str.length()];
      char c = ' ';
      
      for(int i=0;i<str.length();i++){
          c = str.charAt(str.length()-i-1);
          answer[i] = c - '0'; // char->int. 
      }
     
      return answer;
      
  }
}
