package webexp.a02_variable;

public class A12_TripleCalcu {

	public static void main(String[] args) {
		/*
		# 삼항연산자(?:) : 한 줄짜리 갈림길
		1. 이름이 삼항(3개의 항)인 이유는, (1)조건 ? (2) 참일 때 값: (3)거짓일 때 값
			이렇게 3부분으로 나눠기 때문입니다.
			복잡한 if-else 문을 아주 짧은 한줄로 줄여주는 마법 같은 연산자입니다.
		2. 핵심 
			1) mini-if, 한 줄 조건문, 물음표와 콜론
			2) 질문(?)하고, 참(true) : 거짓(false)으로 답한다!!
			3) 질문 ? 네 맞아요 : 아니오 몰라요
				?(물음표) : 그래서 이 질문니 true인가요?
				: (콜론) : 아니라면(false), 이쪽 길로 가세요..
		 * */
		int score = 85;
		// score가 60이상인가요?
		// (질문) ? (참이면 "합격") : (거짓이면 "불합격")
		String result = (score>=60)? "합격" : "불합격";
		System.out.println("결과:"+result);
		// ex) age를 임의로 할당(25)  18이상이면 성년 그외는 미성년이 result2에 할당하게 처리하세요.
		int age = 15;
		String result2 = (age>=25)?"성년":"미성년";
		System.out.println(age+", "+result2);

	}

}
