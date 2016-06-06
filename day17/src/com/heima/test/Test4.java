package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffff");
		list.add("heima");
		list.add("itcast");
		list.add("bbb");
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
	
//		定义方法对其排序保留重复
		sort(list);
//		打印list		
		System.out.println(list);

	}
	
//	定义方法，排序并保留重复。
//	分析：
//	1,创建TreeSet集合对象，因为String本身就具备比较功能，但是重复不会保留，所以我们用比较器。
//	2,将list集合中所有的元素添加到TreeSet集合中，对其排序，保留重复
//	3,清空list集合
//	4,将TreeSet集合中排好序的元素添加到list中
	
	public static void sort(ArrayList<String> list) {
//		1,创建TreeSet集合对象，因为String本身就具备比较功能，但是重复不会保留，所以我们用比较器。		
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int num  = s1.compareTo(s2);
				return num == 0 ? 1 : num;
			}
		});
//		2,将list集合中所有的元素添加到TreeSet集合中，对其排序，保留重复
		ts.addAll(list);
//		3,清空list集合
		list.clear();
//		4,将TreeSet集合中排好序的元素添加到list中
		list.addAll(ts);
		
	}

}
