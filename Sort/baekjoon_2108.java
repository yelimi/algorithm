import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> num = new ArrayList<Integer>();
		int[] list = new int[8001]; //음의 정수 때문에 2배.
		int sum = 0;
		int mid = n/2;
		int max = 0;
		int result = 0;
		int count = 0;
		int cc = 0;
        
		for(int i=0;i<n;i++) {
			num.add(sc.nextInt());
			sum = sum + num.get(i);
		}
		
		Collections.sort(num);
		
		for(int i=0;i<n;i++) {
			int x = num.get(i)+4000; //음의 정수로 인해 4000을 기준으로 더함.
			list[x]++;
			if(max<list[x])
				max = list[x];
		}
        
		for(int i=0;i<=8000;i++) {
			if(max==list[i]) {
				count++;
				cc = i;
			}
			if(count==2)
				break;
		}
        
		if(count==1)
			result = cc-4000;
		if(count==2)
			result = cc-4000;
		
		System.out.println((int)Math.round((double)sum/n));
		System.out.println(num.get(mid));
		System.out.println(result);
		System.out.println(num.get(n-1)-num.get(0));
		
	}
}
