import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt0 = 0;
		int cnt1 = 0;
		
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0)
				cnt0++;
			else
				cnt1++;
		}
		
		if(cnt0 > cnt1)
			System.out.print("Junhee is not cute!");
		else
			System.out.print("Junhee is cute!");
		
	}
}
