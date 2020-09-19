import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] list = str.split("-");
		String result = "";
		
		for(int i=0;i<list.length;i++) {
			char ch = list[i].charAt(0);
			result = result + ch;
		}
		
		System.out.print(result);
		
	}
}
