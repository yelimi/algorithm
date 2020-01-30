import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int up = 0, down = 0;
		int cnt = 0;
		int num = 1;
        
		while(cnt<x){
			if(num%2==0) {
				down = num+1;
				up = 0;
				for(int j=1;j<=num;j++){
					up = up + 1;
					down = down - 1;
					cnt++;
					if(cnt==x)
						break;
				}
			}
			else {
				up = num+1;
				down = 0;
				for(int k=1;k<=num;k++){
					up = up - 1;
					down = down + 1;
					cnt++;
					if(cnt==x)
						break;
				}
			}
            
			num++;
		}
        
		System.out.println(up+"/"+down);

	}
}
