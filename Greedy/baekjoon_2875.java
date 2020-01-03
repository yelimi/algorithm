import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 여자 인원.
		int m = Integer.parseInt(st.nextToken()); // 남자 인원. 
		int k = Integer.parseInt(st.nextToken()); // 인턴 인원.
		int team = 0;
		
		if((n + m) > k) {
			if((n / 2) > m)
				team = m;
			else
				team = n / 2;
			
			k = k - ((n + m) - (team * 3));
			
			if(k > 0)
				team = team - ((k + 2) / 3);
		}
		
		System.out.print(team);
		
	}	
}


