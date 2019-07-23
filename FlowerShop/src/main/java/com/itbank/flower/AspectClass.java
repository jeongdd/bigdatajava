package com.itbank.flower;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AspectClass {
	public void welcome() {
		System.out.println("환영합니다!!");
	}
	
	public void errorCall() {
		System.out.println("알 수 없는 에러 입니다.");
	}
	
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch watch = new StopWatch();
		System.out.println("aroundCall - Before >>>>>>");
		watch.start();
		pjp.proceed();
		watch.stop();
		System.out.println("aroundCall - After >>>>>>");
		String method = pjp.getSignature().getName();
		System.out.println(method + "()메소드 수행시간" + watch.getTotalTimeMillis() + "초");
	}
}
