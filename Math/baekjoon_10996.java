import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int tmp = n / 2;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-tmp;j++)
				System.out.print("* ");
			System.out.println();
			
			for(int k=1;k<=tmp;k++)
				System.out.print(" *");
			System.out.println();
		}
		
	}
}
