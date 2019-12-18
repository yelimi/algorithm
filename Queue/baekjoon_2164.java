import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue q = new LinkedList();
        
		for(int i=1;i<=n;i++)
			q.add(i);
        
		while(q.size()!=1) {
			q.poll();
			int num = (int) q.peek();
			q.poll();
			q.add(num);
		}
        
		System.out.println(q.peek());
    
	}
}
