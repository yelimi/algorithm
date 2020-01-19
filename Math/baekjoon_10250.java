import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // T개의 테스트. 
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken()); // 각각 호텔의 층수. 
			int w = Integer.parseInt(st.nextToken()); // 각 층의 방 수. 
			int n = Integer.parseInt(st.nextToken()); // 몇 번째 손님.
			
			if(n % h > 0) {
				System.out.print(n % h);
				if(((n / h) + 1) > 9)
					System.out.println((n / h) + 1);
				else {
					System.out.print(0);
					System.out.println((n / h) + 1);
				}
			}
			else {
				System.out.print(h);
				if((n / h) > 9)
					System.out.println(n / h);
				else {
					System.out.print(0);
					System.out.println(n / h);
				}
			}
		}
		
	}
}


