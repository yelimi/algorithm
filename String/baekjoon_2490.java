import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<3;i++) {
			int zero = 0;
			int one = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<4;j++) {		
				if(st.nextToken().equals("0"))
					zero++;
				else
					one++;
			}
			
			if(zero == 1)
				System.out.println("A");
			else if(zero == 2)
				System.out.println("B");
			else if(zero == 3)
				System.out.println("C");
			else if(zero == 4)
				System.out.println("D");
			else
				System.out.println("E");
		}
				
	}
}

