package webexp.a02_variable;

public class A03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 자바의 기본 데이터 유형(Primitive Types)
1. 미리 정해진 레고 상자
	컴퓨터가 데이터를 저장하려면 상자가 필요합니다. 자바의 기본 데이터 유형은 자바가 미리 만들어 둔,
	사이즈와 용도가 딱 정해진 8가지 종류의 레고 상자라고 생각하면 됩니다.
	- 어떤 상자는 숫자 1, 2, 3만 담을 수 있고 (int)
	- 어떤 상자는 "예", "아니오"만 담을 수 있습니다.(boolean)
	- 어떤 상자는 'A', '가' 같을 글자 딱 하나만 담을 수 있죠(char)
	
	이 상자들은 값 자체를 상자 안(stack영역)에 직접 보관합니다. (이게 나중에 배울 참조 유형과 가장 큰 차이점입니다.)
2. 8개의 기본 유형들
	1) 논리형(참/거짓)
		boolean(불리언)
			핵심 : 오직 true(참) 또는 false(거짓) 둘 중 하나만 저장
			스위치(on/off)라고 생각하세요..
		 * */
		boolean isTrue = true;
		boolean bool02 = false;
		System.out.println("담긴 데이터 호출:"+isTrue);
		// ex) boolean 유형으로 isFemale(숙녀인지여부)  isAdult(성인지여부)를 선언할당하고 호출해보세요.
		boolean isFemale = false;
		System.out.println("숙녀인지 여부:"+isFemale);
		boolean isAdult = true;
		System.out.println("성인여부:"+isAdult);
/*
	2) 문자형(글자1개)
		char(캐릭터)
			작은 따옴표(' ')로 감싼 단 하나의 글자만 저장 ex) 'A', '가', '1'
			'A', 'B', 'C', 캐릭터(character) 한 명!!
		ex) grade로 학생의 성적의 등급(A~F)을 할당하여, 출력
*/		
		char c01 = 'A';
		char c02 = '가';
		System.out.println("첫번째 문자:"+c01);
		System.out.println("두번째 문자:"+c02);
		
		char grade = 'B';
		System.out.println("학생의 성적등급:"+grade);
		char gender = 'F';
		System.out.println("성별 구분:"+gender);
		// 문서 상태코드  N(new), E(Edit), C(Complete)
		char docStatus = 'E';
		System.out.println("현재 문서 상태 코드 :"+docStatus);
/*
	3) 정수형(소숫점 없는 숫자)
		byte (1바이트)  - small
		short (2바이트)  - medium
		int (4바이트) - 기본 정수 타입(***) 0 large
			연산을 처리하면 int형 이상이어야 할당이 된다.
		long (8바이트)  - x-large
			엄청 큰 숫자를 다룰 때, 숫자 뒤에 L를 붙여야 함. 예를 10000000000L
		int가 정수형의 기본(default) 입니다. 웬만한 숫자는 int를 씁니다.
		
 * */		
		byte b01 = 30;
		byte b02 = 40;
//		byte b03 = b01 + b02;
		int i03 = b01 + b02;  // +, -, * 등 연산결과는 반드시 int형이어야 한다.
		int age = 25;
		
		int num01 = 1500000000;
		int num02 = 1500000000;
		long num03 = 15000000000L; // int형 범위를 벗어남.. 마지막에 l/L 붙여야 함..
		int num04 = num01 + num02; // 정상적인 결과를 받을 수 없음..
		long num05 = (long)(num01) + num02; // long형으로 변환해야 최종 결과를 받을 수 있음.
		System.out.println(num04);
		System.out.println(num05);
		// ex) byte 전날재고량 80개, byte 오늘 입고 70, 총량을 byte/int로 처리하여 출력
		byte b1 = 80;
		byte b2 = 70;
//		byte tot1 = b1 + b2;  에러발생.. 연산시 int형 필요
		int tot2 = b1 + b2;
		System.out.println("총합 :"+ tot2);
		// ex) A고객의 예금 원금 20억(int amount)있고, B고객의 예금 원금 18억(int amount2)
		//     두 고객의 원급 합계를 int/long 설정하여 결과를 확인하세요..
		int amount1 = 2000000000;
		int amount2 = 1800000000;
		int tot3 = amount1+amount2;
		long tot4 = (long)amount1+amount2;
		System.out.println("정수형(int)으로 합산:"+tot3);
		System.out.println("정수형(long)으로 합산:"+tot4);
/*
	4) 실수형(소수점 있는 숫자)
		float (4바이트) : 가볍게 쓸 때 (숫자 뒤에 f를 붙여야 함) 3.14f
		double (8바이트) *** default 정밀하게 쓸 때 (이걸 주로 씀)
		double이 실수형의 default입니다. float보다 2배 더 정밀해서 double입니다.
		
		메모리 효율성과 정밀도 사이의 줄다리기(trade-off)로 위 둘중에 하나의 메모리를 사용합니다
		double : 초고화질 원본 사진(용량은 크지만 매우 선명함)
		float : 웹사이트용 압축한 사진(용량을 절반이지만, 자세히 보면 화질이 약간 깨짐)
		==> 메모리를 아끼기 위해 변환과 선택이 필요함..	
		현재는 메모리가 매우 저렴해져서, 안전하게 그냥 정밀한 거 쓰는 풍조 자바에서 실수의 기본값이
		됨. 웹만한 계산은 double로 처리해도 성능이나 메모리에 아무런 문제가 없음.
		하지만, 필요로 하는 곳에서는 f를 붙여서 float라는 것을 명시해서 사용하는 분야가 있음.
		1. 모바일 및 임베디드 기기/IOT - 여전에 PC보다 메모리 자원이 극히 제한적이기에 float를 사용
		2. 3d그래픽 및 게임 개발
		 	3d게임 화면을 그리려면 수백만개의 점이 x,y,z좌표를 동시에 계산. 좌표값을 굳이 double
		 	정밀도로 저장할 필요가 없음..(화면 0.0000001차이를 구분할 수 없음)
		 	이 때 모든 좌표를 float를 쓰면 double로 쓸 때보다 필요한 메모리가 절반으로 됩니다.
		==> 물을 마시는데 double은 2L짜리 거대한 생수통이고, float는 500ml 작은 생수통입니다.
		평소에 집에서 물 마실 때는 넉넉하게 2l 생수통(double)를 쓰는게 편하죠. 이게 자바의 기본유형으로
		선언된 이유, 하지만 가볍게 등산가거나 뛸 때는 굳이 무거운 2l짜리 들고 갈 필요 없죠? 딱 마실 만큼만
		500ml(float)를 챙겨서 다니는 것으로 이해하면 편하다.
		 	
		 	
		 	
			
 * */		
		float f01 = 4.25f; /// 기본 유형이 아니기에 f를 붙임..
		double d01 = 5.257;
		System.out.println("실수 float형:"+f01);
		System.out.println("실수 double형:"+d01);
		
		
		
		
		
	}

}
