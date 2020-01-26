import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		boolean yn = true;
		String[] word = new String[n];
        
		for(int i=0;i<n;i++) {
			yn = true;
			word[i] = sc.next();
            
			for(int j=0;j<word[i].length();j++) {
				for(int k=j+2;k<word[i].length();k++) {
					if(word[i].charAt(j)==word[i].charAt(k-1)) {
						
					}
					else {
						if(word[i].charAt(j)==word[i].charAt(k)) {
							yn = false;
							break;
						}
					}
				}
				if(yn==false)
					break;
			}
            
			if(yn==true)
				sum = sum + 1;
		}
        
		System.out.println(sum);
		
	}
}
