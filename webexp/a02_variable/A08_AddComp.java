package webexp.a02_variable;

public class A08_AddComp {

	public static void main(String[] args) {
		/*
		# 복합 대입 연산자( +=, -=, *=, /=) :게으름뱅이 연산자
		1. 이건 연산(계산)과 대입(저장)을 한 번에 합쳐놓은, 아주 편리한 단축키 입니다.
			score = score + 10;   내 점수에 10을 더해서 다시 내 점수에 저장해!!
			이것을 쓰기 귀챦아서..
			score += 10;  (내 점수에 10 더해줘) 줄여서 쓴거입니다.
		2. 나 자신에게 오른쪽 값을 연산하고, 다시 나에게 저장해!!
			hp -= 20  내 hp에서 20을 빼서 다시 내 hp에 저장해!!
			money *=2  내 money에서 2를 곱해서, 다시 내 money에 저장해!!
		*/
		int exp = 100; // 현재 경험치 100
		int monsterExp = 30; //몬드터 경험치 30
		exp += monsterExp; // exp = exp + monsterExp; 와 동일
		System.out.println("현재 경험치:"+exp);
		// hp 감소 (-=)
		int hp = 200; // 현재 체력 200
		int damage = 45; // 데이지 45
		hp -= damage; // hp = hp - damage;  의 동일!!
		System.out.println("남은 체력:"+hp);  // 결과 155
		/*
		ex) 현재 나의 돈을 10000으로 설정  과자비용설정 1500, 용돈비용 설정 5000으로 하여
	    현재 용돈을 출력, 과자를 산후 출력, 용돈을 받은 후 출력하세요(복합대입연산자 활용)
		 * */
		int myMoney = 10000;
		int snack = 1500;
		int allowance = 5000;
		System.out.println("초기 나의 돈:"+myMoney);
		// myMoney = myMoney - snack
		//  8500   =  10000   - 1500
		myMoney-=snack;
		// 현재 나의 금액 10000에서 1500을 뺀 금액을 나의 금액으로 설정
		
		System.out.println("과자를 산 후 나의 돈:"+myMoney);
		myMoney+=allowance;
		// 주머니에 있는 현재금액에서 용돈을 추가(5000)하니 13500 처리되는 개념..
		System.out.println("용돈을 받은 후 최종 나의 돈:"+myMoney);
		
		// ex) 현재 곰돌이가 가진 빵(breadCnt)이 15개 있는데, 빵을 5개를 먹은 후(eatBread) 갯수와 다시
		//     친구가 빵을 10개(addBread) 더준 후 갯수를 변수를 설정해서 출력하세요..
		int breadCnt = 15;
		int eatBread = 5;
		int addBread = 10;
		System.out.println("곰돌이 가진 빵:"+breadCnt);
		System.out.println("빵을 5개 먹은 후 :"+(breadCnt-=eatBread));
		System.out.println("친구가 빵을 10개 더준 후 갯수:"+(breadCnt+=addBread));
		
		
		
	}
}
