import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int book = 0; // 9권 가격
		int p = 0;
		int sum = Integer.parseInt(br.readLine()); // 총 10권의 가격 
		
		for(int i=0;i<9;i++) {
			p = Integer.parseInt(br.readLine());
			book = book + p;
		}
		
		System.out.print(sum - book);
		
	}
}
