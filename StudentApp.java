package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Student s=(Student) ctx.getBean("std");
		s.setRegno(123);
		s.setStdname("deloitte");
		System.out.println(s.getRegno()+" "+s.getStdname());

	}

}
