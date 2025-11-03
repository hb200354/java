package webexp.a02_variable;

public class A09_Calculator {

	public static void main(String[] args) {
		/*
		# 산술연산자
		1. 초등학교 때 배운 더하기, 빼기, 곱하기, 나누기와 동일합니다.
			자바 레스토랑의 셰프가 되었다고 생각하고 알아봅시다.
		2. 산술연산자는 숫자 계산을 위한 셰프의 기본 도구 세트입니다.
			1) + (덧셈) / - (뺄셈) : 재료 추가 & 덜기..
				가장 기본 도구로 재료(숫자)를 더합니다.
				재료(숫자)를 덜어 냅니다.
		*/
		int flourA = 100; // A밀가루 100g
		int flourB = 50;  // B밀가루 50g
		int totFlour = flourA + flourB;
		System.out.println("총 밀가루:"+ flourA + flourB); 
		// 앞에 총 밀가루 문자열의 영향을 받아서  100 ==> "100", 50 ==> "50"   "100"+"50" ==> "10050"
		// 앞에 총 밀가루 문자열의 영향을 받아서  100 ==> "100", 50 ==> "50"   "100"-"50" ==> 에러발생
		System.out.println("총 밀가루:"+(flourA + flourB));
		// 숫자를 연산을 바로 해야할 때는 () : 소괄호 최 우선순위 연산로 먼저 계산 후, +로 연결..
		System.out.println("총 밀가루:"+totFlour); 
		// 따로 변수를 사용하여 출력..
		int sugar = 200; // 설탕 200g
		int usedSugar = 30; // 사용할 설탕 30g
		int remainingSugar = sugar - usedSugar; // 남은 설탕
		System.out.println("남은 설탕:"+remainingSugar);
		/*
		ex) 오늘 자바 레스토랑에 점심에 45명의 손님이, 저녁에는 72명의 손님이 방문했습니다. 오늘 방문한
		총 손님과 저녁 손님이 점심 손님보다 몇 명 더 많았는지 계산하여 각각 출력하세요..
		 * */
		int lunchQuests = 45;
		int dinnerQuests = 72;
		int totQuests = lunchQuests + dinnerQuests;
		int diffQuest = dinnerQuests - lunchQuests;
		System.out.println("오늘 총 손님:"+totQuests);
		System.out.println("저녁 손님이 "+diffQuest + "명 점심 손님보다 더 많았습니다.");
		/*
			2) * (곱셈)
				곱하기/애스터리스크 : 여러번 작업을 할 대 씁니다. 키보드 숫자패드에 있는 곱하기 버튼이죠.
				3인분 같은 거 4개!!
				- Multiply(곱하기), Times(배)
				 키보드 오른쪽 숫자패드 * 또는 shift + 8의 반짝이는 곱하기!!
		 * */
		// 쿠키 포장
		int cookiePerBox = 12; // 한 상자당 쿠키 12개
		int boxes = 5; // 5 상자
		int totalCookies = cookiePerBox*boxes; // 총 쿠키 수
		System.out.println("총 쿠키 수:"+totalCookies);
		// ex) 시급(hourlyWage)이 9860이고, 8시간(hoursWorked) 근무 했을 때, 일당(daySalary)은?
		int hourlyWage = 9860;
		int hoursWorked = 8;
		int daySalary = hourlyWage*hoursWorked;
		System.out.println("일당:"+daySalary);
		/*
			3) / (나눗셈) 정확인 나눠주세요
				나누기/슬래시 : 피자를 나누는 칼입니다. 정확히 나눠줄 때 씁니다.
				Divide(나누기), 정수 나눗셈(Integer Division)
				정수 셰프의 법칙 : 자바의 int(정수) 셰프는 소수점을 싫어해요!!
				- int /int (정수/정수)
					int 셰프끼리 나누면, 결과에서 소수점(부스러기)를 그냥 버립니다.(반올림 아님!!)
					10/3 ==> 3.3333 이 아니라 3이 됩니다(0.333... 버림!!)
				- double/int(실수/정수) 또는 int/double(정수/실수)
				  	셰프 중 한 명이라도 double(실수)를 다룰 줄 아면, 소수점을 살려줍니다.
				  	10.0/3 ==> 3.3333 (정확한 결과)
		 * */
		// 정수 나눗셈(함정 예제!!)
		int pizzaSlices = 10; // 피자 10조각
		int people = 3; //3명
		int slicesPerPerson = pizzaSlices/people;  // int/int
		System.out.println("1인당 (정수):"+slicesPerPerson); // 결과: 3
		// 실수 나눗셈(정확한 예제)
		double pizzaSlicesDouble = 10.0;
		//int people = 3;
		double accurateSlices = pizzaSlicesDouble/people; // double/int
		System.out.println("1인당 정확히:"+accurateSlices);
		// ex) 4명의 친구가 식당에 가서 총 55000원이 나왔습니다.
		// 1인당 얼마를 내야하는지   정수(int)로 계산 출력, 실수(double) 정확하게 계산을 출력..
		int totalPrice = 55000;
		int people2 = 4;
		// 정수로 처리.
		int perPesonInt = totalPrice/people2;
		System.out.println("1인당 금액(정수):"+perPesonInt);
		double perPersonDouble = (double)totalPrice/people2;
		System.out.println("1인당 금액(실수):"+perPersonDouble);
		/*
			4) % (모듈로/나머지) : 그래서 남은 게 몇 개?
				나눗셈을 하고 난 뒤, 남은 찌꺼기만 가져오는 도구입니다.
				Modulo, Remainder(나머지)
				10%3 ==> 10조각 피자를 3명에 공평하게 나눠주면 (각 3조각), 몇 조각이 남지? ==> 1조각
				7%2 ==> (홀짝) 7개를 2개씩 짝지으면, 몇개가 남지?  답 1 (홀수!)
				6%2 ==> (홀짝) 6개를 2개씩 짝지으면, 몇개가 남지?  답 0 (짝수!!)
		 * */
		// 슈퍼마리오 게임 시간 500초 남았습니다.
		// 이를 몇 분과 몇로 변환해서 각 각 출력하세요..(힌트 1분 60초) /, %를 모두 사용해야 합니다.
		int totalSeconds = 500;
		int secondsPerMinutes = 60; //1분 60초..
		// 1. 분 계산(500을 60으로 나눈 몫)
		//    500/60 = 8(int 셰프는 소수점을 버린다!!)
		int minutes = totalSeconds/ secondsPerMinutes;
		// 2. 초 계산(500을 60으로 나눈 나머지)
		//    500%60 = 20(8분(480초)을 빼고 남은 20초)
		int seconds = totalSeconds%secondsPerMinutes;
		System.out.println("총 500초는 ");
		System.out.print(minutes+"분 ");
		System.out.println(seconds+"초");
		// ex) 양계장에서 오늘 달걀을 총 115개를 수확했습니다. 한판에 달걀을 30개씩 담을 수 있습니다.
		//     달걀은 몇 판이 나오고 남은 달걀은 몇개인가요??
		int totalEggs = 115;
		int eggsPersCarton = 30;
		int fullCartons = totalEggs/eggsPersCarton;
		int remainEggs = totalEggs%eggsPersCarton;
		System.out.println("꽉 재운 판의 갯수:"+fullCartons);
		System.out.println("남은 달걀:"+remainEggs);
		
		
		
		
		
		
		
		
		
		
		

	}

}
