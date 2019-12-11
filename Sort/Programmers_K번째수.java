import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        int nn = 0;
        
        for(int i=0;i<len;i++){
            int n = 0;
            int[] list = new int[commands[i][1]-commands[i][0]+1];

            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                list[n] = array[j];
                n++;
            }

            Arrays.sort(list);

            answer[nn] = list[commands[i][2]-1];
            nn++;
        }

        return answer;
    }
}
