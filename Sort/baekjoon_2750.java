import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
        
		for(int i=0;i<n;i++) {
			list[i] = sc.nextInt();
		}
        
		for(int j=0;j<n;j++) {
			for(int k=0;k<n-1-j;k++) {
				if(list[k]>list[k+1]) {
					int temp = list[k+1];
					list[k+1] = list[k];
					list[k] = temp;
				}
			}
		}
        
		for(int r=0;r<n;r++)
			System.out.println(list[r]);
	
	}
}
