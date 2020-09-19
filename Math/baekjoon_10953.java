import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			String[] list = str.split(",");
			int sum = 0;
			
			for(int j=0;j<2;j++) {
				int n = Integer.parseInt(list[j]);
				sum = sum + n;
			}
			System.out.println(sum);
		}
		
	}
}
