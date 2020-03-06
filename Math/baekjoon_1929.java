import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int check = 0;
        
		for(int i=m;i<=n;i++) {
			if(i == 1)
				check = 1;
            
			int mn = (int)Math.sqrt(i)+1;
            
			for(int j=2;j<mn;j++) {
				if(i % j == 0) {
					check = 1;
					break;
				}
			}
            
			if(check==0)
				System.out.println(i);
            
			check = 0;
		}
	
	}
}
