package com.wuqingyu.test;

public class MemoeyTest {
	public static void main(String[] args) {
		String str1 = new StringBuilder("�����").append("����").toString();
		System.out.println(str1.intern()==str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern()==str2);
		System.out.println("��ð�Frist");
		System.out.println("你好�?");
	}

}
