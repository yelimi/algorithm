import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		int sum = 0;
        
		for(int i=0;i<n;i++)
			list[i] = sc.nextInt();
        
		Arrays.sort(list);
        
		for(int i=0;i<n;i++) {
			int temp = 0;
			for(int j=0;j<=i;j++) {
				temp = temp + list[j];
			}
			sum = sum + temp;
		}
        
		System.out.println(sum);
		
	}	
}
