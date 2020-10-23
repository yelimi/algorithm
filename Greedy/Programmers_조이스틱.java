class Solution {
    public int solution(String name) {
        int answer = 0;
        int up = 0;
        int down = 0;
        int len = name.length() - 1;
        
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) != 'A'){
                up = name.charAt(i) - 'A';
                down = 'Z' - name.charAt(i) + 1;
                answer = answer + Math.min(up, down);
            }         
        }
        
        for(int j=0;j<name.length();j++){
            if(name.charAt(j) != 'A'){
                int next = j + 1;
                
                while(next < name.length() && name.charAt(next) == 'A'){
                    next++;
                }
                
                int cnt = 2 * j + name.length() - next;
                len = Math.min(cnt, len);
            }
        }
        return answer + len;
    }
}
