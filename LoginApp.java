package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotations/SpringAnnotation.xml");
		Login login=ctx.getBean("login",Login.class);
		System.out.println(login.getUsername()+" "+login.getPassword());

	}

}
