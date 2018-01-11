package org.opentutorials.javatutorials.method;

public class MethodDemo6 {

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i;
			i ++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
		//메소드 값을 result에 담는다.
//		file(result);
//		main(result); 이런 형식도 가능하게 됨
	}
	
}