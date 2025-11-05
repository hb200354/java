package webexp.a02_variable;

public class A11_LogicalCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 연산자의 최종 보스 - 논리 연산자/삼항 연산자
		1. 이름은 어렵지만, 이 둘은 사실 결정을 내리는 아주 똑똑한 연산자들입니다.
		2. A랑 B 둘 다 진짜야? 또는 이거면 A, 아니면 B라고 묻는, 우리 일상의 고민과 똑같습니다.
		
		# 논리 연산자(&&, ||, !) 미션 컨트롤 센터
		1. 논리 연산자는 여러 개의 true(참) 또는 false(거짓) 값을 조합해서, 최종적으로
		단 하나의 true 또는 false를 결정하는 연산자입니다.
		마치 미션 컨트롤 센터에서 1번 조건 ok!! 2번 조건 ok!! 최종 발사 승인!이라고 외치는 것과
		같아요..
		 * */
		// 로그인 성공?(&&)
		boolean isIdCorrect = true; // 아이디가 맞았다.
		boolean isPasswordCorrect = true; // 비번도 맞았다.
		// 아이디 그리고 비번 둘 다 맞아야 로그인 성공!!
		boolean loginSuccess = isIdCorrect && isPasswordCorrect;
		System.out.println("로그인 성공:"+loginSuccess);
		// ex) isPurchaseOver : 연간구매액이 500만원 이상 경우
		//     isVisitOver : 연간방문횟수 20이상 인 경우
		//    canVipLoc : VIP라운지 방문가능.
		// boolean 변수를 이용해서 2가지 조건이 다 맞을 때, 처리.
		int buyPurchase = 6000000;
		int visitCount = 25;
		
		
		boolean isPurchaseOver = buyPurchase>=5000000; 
		// 비교연산식에 의해 결과값을 처리
		boolean isVisitOver = visitCount>=20;
		boolean canVipLoc = isPurchaseOver && isVisitOver;
		System.out.println("VIP 라운지 방문가능:"+canVipLoc);
		// ex) 국어점수가 80점이상이고, 영어점수가 80점이상이면  상금을 받기로 했다.
		//  변수 kor, eng,  passKor, passEng,   canReward 변수를 사용하여
		// 상금 여부를 and(&&) 논리연산식에 의해 처리하세요..
		int kor = 80;
		int eng = 85;
		boolean passKor = kor>=80;
		boolean passEng = eng>=80;
		boolean canReward = passKor && passEng;
		System.out.println("상금 여부:"+canReward);
		
		// 문자열 데이터 비교시 처리할 내용..
		String id = "himan";
		String pwd = "7778";
		boolean successLogin = id.equals("himan") && pwd.equals("7777");
		System.out.println("로그인 성공 여부:"+successLogin);
		
		// or(||)
		// 나이가 5미만이거나 65이상이면 무료입장처리..
		int age = 67;
		boolean freePass = age<5 || age>=65;
		System.out.println(age+", 무료입장 여부:"+freePass);
		
		// ex) 부서가 인사부이거나  실적이 5000000 이상인경우에 보너스를 받기로 되어있다.
		//      보너스수령여부를 출력하세요
		//   부서  dpart(String), 실적 earnMoney(int),  보너스수령여부 canRevComm(boolean)
		String dpart = "재무팀";
		int earnMoney = 5500000;
		// dpart == "인사부" (x) 자바에서는 원하는 결과를 얻을 수 없다..
		//                  자바스크립트/파이썬에서는 가능..		
		boolean canRevComm = dpart.equals("인사부") || earnMoney>=5000000;
		System.out.println("보서스 수령 여부:"+canRevComm);
		
		// ! (not) ==> 결과가 true ==> false, false ==> true
		int point = 70;
		boolean isNotPass = !( point>=70 ); // 합격(point>=70) 아닌 여부 ==> 불합격여부
		System.out.println(point+", 합격이 아닌 여부(불합격여부):"+isNotPass);
		// .ex) 나이(age)를 입력값으로 25로 설정하고, 성년인 경우를 설정하되, 성년이 아닌 경우를
		// isNotAdult변수를 설정하여 !(not)논리 연산자를 이용하여 출력하세요..
		int age1 = 25;
		boolean isAdult = age1>=18;  // 성년인 경우 true
		boolean isNotAdult = !( age1>=18 ); // 성년이 아닌 경우 true
		System.out.println("성년인지 여부:"+isAdult);
		System.out.println("성년이 아닌지 여부(미성년):"+isNotAdult);
		// ex) 국어점수가 85으로 할당하고, 합격이 70점이상인경우과 합격이 아닌 경우
		//   isNotPass1로 설정하여 출력하세요..
		int kor1 = 85;
		boolean isPass1 = kor1>=70;
		boolean isNotPass1 = !(kor1>=70);
		System.out.println(kor1+"! 합격여부(70이상):"+isPass1);
		System.out.println(kor1+"! 불합격여부(70미만):"+isNotPass1);
		
		
		
		
		
		
		
	
		
	}

}
