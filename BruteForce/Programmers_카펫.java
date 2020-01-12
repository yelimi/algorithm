class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int j = 0;
        
        for(int i=3;i<=(brown + red);i++){
            if((brown + red) % i == 0){
                j = (brown + red) / i;
                if(((j - 2) * (i - 2)) == red){
                    answer[0] = j;
                    answer[1] = i; 
                    break;
                }
            }
        } 
        
        return answer;
        
    }
}
