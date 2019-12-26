import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
        
		for(int i=0;i<n;i++) 
			list[i] = Integer.parseInt(br.readLine());
        
		//배열나누기
		int[] a = new int[n/2];
		int[] b = new int[n-n/2];
        
		for(int i=0;i<n/2;i++)
			a[i] = list[i];
        
		for(int i=0;i<n-n/2;i++)
			b[i] = list[n/2+i];
        
		Arrays.sort(a);
		Arrays.sort(b);
        
		//합치기 
		int k=0,r=0,j=0;
        
		while(true) {
			if(k<a.length) {
				if(r<b.length) {
					if(a[k]<=b[r]) {
						list[j] = a[k];
						k++;
						j++;
					}
					else {
						list[j] = b[r];
						r++;
						j++;
					}
				}
				else {
					list[j] = a[k];
					k++;
					j++;
				}
			}
			else {
				if(r<b.length) {
					list[j] = b[r];
					r++;
					j++;
				}
				else
					break;
			}
		}
        
		for(int s=0;s<n;s++)
			bw.write(list[s]+"\n");
        
        bw.flush();
        bw.close();
        
	}
}
