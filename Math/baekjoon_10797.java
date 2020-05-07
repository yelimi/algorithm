import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine());
		
		int[] num = new int[5];
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<5;i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		for(int j=0;j<5;j++) {
			if(num[j] == day)
				count++;
		}
		
		System.out.print(count);

	}
}


