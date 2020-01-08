package annotations;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotations/SpringAnnotation.xml");
		Customer c=ctx.getBean("cust",Customer.class);
		System.out.println(c.getCode()+" "+c.getName());

	}

}
