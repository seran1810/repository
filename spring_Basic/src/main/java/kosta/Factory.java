package kosta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //컨테이너 xml 설정 역할을 하는 java 클래스 
public class Factory {
	
	@Bean  //객체 생성
	public Dao oracleDao() {
		return new OracleDao(); // return 형이 객체생성
	}
	
	@Bean Service Service() {  //메소드명은 xml에 id명 역할을 한다.
		return new WriteService();
	}

}
