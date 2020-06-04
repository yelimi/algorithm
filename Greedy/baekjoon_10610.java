import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		Integer[] list = new Integer[n.length()];
		int sum = 0;
		
		for(int i=0;i<n.length();i++) {
			list[i] = n.charAt(i) - '0';
			sum = sum + list[i];
		}
		
		if(n.contains("0") && sum % 3 == 0) {
			Arrays.sort(list,Collections.reverseOrder());
			
			for(int j=0;j<list.length;j++)
				System.out.print(list[j]);
		}
		else
			System.out.print("-1");
		
	}
}

