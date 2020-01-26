import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = br.readLine().trim();
		int count = 0;
		
		for(int i=0;i<n.length();i++){
			count++;
            
			switch(n.charAt(i)) {
			 case 'c':
			 	if(i<n.length()-1&&(n.charAt(i+1)=='='||n.charAt(i+1)=='-'))
					i++;
			 	break;
			 case 'd': 
				if(i<n.length()-1&&n.charAt(i+1)=='-') 
					i++;
				else if(i<n.length()-2&&n.charAt(i+1)=='z'&&n.charAt(i+2)=='=')
					i = i + 2;
				break;
			 case 'l':
			 case 'n':
				if(i<n.length()-1&&n.charAt(i+1)=='j') 
					i++;
				break;
			 case 's':
			 case 'z':
				 if(i<n.length()-1&&n.charAt(i+1)=='=') 
						i++;
				 break;
			}
		}
        
		bw.write(count+ "");
		bw.flush();
		br.close();
		bw.close();
        
	}
}
