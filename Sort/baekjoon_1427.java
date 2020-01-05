import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int len = (int)(Math.log10(num)+1); //숫자길이.
		Integer[] list = new Integer[len]; //내림차순 해줄 경우 Integer로.
		int i = 0;
        
		while(num!=0) {
			list[i] = num%10;
			num = num/10;
			i++;
		}
        
		Arrays.sort(list,Collections.reverseOrder()); //내림차순이므로 Collections.reverseOrder().
        
		for(int j=0;j<len;j++) {
			System.out.print(list[j]);
		}
		
	}
}
