package cn.dkc_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class maxArea {
	public int max_Area(int[] arr) {
		int max = 0;
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0;i<arr.length - 1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
					l.add(arr[j]*(j-i));
				else
					l.add(arr[i]*(j-i));
			}
		}
		for(int i : l) {
			if(max<i)
				max = i;
		}
		return max;
	}
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10000];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = r.nextInt(100);
		}
		int max = new maxArea().max_Area(arr);
		System.out.println(max);
	}
}
