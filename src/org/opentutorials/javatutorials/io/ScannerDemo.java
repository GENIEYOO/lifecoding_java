package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����ڰ� �Է��� ���� scanning��
		//java util�ȿ� �ִ� package�� ����ϰڴ�
		int i = sc.nextInt();
		//���� i�� ���� �Ҵ����� �ʰ� ������
		System.out.println(i*1000);
		sc.close();	
	}
}
