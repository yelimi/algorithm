import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] list = new int[n][2];
		int count = 0;
		int temp = -1;
        
		for(int i=0;i<n;i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
		}
        
		Arrays.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] arg1, int[] arg2) {
				// TODO Auto-generated method stub
				if(arg1[1]==arg2[1]) { // 끝나는 시간이 같으면.
					return Integer.compare(arg1[0], arg2[0]); // 시작 시간을 오름차순 정렬.
				}
				return Integer.compare(arg1[1], arg2[1]);
			}
		});
        
		for(int i=0;i<n;i++) {
			if(list[i][0]>=temp) {
				count++;
				temp = list[i][1];
			}
		}
        
		System.out.println(count);
		
	}	
}
