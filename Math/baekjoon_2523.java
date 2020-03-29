import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = (2 * n) - 1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i=cnt;i>n;i--) {
			for(int j=1;j<=i-n;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	
	}
}
