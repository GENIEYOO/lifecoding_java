package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {
	
	public static void main(String[] args) {
		
		String[] members = {"최진혁","최유빈", "한아람"};
		for (int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
	}

}

//1반 학생들을 번호순으로 정렬해서 줄을 세운다.
//상담 받은 학생들의 숫자를 기록한다.
//대기 중인 학생과 상담을 한다.
//상담받은 학생의 수를 1증가시킨다.
//총원보다 상담받은 학생의 수가 작다면 3번 절차로 돌아간다.
//총원과 상담받은 학생의 수가 같다면 상담을 종료하고 업무를 계속한다.