class Solution {
  public String solution(String s) {
      String answer = "";
      boolean check = true;
      String[] list = s.split("");
      
      for(int i=0;i<list.length;i++){
          if(list[i].equals(" ")){
              answer = answer + " ";
              check = true;
          }
          else{
              if(check == true){
                  answer = answer + list[i].toUpperCase();
                  check = false;
              }
              else
                  answer = answer + list[i].toLowerCase();
          }
      }
      
      return answer;
      
  }
}
