package com.itbank.mvc10;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectClass {
	
	public void login() {
		System.out.println("A : 로그인===========");
	}
	
	public void login2() {
		System.out.println("C : 보안 강화된 로그인===========");
	}
	
	public void login3() {
		System.out.println("B : 로그인!!!!!!!!!!!!!!!!");
	}
	
	public void logout() {
		System.out.println("로그아웃~~~~~~~~~~");
	}
	
	public void returnCall(JoinPoint jp, Object returnObj) {
		System.out.println("리턴값이  있습니다.");
		System.out.println((String)returnObj);
		Object[] args = jp.getArgs(); 
		System.out.println("물건명 :" + args[0]);
		System.out.println("가격 :" + args[1]);
	}
	
	public void errorCall() {
		System.out.println("에러발생 에러발생!!!!!!!!!!!!!!!!!");
	}
	
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundBefore==============");
		pjp.proceed();
		System.out.println("aroundAfter==============");
	}
	

}
