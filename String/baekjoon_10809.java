import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		for(char i ='a';i<='z';i++)
		{
			int idx = n.indexOf(i); //특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스 반환.
			System.out.println(idx); //찾지 못했을 경우 -1 반환. 
		}
		
	}
}
