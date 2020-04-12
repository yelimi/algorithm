import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[3];
		int[] y = new int[3];
		String result = "";
		
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		if(x[0] == x[1])
			result = Integer.toString(x[2]);
		else if(x[0] == x[2])
			result = Integer.toString(x[1]);
		else
			result = Integer.toString(x[0]);
		
		result = result + " ";
		
		if(y[0] == y[1])
			result = result + Integer.toString(y[2]);
		else if(y[0] == y[2])
			result = result + Integer.toString(y[1]);
		else
			result = result + Integer.toString(y[0]);
		
		System.out.print(result);
		
	}
}


