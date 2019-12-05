import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int k = sc.nextInt(); // 입력한 돈.
		int[] list = new int[n];
        
		for(int i=0;i<n;i++) {
			list[i] = sc.nextInt(); // 1원~50000 입력.
		}
        
		for(int i=n-1;i>=0;i--) {
			if(k%list[i]>=0) { // 나누기가 가능하다면. 
				int x  = k/list[i];
				count = count + x;
				k = k - (x*list[i]);
			}
		}
        
		System.out.println(count);
			
	}
}	
