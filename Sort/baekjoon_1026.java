import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		Integer[] b = new Integer[n];
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			a[i] = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int j=0;j<n;j++)
			b[j] = Integer.parseInt(st2.nextToken());
		
		Arrays.sort(a);
		Arrays.sort(b,Collections.reverseOrder());
		
		for(int k=0;k<n;k++)
			sum = sum + (a[k] * b[k]);
		
		System.out.print(sum);
			
	}
}
