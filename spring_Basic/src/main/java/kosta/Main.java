package kosta;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {

	public static void main(String[] args) {
		/*Resource resouce = new ClassPathResource("applicationContext.xml");

		BeanFactory factory = new GenericXmlApplicationContext(resouce);*/ //명시적 방법 생성자 property 를 사용할때
		/*ApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml"); //inject autowired 4개의 어노테이션을 사용할때
		*/
	/*	ApplicationContext factory = new AnnotationConfigApplicationContext(Factory.class);*/ //자바 클래스로 xml대신 사용할때
		
		// spring container 안에 dao , service 객체가 안에 있다.
		
		String[] config = {
			"applicationContext.xml",
			"commonConcern.xml"
		};
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext(config);
		Service service = (Service) factory.getBean("Service"); //object로 넘어와 형변환 해줘야 한다.
		service.insert();
	}

}
