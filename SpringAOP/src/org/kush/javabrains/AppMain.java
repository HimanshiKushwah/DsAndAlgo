package org.kush.javabrains;

import org.kush.javabrains.model.Employee;
import org.kush.javabrains.service.EmployeeService;
import org.kush.javabrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		//		ShapeService shapeService=context.getBean("shapeService",ShapeService.class);
		//		shapeService.getCircle().setName("Dummy name");
		//		System.out.println(shapeService.getCircle().getName());
		//		
		//		Employee e = context.getBean("employee",Employee.class);
		//		System.out.println(e.getName());

		EmployeeService es = context.getBean("employeeService",EmployeeService.class);
		System.out.println(es.getEmployee().getName());
		es.getEmployee().setName("Himanshi");
//		System.out.println(es.getEmployee().getName());

	}

}
