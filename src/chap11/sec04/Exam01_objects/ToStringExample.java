package chap11.sec04.Exam01_objects;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(str1.toString());
//		System.out.println(str2.toString());// nullpointException
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
	}
}
