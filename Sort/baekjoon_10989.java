import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[10001];
        
		for(int i=0;i<n;i++) {
			list[Integer.parseInt(br.readLine())]++;
		}
		
		for(int j=0;j<list.length;j++) {
			if(list[j]>0) {
				for(int k=0;k<list[j];k++) {
					bw.write(Integer.toString(j)+"\n");
				}
			}
		}
		
		br.close();
		bw.close();
		
	}
}
