import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		int result = 0;
		
		for(int i=0;i<=B.length()-A.length();i++) {
			String b = B.substring(i,i+A.length());
			int count = 0;
			
			for(int j=0;j<b.length();j++) {
				if(A.charAt(j) == b.charAt(j))
					count++;
			}
			
			if(result < count)
				result = count;
		}
		
		System.out.print(A.length() - result);
		
	}	
}


