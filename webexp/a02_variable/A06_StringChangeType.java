package webexp.a02_variable;

public class A06_StringChangeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 문자열(String)데이터와 형변환
1. 문자열(문자열) : VIP 손님
	int, double같은 기본 자료형은 기본 상자라면, String 특별 대우 받는 VIP손님입니다.
2. char(문자 한자만 할당) 진주알 'H' 'e' char[]
   String (문자열-문자배열을 새롭게 데이터 유형으로 만듦) "Hello", "안녕하세요", 여러 글자를 꿰어 놓은
   	진주 목걸이 입니다.
3. 특별한 손님은 대문자로 모신다..==> String은 객체이고, stack영역/heap영역 메모리를 다 활용한다.
   왜??  String은 단순한 상자(primitive)가 아니라, 여러 가지 특별한 능력(속성, 기능)을 잔뜩 들고 온
   	객체이기 때문이다.
4. 자바만 특징
   	1) 큰 따옴표로만 할당 가능 : 문자열의 시작과 끝을 알려주는 표시입니다. 
   		String name="홍길동";
   		String name='홍길동'; (x) - 주의) 자바만 이렇게 처리되지 않는다. javascript/python에서는 허용한다.
   	2) 데이터를 비교할 때(비교연산자)는 .equals()를 통해서 문자열을 비교해준다. 
   		문자열1==문자열2 경우에 동일한 경우라도 false나오는 경우가 발생한다.
   		문자열1.equals(문자열2) ==> 주의! 또 주의!!
   	3) 자바는 독립적인 함수 개념이 없고, 객체에 종속되는 함수개념인 메서드만 있다..	
   		
5. 숫자형과의 변환 처리..
	1) 문자열 "25"와 숫자 25는  엄연히 다른 데이터 유형이기에 형변환을 할려면 String 제공하는 기능 메서드(함수)나
		Integer(wrapper클래스-내장된 객체)지원하는 기능 메서드(함수)
		ps) 함수가 객체안에 들어가면 메서드라는 개념으로 사용된다.
	2) 문자열을 정수로 변환  Integer.parseInt("25") ==> 25
	   문자열을 실수로 변환  Double.parseDouble("3.14") ==> 3.14
	3) 숫자를 문자열 변환  String.valueOf(숫자) 
	   	ex) String str1 = String.valueOf(123); ==> "123"
	   	ex) String str2 = String.valueOf(3.14); ==> "3.14"
		==> 간편하게 처리
	   	ex) String str3 = ""+123; ==> "123"
	   	ex) String str4 = ""+3.14; ==> "3.14"	약간의 성능 저하가 있을 수 있지만, 대부분 전혀 문제되지 않음.   		
 * */
		String name = "홍길동";
		String label = "이름 : ";
		String introduction = label + name;  // 문자열 + 문자열  : 연결하는 역할..
		System.out.println(introduction);
		// ex) 좋아하는 물건 3개를 선언/할당하고, 모두 다 연결된 문자열을 변수에 할당하고 출력하세요
		// String favor1, favor2, favor3
		// String allFavor  
		String favor1 = "사과 ";
		String favor2 = "최신형 핸드폰 ";
		String favor3 = "고사양 컴퓨터 ";
		String allFavor = favor1 + favor2 +favor3;
		System.out.println(allFavor);
		// 자바에서는 ==  stack영역의 메모리를 비교, 객체의 경우 heap영역도 쓰기에 메모리 비교의 한계가 있다.
		// 1. 데이터베이스에 db에 저장된 비밀번호
		String savedPass= "myJava123";
		String inputPass = new String("myJava123"); // 입력하거나 DB에 호출할 때 이 형식으로 처리..
		System.out.println("==로 비교:"+(savedPass==inputPass));
		System.out.println(".equals()로 비교:" + (  savedPass.equals(inputPass) ) );
		
		
		
		
		
		
		
		
	}

}
