package org.opentutorials.javatutorials.numberstring;

public class EqualStringDemo {
	public static void main(String[] args){
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b);
		//��ü��ü�� ��
		System.out.println(a.equals(b));
		//��ü�� ���� ���� ������ ��
	}
}
