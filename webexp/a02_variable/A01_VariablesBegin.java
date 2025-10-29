package webexp.a02_variable;

public class A01_VariablesBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* 
	# 자바 변수와 타입 : 데이터를 담는 라벨 상자
	1. 자바에서 변수는 데이터를 저장할 수 있는 상자다.
		자바는 변수를 지정할 때 꼭 다음과 같은 라벨을 붙여야 한다.
		
		int age; 
		정수형 유형으로 이름을 age라고 라벨 붙인다.
		age = 30; 
		age 변수에 30이라는 정수 데이터를 넣는다.
	 */
		
	
		int age; // 변수 선언
		age = 30; // 변수 할당
		System.out.println("나이는 " + age); 
		
	// 물건 가격(price)로 정수형 변수를 선언하고, 데이터를 3000 할당 후, 물건 가격은 @@@원입니다. 라고 출력
		int price;
		price = 3000;
		System.out.println("물건 가격은 " + price + "원입니다.");
		System.out.printf("물건 가격은 %d원입니다. \n", price);

	/*
	# 변수의 선언/할당 미 사용
	1. 변수는 선언과 할당을 동시에 처리 할 수 있다.
		int cnt = 5;
	2. 변수의 사용은 다른 변수에 할당과 연산등 여러 형식으로 처리 할 수 있다.
		1) 출력
		System.out.println("갯수:"+cnt);
		2) 다른 변수에 대입
			int tot1 = cnt + 25
			int tot2 = cnt;
			int kor, eng, math;
			kor = 70; eng = 80; math = 90;
			int tot3 = kor + eng + math; // 새 변수에 재할당
	 */
		
		int cnt = 5;
		System.out.println("갯수:"+cnt);
		int tot2 = cnt; 
		int tot1 = cnt + 25;
		int kor, eng, math;
		kor = 70; eng = 80; math = 90;
		int tot3 = kor + eng + math;
		System.out.println("총합:"+tot3);
	}

}