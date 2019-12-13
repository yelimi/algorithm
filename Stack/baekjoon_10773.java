import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int sum = 0;
		Stack stack = new Stack();
        
		for(int i=0;i<k;i++) {
			int num = sc.nextInt();
			if(num==0)
				stack.pop();
			else
				stack.push(num);
		}
        
		for(int i=0;i<stack.size();i++)
			sum = sum + (Integer) stack.get(i);
        
		System.out.println(sum);
	}
}
