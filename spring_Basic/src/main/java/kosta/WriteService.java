package kosta;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WriteService implements Service {
	@Inject
	
	private Dao dao;
	
	public WriteService() {}
	
	public WriteService(Dao dao) {
		this.dao = dao;
	}
	
	/*@Autowired // 자동 dataType
	@Qualifier("oracle") //dao중 이름을 명시해줘 어느것을 실행 할지 정해준다.
	public void setDao(Dao dao) {
		this.dao = dao;
	}*/

	@Override
	public void insert() {
		System.out.println("Writeservice insert()호출");
		dao.insertBoard();

	}

}
