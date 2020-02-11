//string reverse recursion by using substring method of string
//substring will remove single character in each loop from the string

package com.shil;

public class StringReverseRecursion {

	public static String findStringReverseRecursion(String str) {
		
		if((str==null) || (str.length()<=1)){
			return str;
			
			
		}
		
		return findStringReverseRecursion(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.print(findStringReverseRecursion("MyJAVA"));
	

	}

}
