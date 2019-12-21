import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int half = 0;
		int count = 0;
		int[] num = new int[m];
		LinkedList<Integer> dque = new LinkedList<Integer>();
        
		for(int i=1;i<=n;i++) {
			dque.add(i);
		}
        
		for(int i=0;i<m;i++) {
			num[i] = sc.nextInt();
		}
        
		for(int i=0;i<m;i++) {
			if(dque.size()%2==0) //양방향이므로. 
				half = (dque.size()/2)-1;
			else
				half = dque.size()/2;
            
			int temp = 0;
            
			for(int j=0;j<dque.size();j++) {
				if(dque.get(j)==num[i]) {
					temp = j;
					break;
				}
			} //일치하는 값의 인덱스 구하기. 
            
			if(half-temp>=0) {
				for(int k=0;k<temp;k++) {
					int x = dque.pollFirst();
					dque.addLast(x);
					count++;
				}
				dque.poll();
			} //앞에서 계산. 
			else {
				for(int t=0;t<dque.size()-temp;t++) {
					int y = dque.pollLast();
					dque.addFirst(y);
					count++;
				}
				dque.poll();
			} //뒤에서 계산. 
		}
        
		System.out.println(count);
		
	}
}
