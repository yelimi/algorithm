import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue q = new LinkedList();
        
		for(int i=1;i<=n;i++)
			q.add(i);
        
		System.out.print("<");
        
		while(q.size()!=0) {
			for(int i=0;i<k-1;i++) {
				q.add(q.peek());
				q.poll();
			}
			System.out.print(q.peek());
			q.poll();
			if(q.size()!=0)
				System.out.print(", ");
		}
        
		System.out.print(">");
		
	}
}
