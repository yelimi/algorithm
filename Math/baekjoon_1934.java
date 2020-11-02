import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int tmp = Math.min(a, b);
			int result = 0;
			int obj = 0;
			
			for(int j=1;j<=tmp;j++) {
				if((a % j == 0) && ( b % j == 0))
					obj = j; // 최대공약수 
				
				result = a * b / obj;  // 최소공배수 
			}
			
			System.out.println(result);
		}
		
	}
}
