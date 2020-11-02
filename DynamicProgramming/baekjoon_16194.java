import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());  // 카드의 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] p = new int[n+1];  //p1~pn 입력
		for(int i=1;i<=n;i++)
			p[i] = Integer.parseInt(st.nextToken());
		
		int[] list = new int[n+1]; // 최솟값 찾기
		for(int j=1;j<=n;j++) {
			list[j] = p[j];
			for(int k=1;k<=j;k++) {
				list[j] = Math.min(list[j],list[j-k] + p[k]);
			}
		}
		
		System.out.print(list[n]);
		
	}
}
