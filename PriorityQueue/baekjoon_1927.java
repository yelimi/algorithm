import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //연산의 개수. 
		PriorityQueue pq = new PriorityQueue();
		
		for(int i=0;i<n;i++) {
			int x = Integer.parseInt(br.readLine()); //정수. 
			
			if(pq.isEmpty() && x == 0)
				System.out.println("0");
			else if(!pq.isEmpty() && x == 0)
				System.out.println((int)pq.poll());
			else
				pq.offer(x);
		}
		
	}
}


