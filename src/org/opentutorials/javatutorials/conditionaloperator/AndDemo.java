package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {
	public static void main(String[] args){
		if(true && true) {
			System.out.println(1);
		 //두 항이 모두 참일 때 참이된다.
		}
		
		if(true && false) {
			System.out.println(2);
		}
		
		if(false && true) {
			System.out.println(3);
		}
		
		if(false && false){
			System.out.println(4);
		}
	}
	

}
