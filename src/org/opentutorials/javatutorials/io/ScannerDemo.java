package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자가 입력한 값을 scanning함
		//java util안에 있는 package를 사용하겠다
		int i = sc.nextInt();
		//변수 i에 값을 할당하지 않고 대기상태
		System.out.println(i*1000);
		sc.close();	
	}
}
