import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 1;
		int index = 0;
		
		while(true) {
			sum = sum + (6 * index);
			if(sum >= n) {
				System.out.print(index + 1);
				break;
			}
			index++;
		}
		
	}
}


