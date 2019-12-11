import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack stack = new Stack();
        
		for(int i=0;i<n;i++) {
			String str = sc.next();
            
			if(str.contains("push")) {
				int num = sc.nextInt();
				stack.add(num);
			}
            
			else if(str.contains("pop")) {
				if(stack.empty()==false)
					System.out.println(stack.pop());
				else
					System.out.println("-1");
			}
            
			else if(str.contains("size"))
				System.out.println(stack.size());
            
			else if(str.contains("empty")) {
				if(stack.empty()==true)
					System.out.println("1");
				else
					System.out.println("0");
			}
            
			else if(str.contains("top")) {
				if(stack.empty()==false)
					System.out.println(stack.peek());
				else
					System.out.println("-1");
			}
            
		}
		
	}
}
