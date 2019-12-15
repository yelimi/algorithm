import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
		while(true){
			Stack<Character>stack = new Stack<Character>();
			boolean temp = true;
			String str = sc.nextLine();
			
			if(str.length()==1&&str.equals("."))
				break;
			
			for(int j=0;j<str.length();j++) {
				char c = str.charAt(j);
                
				if(c =='(')
					stack.push('(');
				else if(c =='[')
					stack.push('[');
				else if(c ==']') {
					if(!stack.empty()&&stack.peek()=='[')
						stack.pop();
					else {
						temp = false;
						break;
					}
				}
				else if(c ==')') {
					if(!stack.empty()&&stack.peek()=='(')
						stack.pop();
					else {
						temp = false;
						break;
					}
				}
			}
            
			if(stack.isEmpty()&&temp)
				System.out.println("yes");
			else
				System.out.println("no");
		}
        
		return;
	}
}
