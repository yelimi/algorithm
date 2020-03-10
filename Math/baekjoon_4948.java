import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
		while(true) {
			int n = sc.nextInt();
			if(n == 0)
				break;
		
			int check = 0;
			int count = 0;
            
			for(int i=n+1;i<=(2*n);i++) {
				if(i == 1)
					check = 1;
                
				int mn = (int)Math.sqrt(i)+1;
                
				for(int j=2;j<mn;j++) {
					if(i % j == 0) {
						check = 1;
						break;
					}
				}
                
				if(check == 0)
					count++;
                
				check = 0;
			}
            
			System.out.println(count);
            
		}
			
	}
}
