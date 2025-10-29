package webexp.a01_begin;

public class A04_Print {
	
	public static void main(String[] args) {
	// 한줄 주석.. sysout + ctrl + space 출력처리명령 자동생성
	//			ctrl + s 저장
	// ctrl + +, ctrl + - 화면 크기 조절..
	// ctrl + f11 실행(java application 선택)
	System.out.println("출력물 처리 연습");
	/*
	다중 행 주석 문..
	# 자바 프로그램의 출력: 시스템 택배로 말걸기
	1. 자바 프로그램이 우리 눈에 보이게 말을 거는 방법을 출력이라 한다.
	컴퓨터 화면(콘솔 창)에 글자나 숫자를 찍어내는 것.
	2. 가장 기본이 되는 명령어가 바로 System.out.println()이다.
		1) System : 우리 컴퓨터 시스템 전체를 말함.
		2) Out : 시스템에서 바깥으로 나가는 통로
		3) Println : 이 물건을 인쇄해서 다음 줄로 넘어감
	3. 기본형식
		1) System.out.println(); 제일 중요
			괄호() 안의 내용을 출력하고 줄을 바꿈
		2) System.out.print();
			괄호() 안의 내용을 출력하고 줄을 바꾸지 않음.(커서가 출력된 내요 바로 뒤에 깜박임)
		3) System.out.printf();
			포맷을 지정해서 출력
			%s : 문자열 ex) System.out.printf("이름은 %s입니다", "홍길동");
			%d : Decimal 10 진수 정수 ex) System.out.printf("나이는 %d살입니다.", "27");
			%f : Floating-point(실수) 소숫점 자리 처리  
			ex) System.out.printf("파이값은 %.2f", "3.141592"); 소숫점 2자리까지 표현
			%c : 문자 (character- 글자 한 자)
			%b : boolean(논리) true/false

	 */
	// 1. 출력과 줄바꿈 System.out.println();
	System.out.println("안녕하세요1!!"); // 명령이 끝나고, 다음라인에서 다시 명령 수행
	System.out.println("안녕하세요2!!");
	System.out.println("안녕하세요3!!");
	// ex) 홍길동, 25, 서울 위 내용을 줄바꿈으로 출력
	System.out.println("홍길동");
	System.out.println("25"); // 문자열
	System.out.println(25); // 숫자열
	System.out.println("서울");
	System.out.print("사과");
	System.out.print("바나나");
	System.out.println("딸기"); // 다음 명령어는 줄바꿈
	// ex) 안녕! 내 이름은 자바야! 
	//	   만나서 반가워. 너 이름은 뭐니?
	//	   단어별로 출력명어를 사용하여 출력. 연결과 줄바꿈명령어 적절하게 처리하여 출력
	// ctrl + alt + 화살표 아래
	System.out.print("안녕! ");
	System.out.print("내 ");
	System.out.print("이름은 ");
	System.out.println("자바야!");
	System.out.print("만나서 ");
	System.out.print("반가워. ");
	System.out.print("너 ");
	System.out.print("이름은 ");
	System.out.println("뭐니?");
	// printf의 핵심 속성(형식 지정자) printf의 속성은 %기호로 시작하여 형식 지정자(Format Specifier)를 의미한다.
	// 이 기호가 이 자리에 어떤 타입의 데이터를, 어떤 모양으로 넣을 것이다라고 알려주는 역할을 한다.
	// 주요 지정자 의미(데이터 타입) 설정 %s String(문자열) "안녕하세요" 같은 내용을 넣을 것을 설정
	
	//%s에는 홍길동, %d에는 27, %f는 175.5 실수를 차례대로 입력
	System.out.printf("이름 : %s, 나이 : %d세, 키: %.1fcm \n", "홍길동", 27,175.52);
	
	// ex) 사과, 3000, 200.75를 물건명, 가격, 중량으로 표현
	System.out.printf("물건명 : %s, 가격 : %d원, 중량 : %.2fg", "사과", 3000, 200.75);
	}
}

