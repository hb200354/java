package webexp.a02_variable;

public class A07_Calculator {

	public static void main(String[] args) {
		/*
		# 연산자 3총사
		1. 여러분이 케임 캐릭터를 키우거나, 용돈 기입장을 쓴다고 상상해 보세요.
			오늘 배울 연산들은 이 모든 일을 가능하게 하는 마법 도구들입니다!!
		2. 대입연산자 ( = ) : 물건 담는 집게손
			대입 연산자는 물건을 상자에 넣는 역할을 합니다.
			컴퓨터 용어로는 값을 변수에 할당(Assign)한다고 말하죠.
			
			'=' : 기호를 보세요. 왠지 왼쪽으로 물건을 넘겨주는 화살표(<-)
			1) 할당(Assignment), 저장
				무조건 값을 왼쪽의 상자(변수)에 넣어라!!
				a = 10 는  a와 10은 같다가 절대 아니고,
				10이라는 값을 a라는 상자에 넣어라라는 명령입니다.
		*/
		// 10000이라는 값을 money라는 int 상자에 넣어라
		int money = 10000;
		System.out.println("내 용돈은 :"+money+"원"); // "문자열" + 변수명 + "문자열"
		// 문자 할당하기(이름표 붙이기)
		// "홍길동"이라는 글자 값을 name이라는 String 상자에 넣어라.
		String name = "홍길동";
		System.out.println("내 이름은 "+name+"입니다..");
		// ex) 이름, 나이, 사는 곳 변수를 선언해서, 데이터를 할당한 후,
		//     이름은 @@@입니다.
		//     나이는 @@@살 입니다.
		//     사는곳은 @@@에 위치합니다.
		String name1 = "마길동";
		int age = 25; String loc="수원"; // 명령어를 한라인에서 선언이 가능..
		System.out.println("이름은 "+name1+"입니다.");
		System.out.println("나이는 "+age+"살 입니다.");
		System.out.println("사는 곳은  "+loc+"에 위치합니다.");
		/*
		3. 증감 연산자(++, --) 딱 1만 바꾸는 버튼
			1) 이 연산자들은 변수(상자)에 들어있는 숫자를 정확히 1만 증가(++)시키거나, 감소(--)시킬 때 쓰이는
			특수 버튼입니다. 코드를 아주 깔끔하게 만들어 주죠.
				level++ (레벨 1 증가)
				arrows-- (화살 1개 감소)
			2) 증가, 감속, 전위(pre), 후위(post)
			3) 변수 앞에 붙으면 전위(선불), 뒤에 붙으면 후위(후불)라고 부릅니다.
				++a (전위/선불) : 먼저 1 올리고(선불), 그 다음에 값을 써!!
				- a의 값이 1올린다.
				- 1일 올라간 최신 a값을 사용
				a++ (후위/후불) : 일단 지금 값 먼저 쓰고(후불), 나중에 1 올릴께
				- a의 현재값을 먼저 사용
				- (모든 일이 끝나고) a의 값을 1 올린다..
		 * */
		// 후위(후불) 사용하기(가장 많이 쓰는 내용)
		int likes = 10; // 좋아요 10개
		likes++;  // 좋아요 버튼 누름(다음 줄부터 11개가 됨)
		System.out.println("현재 좋아요:"+likes);
		// ex) count 변수로 5를 선언하고, 증가 후, 현재 count를 확인하세요..
		int count = 5;
		count++;
		System.out.println("현재 카운트1:"+count);
		
		System.out.println("현재 카운트2:"+(++count));// 증가하고 출력(선불)
		System.out.println("현재 카운트3:"+(count++));// 출력하고 증가(후불)
		System.out.println("현재 카운트4:"+count);
		
		// 전위(선불)과 후위(후불) 비교
		int a = 5;
		int b = 5;
		// 1. 전위(선불) : 먼저 1을 올려서 6을 만들고, 그 값을 resultA에 줌
		int resultA = ++a;
		// 2. 후위(후불) : 일단 현재값 5를 resultB에 먼저 주고, b는 나중에 6이 됨
		int resultB = b++;
		System.out.println("resultA:"+resultA);
		System.out.println("resultB:"+resultB);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		// ex) 편의점에서 사과의 갯수(apples)를 5개, 바나나의 갯수(bananas)를 5개 초기에 설정하고,
		//     둘다 1씩 증가하는데, 사과의 장부재고는 증가전에 할당(reportA), 바나나의 장부재고는
		//     증가 후에 할당(reportB)라고 설정해서 현재 총 장부 재고량을 적고,
		//     현재 바나나의 갯수와 사과의 갯수를 출력하세요..
		int apples = 5; int bananas = 5;
		int reportA = apples++;
		int reportB = ++bananas;
		int totReport = reportA+reportB;
		System.out.println("총 장부 재고량:"+totReport);
		System.out.println("현재 사과의 갯수:"+apples);
		System.out.println("현재 바나나의 갯수:"+bananas);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
