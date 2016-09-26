package com.searattled.exercises;

public class ReverseString {
	public static String reverseString(String s){
		if (s == null){
			return null;
		}
		StringBuilder sb = new StringBuilder(s);
		int front = 0;
		int back = sb.length() - 1;
		
		while(front < back){
			char c = sb.charAt(front);
			sb.setCharAt(front, sb.charAt(back));
			sb.setCharAt(back, c);
			front++;
			back--;
		}
		
		return sb.toString();
	}
}
