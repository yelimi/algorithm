import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Func> list= new ArrayList<>();
        
		for(int i=0;i<n;i++) {
			int age = sc.nextInt();
			String name = sc.next();
			list.add(new Func(age, name));
		}
        
		Collections.sort(list, new Comparator<Func>() {
			@Override
			public int compare(Func f1, Func f2) {
				// TODO Auto-generated method stub
				if(f1.getAge()>f2.getAge())
					return 1;
				else if(f1.getAge()==f2.getAge())
					return 0;
				
				return -1;
			}
		});
        
		for(Func f:list)
			System.out.println(f.getAge()+" "+f.getName());
		
	}
}

class Func {
	int age;
	String name;
	public Func(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
}
