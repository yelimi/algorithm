import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int k=0;k<n;k++) {
			int x = sc.nextInt();
			int min = x / 2;
			int max = x - min;
			int y = 0;
			
			while(y==0) {
				int a = chec(min);
				int b = chec(max);
			
				if(a==0 && b==0) {
					System.out.print(min);
					System.out.println(" " + max);
					break;
				}
				else {
					min = min - 1;
					max = max + 1;
				}
			}
		}
		
	}
	
	public static int chec(int y) {
		int check = 0;
		for(int i=2;i<y;i++) {
			if(y%i==0) {
				check = 1;
				break;
			}
		}
		if(check==1)
			return 1;
		else
			 return 0;
	}
}
