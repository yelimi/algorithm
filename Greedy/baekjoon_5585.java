import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()); //지불할 돈.
		
		int r = 1000 - m; // 잔돈. 
		int count = 0; // 잔돈의 개수. 
		
		while(r > 0) {
			if(r >= 500) {
				count = count + (r / 500);
				r = r - ((r / 500) * 500);
			}
			
			if(r >= 100) {
				count = count + (r / 100);
				r = r - ((r / 100) * 100);
			}
			
			if(r >= 50) {
				count = count + (r / 50);
				r = r - ((r / 50) * 50);
			}
			
			if(r >= 10) {
				count = count + (r / 10);
				r = r - ((r / 10) * 10);
			}
			
            if(r >= 5) {
				count = count + (r / 5);
				r = r - ((r / 5) * 5);
			}
            
			if(r >= 1) {
				count = count + r;
				r = 0;
			}
				
		}
		
		System.out.print(count);
		
	}	
}


