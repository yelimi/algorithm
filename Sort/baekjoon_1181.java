import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   
		List<String> word = new ArrayList<>(); //입력용. 
		List<String> word_f = new ArrayList<>(); //최종결과.  
        
		for(int i=0;i<n;i++)
			word.add(sc.next());
        
		Collections.sort(word, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if(s1.length()>s2.length())
					return 1;
				else if(s1.length()==s2.length()) {
					return s1.compareTo(s2); // 사전순으로 정렬.
				}
				return -1;
			}
		});
        
		for(int i=0;i<word.size();i++){
			if(!word_f.contains(word.get(i))) // 중복제거.
				word_f.add(word.get(i));
		}
        
		for(int i=0;i<word_f.size();i++)
			System.out.println(word_f.get(i));
		
	}
}
