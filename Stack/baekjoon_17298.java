import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		for(int i=0;i<n;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack s = new Stack();
		int[] answer = new int[n];
		StringBuilder sb = new StringBuilder();
        
		for(int i=n-1;i>=0;i--) {
			while(!s.isEmpty() && (int)s.peek()<=list[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				answer[i] = -1;
			}
			else {
				answer[i] = (int) s.peek();
			}
			s.push(list[i]);
		}
		
		for(int i=0;i<n;i++) {
			sb.append(answer[i]+" ");
		}
        
		System.out.println(sb.toString());
	}	
}
