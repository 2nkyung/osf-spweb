package com.osf.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exam {

	private final static Logger logger = LoggerFactory.getLogger(Exam.class);
	public String str = "11";
	
	/*
	 * Log4j level 순서
	 * 1. TRACE 상세한 정보
	 * 2. DEBUG 개발할 때 필요한거
	 * 3. INFO 정보(인포메이션) 어떤 프로젝트가 톰캣에서 돌아가고있다 정도
	 * 4. WARN 워닝(동작은 하지만 위험하다)
	 * 5. ERROR 실제 에러 ( 500에러, 서버 이터널 에러 등등)
	 * 6. FATAL 치명적인 에러(서버가 중단되는 것 등등)
	 */
	public static void main(String[] args) {
		String str = null;

		if(str.equals("홍길동")) {
			log.info("이름은 홍길동이 맞습니다.");
		}else {
			log.debug("나도 나올려나?");
			log.info("이름은 홍길동이 아닙니다.");
		}
		log.warn("프로그램 비정상 종료, 그치만 문제 없음.");

	}

}
