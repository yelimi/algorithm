import java.util.*;
class Solution {
  public long solution(long n) {
      long answer = 0;
      String temp = "";
      int length = (int)(Math.log10(n)+1);
      
      String[] str = new String[length];
      str = Long.toString(n).split("");
      
      Arrays.sort(str, Collections.reverseOrder());
      
      for(int i=0;i<length;i++)
          temp = temp + str[i];
      
      answer = Long.parseLong(temp);
      return answer;
      
  }
}
