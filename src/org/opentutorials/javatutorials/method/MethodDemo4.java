package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	public static void numbering(int init, int limit) {
		//가변 값을 늘려주기 위해서
		int i = init;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(3, 5);
	}
}
