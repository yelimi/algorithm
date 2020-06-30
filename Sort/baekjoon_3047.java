import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = br.readLine();
		int[] list = new int[3];
		
		for(int i=0;i<3;i++)
			list[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(list);
		
		for(int j=0;j<3;j++) {
			if(str.charAt(j) == 'A')
				System.out.print(list[0]+" ");
			else if(str.charAt(j) == 'B')
				System.out.print(list[1]+" ");
			else
				System.out.print(list[2]+" ");
		}	
				
	}
}

