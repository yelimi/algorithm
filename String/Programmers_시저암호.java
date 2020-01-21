class Solution {
  public String solution(String s, int n) {
      String answer = "";
      char c = ' ';
      
      for(int i=0;i<s.length();i++){
          c = s.charAt(i);
          
          if(c == ' ')
              answer = answer + ' ';
          else if(Character.isLowerCase(c)){  //영문 소문자 여부를 판단하여 true/false 리턴. 
              if(c + n > 'z')
                  answer = answer + (char)((c + n) - 26);
              else
                  answer = answer + (char)(c + n);
          }
          else{
              if(c + n > 'Z')
                  answer = answer + (char)((c + n) - 26);
              else
                  answer = answer + (char)(c + n);
          }
      }
      
      return answer;
      
  }
}
