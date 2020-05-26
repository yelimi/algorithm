import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 
		
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(br.readLine()); // 지원자 수 
			int[][] rank = new int[n][2]; // 서류심사 성적, 면접 성적의 순위 
			int count = 1;
			
			for(int j=0;j<n;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int k=0;k<2;k++)
					rank[j][k] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(rank, new Comparator<int[]>(){
				public int compare(int arr1[], int arr2[]) {
					if(arr1[0] > arr2[0])
						return 1;
					else if(arr1[0] < arr2[0])
						return -1;
					return 0;
				}
			}); // 서류심사 성적의 순위를 오름차순으로 정렬 
			
			int temp = rank[0][1]; // 서류심사 성적의 순위가 1등이므로 합격 
			for(int x=1;x<n;x++) {
				if(rank[x][1] < temp) {
					count++;
					temp = rank[x][1];
				}
			} // 비교 대상인 서류심사 성적의 순위보다 순위가 작으면 count 
			
			System.out.println(count);
		}
		
	}
}

