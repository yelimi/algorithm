import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] burger = new int[3];
		int[] beverage = new int[2];
		
		for(int i=0;i<burger.length;i++) 
			burger[i] = Integer.parseInt(br.readLine());
		
		for(int i=0;i<beverage.length;i++)
			beverage[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(burger);
		Arrays.sort(beverage);
		
		System.out.print(burger[0] + beverage[0] - 50);
	
	}
}



(if문으로 풀이)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] burger = new int[3];
		int[] beverage = new int[2];
		int price = 2100;
		int sum = 0;
		
		for(int i=0;i<burger.length;i++) 
			burger[i] = Integer.parseInt(br.readLine());
		
		for(int j=0;j<beverage.length;j++)
			beverage[j] = Integer.parseInt(br.readLine());
		
		for(int i=0;i<burger.length;i++) {
			for(int j=0;j<beverage.length;j++) {
				sum = burger[i] + beverage[j] - 50;
				
				if(sum < price)
					price = sum;
			}
		}
		
		System.out.print(price);
	
	}
}


