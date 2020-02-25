class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      
      for(int i=0;i<n;i++){
          answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]) // int형 -> 2진수 문자열
                        .replace("0", " ")
                        .replace("1", "#");
          
          int len = n - answer[i].length();
          
          if(answer[i].length() < n){
              for(int j=0;j<len;j++)
                  answer[i] = " " + answer[i];
          }
      }
      
      return answer;
      
  }
}
