import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Fun(num));
		
	}
    
	static int Fun(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return Fun(n-1)+Fun(n-2);
	}
    
}
