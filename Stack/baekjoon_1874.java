import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int temp = 0;
        
		for(int i=0;i<n;i++)
			list[i] = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			stack.push(i);
			sb.append("+\n");
            
			while(!stack.isEmpty() && stack.peek().equals(list[temp]) && temp<n) {
				stack.pop();
				temp++;
				sb.append("-\n");
			}
		}
		
		if(!stack.isEmpty()) {
			sb.setLength(0);
			sb.append("NO\n");
		}
        
		System.out.print(sb.toString());
	}
}
