import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] temp_B = new Integer[B.length];
        
        for(int i=0;i<B.length;i++)
            temp_B[i] = B[i];
        
        Arrays.sort(A);
        Arrays.sort(temp_B, Collections.reverseOrder());
        
        for(int i=0;i<A.length;i++)
            answer = answer + (A[i] * temp_B[i]);
            
        return answer;
        
    }
}
