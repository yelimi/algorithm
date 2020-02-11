class Solution {
  public int[] solution(int[] arr) {
      int[] answer = {};
      int min = 0;
      int index = 0;
      
      if(arr.length == 1){
          answer = new int[1];
          answer[0] = -1;
          return answer;
      }
     
      for(int i=1;i<arr.length;i++){
          if(arr[min] > arr[i])
              min = i;
      }
      
      answer = new int[arr.length - 1];
      for(int i=0;i<arr.length;i++){
          if(i == min)
              continue;
          
          answer[index] = arr[i];
          index++;
      }
          
      return answer;
      
  }
}
