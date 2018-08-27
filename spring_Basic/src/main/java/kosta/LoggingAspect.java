package kosta;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {
	
	private Log log= LogFactory.getLog(getClass());
	
	//공통 관심 메소드
	//언제 => advice : around(이전,이후)
	
	public Object logging(ProceedingJoinPoint joinPoint)throws Throwable{
		log.info("로그시작");
		StopWatch stopWatch = new StopWatch();
		
		try {
			
			stopWatch.start();		
			Object obj = joinPoint.proceed(); //핵심관심로직 호출(insert()호출)
			
			return obj;
		} catch (Exception e) {
			throw e;
		}finally {
			stopWatch.stop();
			log.info("로그종료");
			log.info(joinPoint.getSignature().getName()+"매서드 실행시"
					+ stopWatch.getTotalTimeMillis());
		}
	}

}
