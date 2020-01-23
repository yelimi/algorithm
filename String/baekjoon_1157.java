import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine().toUpperCase();
		int[] count = new int[26];
		int max = 0;
		char result = 0;
		
		for(int i=0;i<n.length();i++) {
			count[n.charAt(i)-65]++;
			if(max<count[n.charAt(i)-65]) {
				result = n.charAt(i);
				max = count[n.charAt(i)-65];
			}
			else if(max==count[n.charAt(i)-65])
				result = '?';
		}
        
		System.out.println(result);
        
	}
}
