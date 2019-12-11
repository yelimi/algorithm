import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	static int n = 0;
	static int v = 0;
	static boolean[] visit;
	static int[][] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st1.nextToken()); // 정점의 개수.
		int m = Integer.parseInt(st1.nextToken()); // 간선의 개수.
		v = Integer.parseInt(st1.nextToken()); // 시작할 정점 번호.
		graph = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i=1;i<=m;i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st2.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		dfs(v);
		System.out.println();
		for(int i=1;i<=n;i++)
			visit[i] = false;
		bfs(v);
		
	}
	
	static void dfs(int i) {
		visit[i] = true;
		System.out.print(i+" ");
		
		for(int j=1;j<=n;j++) {
			if(graph[i][j]==1 && visit[j]==false)
				dfs(j);
		}
	}
	
	static void bfs(int i) {
		Queue queue = new LinkedList();
		queue.offer(i);
		visit[i] = true;
		System.out.print(i+" ");
		
		int temp;
		
		while(!queue.isEmpty()) {
			temp = (int) queue.poll();
			
			for(int j=1;j<=n;j++) {
				if(graph[temp][j]==1 && visit[j]==false) {
					queue.offer(j);
					visit[j] = true;
					System.out.print(j+" ");
				}
			}
		}
	}
	
}
