import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		int sum = 0;
		int max = 0;
		for(int a=0;a<n;a++) {
			for(int b=a+1;b<n;b++) {
				for(int c=b+1;c<n;c++) {
					sum = num[a]+num[b]+num[c];
					if(sum<=m)
						max = Math.max(max, sum);
				}
			}
		}
		System.out.println(max);

	}
}

