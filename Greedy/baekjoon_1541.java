import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		String[] str1 = str.split("\\-");
        
		for(int i=0;i<str1.length;i++) {
			String[] str2 = str1[i].split("\\+");
			int temp = 0;
			for(int j=0;j<str2.length;j++) {
				temp = temp + Integer.parseInt(str2[j]);
			}
			sum = sum - temp;
			
			if(i==0) {
				sum = sum * (-1);
			}
		}
        
		System.out.print(sum);
		
	}	
}
