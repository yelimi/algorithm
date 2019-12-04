import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		int[] h = new int[n];
		int[] r = new int[n];
        
		for(int p=0;p<n;p++) {
			r[p] = r[p] + 1;
		}
        
		for(int i=0;i<n;i++) {
			w[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
        
		for(int j=0;j<n;j++) {
			for(int k=0;k<n;k++) {
				if(w[j]>w[k] && h[j]>h[k]) {
					r[k] = r[k] + 1;
				}
			}
		}
        
		for(int q=0;q<n;q++) {
			System.out.println(r[q]);
		}
		
	}
}

