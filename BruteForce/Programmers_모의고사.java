import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] list3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cor = new int[3];
        ArrayList list = new ArrayList();
         
       for(int i=0;i<answers.length;i++){
           if(answers[i] == list1[i%5])
               cor[0]++;
           if(answers[i] == list2[i%8])
               cor[1]++;
           if(answers[i] == list3[i%10])
               cor[2]++;
       }
        
        if(cor[0] > cor[1] && cor[0] > cor[2])
            list.add(1);
        else if(cor[1] > cor[0] && cor[1] > cor[2])
            list.add(2);
        else if(cor[2] > cor[0] && cor[2] > cor[1])
            list.add(3);
        else if(cor[0] == cor[1] && cor[0] == cor[2]){
            for(int i=0;i<3;i++)
                list.add(i+1);
        }
        else if(cor[0] == cor[1] && cor[0] != cor[2]){
            list.add(1);
            list.add(2);
        }
        else if(cor[0] == cor[2] && cor[0] != cor[1]){
            list.add(1);
            list.add(3);
        }
        else if(cor[1] == cor[2] && cor[1] != cor[0]){
            list.add(2);
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++)
            answer[i] = (int)list.get(i);
        
        return answer;
        
    }
}
