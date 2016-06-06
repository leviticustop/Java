package com.heima.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("请输入一行字符串：");
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		
		for (char c : arr) {
			hs.add(c);
		}
		
		for (Character ch : hs) {
			System.out.print(ch);
		}
	}

}
