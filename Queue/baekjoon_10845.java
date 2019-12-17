import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int last = 0;
		Queue q = new LinkedList();
        
		for(int i=0;i<n;i++) {
			String str = sc.next();
            
			if(str.contains("push")) {
				int num = sc.nextInt();
				last = num;
				q.add(num);
			}
			else if(str.contains("pop")) {
				if(q.isEmpty()==true)
					System.out.println("-1");
				else
					System.out.println(q.poll());
			}
			else if(str.contains("front")) {
				if(q.isEmpty()==true)
					System.out.println("-1");
				else
					System.out.println(q.peek());
			}
			else if(str.contains("back")) {
				if(q.isEmpty()==true)
					System.out.println("-1");
				else
					System.out.println(last);
			}
			else if(str.contains("size")) {
				System.out.println(q.size());
			}
			else if(str.contains("empty")) {
				if(q.isEmpty()==true)
					System.out.println("1");
				else
					System.out.println("0");
			}
		}
		
	}
}
