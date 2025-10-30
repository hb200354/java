package webexp.a02_variable;

public class A05_ChangeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 강제형변환
1. 큰컵 ==> 작은 컵
	손실을 감수하고 강제로 넣겠다고 명시해야지 컴파일 에러가 발생하지 않는다.
	(데이터유형)
 * */
		double pi = 3.14159;
//		int pi_int = pi; // 에러발생.. 
		int pi_int = (int) pi; // 강제형변환-유실이 일어나더라 상관없으니 형변환처리..
		System.out.println("정수형 pi값:"+pi_int); // 소숫점이하는 절삭에 되고 3만 남음...
		// 1단계  금액이 double값으로 amtPerson 8333.333 할당후,
		// 정수형(int) amtPersonInt casting 할당하여 출력..
		double amtPerson = 8333.333;
		int amtPersonInt = (int)amtPerson;
		System.out.println("정수형 데이터:"+amtPersonInt);
		// 2단계 위 내용을 피자가격과 3명이 나누었을 때, 처리를 형변환하여 처리..
		int pizzaPrice = 25000;
		int eatPerson = 3;
		// 자바에서는 정수형/정수형 ==> 정수형, 원하는 실수값을 가질려면 (double)정수형/정수형; 정수형/(double)정수형
		double amtPerson2 = (double)pizzaPrice/eatPerson; // 정수/정수 ==> 정수 ==> 실수
		System.out.println("promotion이 일어나고 "+amtPerson2);
		int amtPersonInt2 = (int)amtPerson2;
		System.out.println("정수형 결과 데이터:"+amtPersonInt2);
		
		
	}

}
