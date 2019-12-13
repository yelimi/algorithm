import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	static int n = 0;
	static boolean[] visit;
	static int[][] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 컴퓨터의 수.
		int m = Integer.parseInt(br.readLine()); // 컴퓨터 쌍의 수.
		graph = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i=1;i<=m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		System.out.println(dfs(1));
	}
	
	static int dfs(int i) {
		Stack stack = new Stack();
		stack.push(i);
		visit[i] = true;
		
		int temp = 0;
		int count = 0;
		
		while(!stack.isEmpty()) {
			temp = (int)stack.pop();
			for(int j=1;j<=n;j++) {
				if(graph[temp][j]==1 && visit[j]==false) {
					visit[j] = true;
					stack.push(j);
					count++;
				}
			}
		}
        
		return count;
	}
	
}
