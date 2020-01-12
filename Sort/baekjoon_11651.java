import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		int y;
		List<Func> list = new ArrayList<Func>(); //객체비교.
        
		for(int i=0;i<n;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			list.add(new Func(x,y));
		}
        
		Collections.sort(list, new Comparator<Func>() { //기본 정렬 기준과 다르게 정렬. 
			@Override
			public int compare(Func m1, Func m2) {
				// TODO Auto-generated method stub
				if(m1.getY() > m2.getY())
					return 1; //오름차순.
				else if(m1.getY() == m2.getY()) {
					if(m1.getX() > m2.getX())
						return 1; //오름차순.
				}
				return -1;
			}
		});
        
		for(Func f:list)
			System.out.println(f.getX()+" "+f.getY());
		
	}
}

class Func {
	int x;
	int y;
	public Func(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
}
