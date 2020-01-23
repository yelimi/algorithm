import java.util.*;

class Solution {
  public String[] solution(String[] strings, int n) {
      String[] answer = new String[strings.length];
      
      Arrays.sort(strings, new Comparator<>(){
          public int compare(String s1, String s2){
              if(s1.charAt(n) > s2.charAt(n))
                  return 1;
              else if(s1.charAt(n) == s2.charAt(n))
                  return s1.compareTo(s2); //s1이 크면 양수, s2가 크면 음수, 같으면 0 반환. 맨 첫자리부터 차례대로 비교하는 특성. 
              else if (s1.charAt(n) < s2.charAt(n))
                  return -1;
              else
                  return 0;
          }
      });

      for(int i=0;i<strings.length;i++)
          answer[i] = strings[i];
      
      return answer;
      
  }
}
