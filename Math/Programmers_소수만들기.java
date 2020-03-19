class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len1 = nums.length - 3;
        int len2 = nums.length - 1;
        int sum = 0;
        boolean check = true;
        
        for(int i=0;i<=len1;i++){
            for(int j=i+1;j<len2;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum = nums[i] + nums[j] + nums[k];
                    check = true;
                    
                    for(int p=2;p<sum;p++){
                        if(sum % p == 0){
                            check = false;
                            break;
                        }
                    }
                    
                    if(check == true)
                        answer++;
                }
            }
        }

        return answer;
        
    }
}
