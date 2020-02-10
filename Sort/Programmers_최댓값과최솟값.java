import java.util.*;

class Solution {
  public String solution(String s) {
      String answer = "";
      String[] str = s.split(" ");
      int[] list = new int[str.length];
      
      for(int i=0;i<list.length;i++)
          list[i] = Integer.parseInt(str[i]);
      
      Arrays.sort(list);
      
      answer = list[0] + " " + list[list.length - 1];
      return answer;
      
  }
}
