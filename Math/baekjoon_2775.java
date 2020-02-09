import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        
		for(int i=0;i<t;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] list = new int[k+1][n+1];
            
			for(int j=0;j<=k;j++) {
				for(int r=1;r<=n;r++) {
					if(j==0)
						list[j][r] = r;
					else {
						for(int x=1;x<=r;x++) {
							list[j][r] = list[j][r] + list[j-1][x];
						}
					}
				}
			}
            
			System.out.println(list[k][n]);
		}

	}
}
