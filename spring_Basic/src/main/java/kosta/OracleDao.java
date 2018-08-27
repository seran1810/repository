package kosta;

import org.springframework.stereotype.Repository;


//@Controller, @Service , @Repository, @ Component 어노테이션을 사용 한것만 생성해준다. 가독성 때문에 4개로 나눠짐
//dao 객체는 @Repository   Service는 @Service   Controller 는 @Controller
@Repository
public class OracleDao implements Dao {

	@Override
	public void insertBoard() {
		System.out.println("OracleDao insertBoard()호출");

	}

}
