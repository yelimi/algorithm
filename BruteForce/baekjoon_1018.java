import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] color = new char[n][m];
        
	    for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j=0;j<m;j++) {
				color[i][j] = s.charAt(j);
			}
		}
		
		int cntw = 0, cntb = 0;
		int minw = 0, minb = 0;
		int tempw = 99, tempb = 99;
        
		for(int x=0;x<=n-8;x++) {
			for(int y=0;y<=m-8;y++) {
				cntw = 0;
				for(int k=x;k<x+8;k++) {
					for(int r=y;r<y+8;r++) {
						if((k%2==0&&r%2==0)||(k%2!=0&&r%2!=0)) {
							if(color[k][r]!='W')
								cntw++;
							continue;
						}
						if((k%2==0&&r%2!=0)||(k%2!=0&&r%2==0)) {
							if(color[k][r]!='B')
								cntw++;
							continue;
						}
					}
				}
				minw = Math.min(cntw, tempw);
				tempw = minw;
			}
		}
		
		for(int x=0;x<=n-8;x++) {
			for(int y=0;y<=m-8;y++) {
				cntb = 0;
				for(int k=x;k<x+8;k++) {
					for(int r=y;r<y+8;r++) {
						if((k%2==0&&r%2==0)||(k%2!=0&&r%2!=0)) {
							if(color[k][r]!='B')
								cntb++;
							continue;
						}
						if((k%2==0&&r%2!=0)||(k%2!=0&&r%2==0)) {
							if(color[k][r]!='W')
								cntb++;
							continue;
						}
					}
				}
				minb = Math.min(cntb, tempb);
				tempb = minb;
			}
		}
        
		int min = Math.min(minw, minb);
		System.out.println(min);
	}
}
