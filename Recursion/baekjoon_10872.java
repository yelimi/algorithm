import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Fun(n);
	}
	
	static void Fun(int n) {
		int result = 1;
		for(int i=2;i<=n;i++) {
			result = result * i;
		}
		System.out.println(result);
	}
    
}
