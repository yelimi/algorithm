import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		HashSet<String> list = new HashSet<String>(); // 중복값 저장 x, string만 가능. 
		List<String> result = new ArrayList<String>();
 		
		for(int i=0;i<n;i++) 
			list.add(br.readLine());
		for(int i=0;i<m;i++) { 
			String str = br.readLine();
			
			if(list.contains(str)) {
				result.add(str);
				cnt++;
			}
		}
		
		Collections.sort(result);  // 사전순 정렬. 
		
		System.out.println(cnt);
		for(int x=0;x<result.size();x++)
			System.out.println(result.get(x));
					
	}
}
