package webexp.a02_variable;

public class A04_ChangeType {

	public static void main(String[] args) {
		/*
# 자바 형변환(Type Casting)
1. 컵 크기 바꾸기
	형변환은 데이터의 타입을 바꾸는 작업입니다. 데이터는 물, 변수는 컵이라고 비유해 봅시다.
2. 자동 형변환(업캐스팅) : 작은 컵 ==> 큰 컵으로 물을 옮기기
	- 작은 컵(int)에 담긴 물을 큰 컵(double)으로 옮기는 것과 갑습니다. 물이 넘칠(데이터가 손실될) 걱정이 없죠?
		그래서 자바가 작동으로 해줍니다. 승진(promotion)이라고 부르기도 합니다.
		묵시적 형변환/자동형변환/promotion/upcasting
		
	casting : 틀에 맞추는 것!!	
3. 강제 형변환(다운캐스팅) : 큰 컵 ==> 작은 컵으로 물을 옮기기
	- 큰 컵(double)에 담긴 물을 작은 컵(int)으로 억지로 붓는 거예요. 물이 넘칠 수(데이터가 손실될 수)있습니다.
		(예 3.14를 int에 넣으면 0.14가 사라지고 3만 남죠)
	    명시적  형변환/강제형변환/casting/Downcasting/ ==> 데이터 손실(data loss)
4. 작은 컵은 자동으로, 큰 컵은 강제로
   작은 타입 ==> 큰 타입 (자동/안전)
   큰 타입 ==> 작은 타입 (강제/위험/ ==> (타입) 명시
   
   크기 순서  byte < short < int < long < float < double
		 */
		// 자동형변환(작은 컵 ==> 큰 컵)
		// int(4바이트)보다 double(8바이트)이 더 큽니다.
		int score = 100;
		System.out.println("정수형 score:"+score);
		double scoreDouble = score; // int가  double로 자동 변환 (100 ==> 100.0)
		System.out.println("실수형 score:"+scoreDouble);
		// 1단계 정수 ==> 실수형
		int playerLevel = 50;
		double totalScore = playerLevel;
		System.out.println("전체 score :"+totalScore);
		
		// 2단계 정수 =(연산)=> 실수형
		double totalScore1 = playerLevel*2.2;
		// duplicate local variables totalScore : 
		// 지역변수 totalScore가 중복되었다(playerLevel) ==> 위에 동일한 변수가 선언되었다는말 
		// ==> 변수명을 변경처리. ==> totalScore1 ==> ctrl + s(저장) : 재컴파일
		System.out.println("최종 점수:"+totalScore1);
		
		// ex) 자동차의 속력(speedKmh) 80을 정수(int)로 설정해서, 주행 시간(drivingHours)을 1.5로
		// double에 할당 후, 총 주행거리를 totalDistance(double)로 설정해서 출력하세요
		
		int speedKmh = 80;
		double drivingHours = 1.5;
		double totalDistance = speedKmh * drivingHours;
		System.out.println("총 주행거리:"+totalDistance);
	}
}
