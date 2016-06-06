package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("请输入：");
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i2.compareTo(i1);
				return num == 0? 1 : num;
			}
		});
		
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line))
				break;
			try {
				int num = Integer.parseInt(line);
				ts.add(num);
			} catch (Exception e) {
				System.out.println("您输入的数据有误，请重新输入一个整数。");
			}
		}
		
		for (Integer i : ts) {
			System.out.println(i);
		}
	}

}
