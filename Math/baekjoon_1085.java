import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min_a = y;
		int min_b = x;
        
		if(y>(h-y))
			min_a = h - y;
		if(x>(w-x))
			min_b = w - x;
		if(min_a>=min_b)
			System.out.println(min_b);
		else
			System.out.println(min_a);
		
	}
}
