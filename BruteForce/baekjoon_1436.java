import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
        
		while(n>0) {
			num++;
			String str = Integer.toString(num);
			if(str.contains("666"))
				n--;
			
		}
		System.out.println(num);
  
	}
}
