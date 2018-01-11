package org.opentutorials.javatutorials.numberstring;

public class EqualStringDemo {
	public static void main(String[] args){
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b);
		//객체자체를 비교
		System.out.println(a.equals(b));
		//객체들 간의 값이 같은지 비교
	}
}
