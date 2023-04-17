package com.callor.system;

public class ControlF{

	public static void main(String[] args) {
		int intRnd = (int) (math.random()* 10)+1;
		
		if (intRnd % 3 ==0);
		int intResult = intRnd *3;
		System.out.println(intResult);
		}else {
		System.err.println(intRnd +" 는 (은)3의 배수  아님");
		}
		/*
		 * intResult 변수는 if() {}의 scope를 갖는다
		 * =if () {} bolck 내부에서만 생명을 유지한다
		 * 즉 if () {} 을 벗어나면 intResult 변수는
		 * 참조 (읽기, 쓰기 할당을 할 수 없다)
		 * 
		 */
		System.out.println(intResult);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
