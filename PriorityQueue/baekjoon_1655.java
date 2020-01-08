import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //정수의 개수. 
		
		PriorityQueue pq_min = new PriorityQueue(Collections.reverseOrder());
		PriorityQueue pq_max = new PriorityQueue();
		
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine()); //정수. 
			pq_max.offer(num);
			
			if((pq_min.size() + pq_max.size()) % 2 ==0) {
				if(num < (int)pq_min.peek()) {
					pq_min.offer((int)pq_max.poll());
					pq_max.offer((int)pq_min.poll());
				}
			}
			else
				pq_min.offer(pq_max.poll());
			
			System.out.println((int)pq_min.peek());   
		}
		
	}
}


