import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int star = 0;
		int temp = 0;
		int rest = 0;
		int cnt = (2 * n) - 1;
		
		for(int i=n;i>=1;i--) {
			star = (2 * i) - 1;
			rest = cnt - star;
	
			for(int k=0;k<rest/2;k++)
				System.out.print(" ");
			
			for(int j=1;j<=star;j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		
		for(int i=n+1;i<=cnt;i++) {
			temp = i - (n - 1);
			star = (2 * temp) - 1;
			rest = cnt - star;
			
			for(int k=0;k<rest/2;k++)
				System.out.print(" ");
			
			for(int j=1;j<=star;j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	
	}
}


