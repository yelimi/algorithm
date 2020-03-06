import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
        
		int min = 0;
		int sum = 0;
		int count = 0;
	
		for(int i=m;i<=n;i++) {
			int cnt = 0;
            
			for(int j=1;j<=i;j++) {
				if(i % j == 0)
					cnt++;
			}
            
			if(cnt==2) {
				count++;
				sum = sum + i;
				if(count==1)
					min = i;
			}
		}
        
		if(count==0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
