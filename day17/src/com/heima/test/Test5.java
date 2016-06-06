package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("请输入一行字符串：");
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		TreeSet<Character> hs = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1 - c2;
				return num == 0? 1 : num;
			}
		});
		
		for (char c : arr) {
			hs.add(c);
		}
		
		for (Character ch : hs) {
			System.out.print(ch);
		}
	}

}
