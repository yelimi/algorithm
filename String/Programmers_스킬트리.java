class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0;i<skill_trees.length;i++){
            int count = 0;
            boolean check = true;
            String[] str = skill_trees[i].split("");
            
            for(int k=0;k<str.length;k++){
                if(count < skill.indexOf(str[k])){
                    check = false;
                    break;
                }
                else if(count == skill.indexOf(str[k]))
                    count++;
            }
            
            if(check == true)
                answer++;
            
            count = 0;
        }
        
        return answer;
        
    }
}
