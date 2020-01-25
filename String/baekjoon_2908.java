import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
        
		String[] str = new String[2];
		str = n.trim().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		int x = (a%10)*100 + ((a/10)%10)*10 + (a/100);
		int y = (b%10)*100 + ((b/10)%10)*10 + (b/100);
		
		if(x>y)
			System.out.println(x);
		else
			System.out.println(y);
        
	}
}
