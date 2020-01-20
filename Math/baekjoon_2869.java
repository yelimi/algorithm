import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int day = 0;
		day = (v - b) / (a - b); //목표 지점에 도달한 날에는 미끄러지는 것을 감안하면 안됨. 
		
		if((v - b) % (a - b) != 0)
			day++;
		
		System.out.print(day);
		
	}
}


