import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
        
		int time = 0;
		
		for(int i=0;i<n.length();i++) {
			char ch = n.charAt(i);
			if(ch>='A'&&ch<='C')
				time = time + 3;
			else if(ch>='D'&&ch<='F')
				time = time + 4;
			else if(ch>='G'&&ch<='I')
				time = time + 5;
			else if(ch>='J'&&ch<='L')
				time = time + 6;
			else if(ch>='M'&&ch<='O')
				time = time + 7;
			else if(ch>='P'&&ch<='S')
				time = time + 8;
			else if(ch>='T'&&ch<='V')
				time = time + 9;
			else if(ch>='W'&&ch<='Z')
				time = time + 10;
		}
		System.out.println(time);
        
	}
}
