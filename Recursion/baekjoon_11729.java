import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static BufferedWriter bw;
	public static BufferedReader br;
    
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
        
		System.out.println((int)Math.pow(2, n)-1);
		move(n,1,2,3);
		
		bw.flush();
		br.close();
		bw.close();
	}
	
    // from에 있는 num개의 원반을 by를 거쳐 to로 이동.
	static void move(int num,int from, int by,int to) throws IOException {
		if(num==0) return;
		
		move(num-1,from,to,by); // num-1개를 A에서 B로 이동.
		bw.write(from+" "+to+"\n");
		move(num-1,by,from,to);	// num-1개를 B에서 C로 이동.
	}
    
}
