package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/EmployeeCore.xml");
		Employee s=(Employee) ctx.getBean("emp");
		s.setEmpno(123);
		s.setEmpname("deloitte");
		s.setSalary(100000);
		System.out.println(s.getEmpno()+" "+s.getEmpname()+" "+s.getSalary());

	}

}
