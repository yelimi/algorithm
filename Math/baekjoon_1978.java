import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int x = 0;
		int count = 0;
	
		for(int i=1;i<=n;i++) {
			x = sc.nextInt();
			int cnt = 0;
            
			for(int j=1;j<=x;j++) {
				if(x % j == 0)
					cnt++;
			}
            
			if(cnt==2)
				count++;
		}
        
		System.out.println(count);
        
	}
}
