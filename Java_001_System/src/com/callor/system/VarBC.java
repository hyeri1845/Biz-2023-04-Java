package com.callor.system;

public class VarBC {

	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		
		
		intNum1 = 30;
		intNum2 =40;
		/*
		 * 두변수에 저장된 값의 크기를 비교하는 연산
		 */
		
		
		System.out.println(intNum1 > intNum2);//flase
		System.out.println(intNum1 < intNum2);//true
		System.out.println(intNum1 == intNum2);//flase
		//두 변수의 저장된 값위 트기를 비교하는 연산
		System.out.println(intNum1 <= intNum2);// flase
		System.out.println(intNum1 <= intNum2);// true
		System.out.println(intNum1 != intNum2);// true
		
		//각 변수에 저장된 값이 모두 짝수인가?
		System.out.println(intNum1 % 2 == 0 || intNum2 % 2 == 0);
		
		
		
		//부울대수 연산을 통하여 결과를 만든 코드
		int intYes1 = intNum1 % 2;
		int intYes2 = intNum2 % 2;  
		System.out.println(intYes * intYes2 > 0);
		System.out.println(intYes + intYes2 > 0);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
