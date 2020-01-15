import java.util.*;

class Solution {
  public int[] solution(int[] arr, int divisor) {
      List<Integer> list = new LinkedList<Integer>();
      
      for(int i=0;i<arr.length;i++){
          if(arr[i] % divisor == 0)
              list.add(arr[i]);
      }
      
      if(list.size() == 0){
          int[] answer = new int[1];
          answer[0] = -1;
          return answer;
      }
      else{    
          int[] answer = new int[list.size()];
          for(int i=0;i<answer.length;i++)
              answer[i] = list.get(i);
      
          Arrays.sort(answer);
          
          return answer;
      }
  }
}
