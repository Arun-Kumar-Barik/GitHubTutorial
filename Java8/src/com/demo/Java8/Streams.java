package com.demo.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(21);
		arr.add(32);
		arr.add(43);
		
		List<Integer> arr1=arr.stream().filter(a -> (a%2==0)).collect(Collectors.toList());
		List<Integer> arr2=arr.stream().map(a -> (a%2)).collect(Collectors.toList());
		System.out.print(arr);
		
	}

}
