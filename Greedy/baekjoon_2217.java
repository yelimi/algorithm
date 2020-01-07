import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] w = new Integer[n];
		int max = 0;
        
		for(int i=0;i<n;i++)
			w[i] = sc.nextInt();
        
		Arrays.sort(w,Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			int num = w[i] * (i+1);
			if(max<num)
				max = num;
		}
        
		System.out.println(max);
		
	}	
}	
