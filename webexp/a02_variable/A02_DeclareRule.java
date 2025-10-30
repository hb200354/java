package webexp.a02_variable;

public class A02_DeclareRule {
	// 변수
	int age;
	String myName;
	
	// 메서드
	void callName() {
		
	}
	
		public static void main(String[] args) {
			//TODO Auto-generated method stub
/*
 # 자바의 기본 예절 : 명명 규칙(Naming Conventions)
 1. 코드의 주소록
 	자바의 명명 규칙은 프로그래밍 세계의 예절이자 주소록이다.
 	'a'나 temp1 같은 이름 대신, 다른 개발자가 이건 어떤 데이터를 저장했는지 바로 알 수 있게 이름을 짓는 규칙이다.
 	
 	컴파일 에러가 나진 않지만, 지키지 않으면 프로그래밍 예절이 없는 사람으로 보일 수 있다.
 
 2. 핵심 키워드 (자바 네이밍 파티)
 	1) 클래스(class) : UpperCase(첫 자만), 중간중간 복합어일 때 구분하여 대문자 처리 : 파스칼케이스(PascalCase)
 		모든 단어의 첫 글자를 대문자로 쓴다.
 		ex) MySuperClass
 	2) 변수 & 메서드(method) : lowerCamelCase(소문자 카멜)
 		첫 단어 소문자, 다음 단어부터 첫 글자를 대문자로 한다. (등이 굽은 낙타 모양) : 캐멀케이스(CamelCase)
 		ex) 변수 : studentName, carSpeed, myAge
 			메서드 : calculateScore(), printReport(), getStudentName()
 	3) 상수(Constant) : SCREAMING_SNAKE_CASE (고함치는 뱀)
 		모든 글자를 대문자로 쓰고, 단어 사이는 언더바(_)로 연결한다.
 		ex) MAX_STUDENT_COUNT, PI, DEFAULT_PASSWORD
 	# 필수 기본 규칙 : 안 지키면 에러 발생(컴파일 에러)
 	1. 대소문자 구분 : apple, Apple은 서로 다른 이름입니다.
 		int apple;
 		int Apple; 다른 변수로 인식
 		int apple; 동일한 변수는 선언 불가 
 	2. 시작 : 숫자로 시작할 수 없다. ( num1 (o), 1num(x) )
 	3. 특수문자 : _, $만 허용, 나머지는 허용되지 않는다.
 	4. 예약어 : 자바가 이미 명령어나 내장된 코드로 지정된 것은 변수로 사용할 수 없다.
 		int, public, class, if, for 예약어로 변수명으로 사용 불가
 		코드 중에 예약어는 eclipse에서 굵게 표시된다.
 		
 	ex) 연습예시
 	학생 클래스를 선언하고, 그 안에 변수로 학생의 이름, 학생의 나이
 	메서드 void(리턴값이 없음) 출력선언하는 클래스
 */
	int no = 1; //일반 변수 선언
	no = 5; // 다른 데이터 할당
	
	final int CONST_CNT = 5; // 상수 선언
//  CONST_CNT = 7; // 다른 데이터 할당 불가
		}
}
// 클래스명으로 대문자로 시작해서 구분자를 대문자로 추가 선언
class ProgStudent {
	String studentName; // 문자열 변수로 소문자 시작
	final double PI = 3.14; // 상수 선언, 전부 대문자
	void setName() { // 메서드로 소문자 시작
		
	}
}
// 클래스명 : 자동차클래스(우리의차),
// 변수명 : 모델명(String), 현재속도(int),
// 상수 : 최대 속도(final int)
// 메서드 : void를 붙여서 속도증가(), 브레이크밟기()
class OurCar{
	String modelName;
	int currentSpeed;
	final int MAX_SPEED = 250;
	void speedUp() {
		
	}
	void hitTheBrake() {
		
	}
}
