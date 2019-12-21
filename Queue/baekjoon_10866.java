import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque dque = new LinkedList();
        
		for(int i=0;i<n;i++) {
			String str = sc.next();
            
			if(str.contains("push_front")) {
				int num = sc.nextInt();
				dque.addFirst(num);
			}
			else if(str.contains("push_back")) {
				int num = sc.nextInt();
				dque.addLast(num);
			}
			else if(str.contains("pop_front")) {
				if(dque.size()!=0)
					System.out.println(dque.pollFirst());
				else
					System.out.println("-1");
			}
			else if(str.contains("pop_back")) {
				if(dque.size()!=0)
					System.out.println(dque.pollLast());
				else
					System.out.println("-1");
			}
			else if(str.contains("size")) {
				System.out.println(dque.size());
			}
			else if(str.contains("empty")) {
				if(dque.size()!=0)
					System.out.println("0");
				else
					System.out.println("1");
			}
			else if(str.contains("front")) {
				if(dque.size()!=0)
					System.out.println(dque.peekFirst());
				else
					System.out.println("-1");
			}
			else if(str.contains("back")) {
				if(dque.size()!=0)
					System.out.println(dque.peekLast());
				else
					System.out.println("-1");
			}
		}
		
	}
}
