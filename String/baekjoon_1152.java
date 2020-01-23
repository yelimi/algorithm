import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine().trim(); //trim() 앞뒤 공백 제거. 
        
		if(n.isEmpty())
			System.out.println("0");
		else
			System.out.println(n.split(" ").length);
	
	}
}
