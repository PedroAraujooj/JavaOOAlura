package util;

import java.util.ArrayList;

public class TesWrappertInt {
	
	public static void main(String[] args) {
		
		Integer num = Integer.valueOf(29);//autoboxing
		
		int outro = num.intValue(); // unboxing
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		list.add(num);
		list.add(35);//autoboxing
		
		String strano3 ="75";
		int ano3 = Integer.parseInt(strano3);
		list.add(ano3);
		
		int ano2 = Integer.parseInt("69");
		list.add(ano2);
		
		for(int nums : list) {
			System.out.println(nums);
		}
		
		
		
		
		
		
	}

}
