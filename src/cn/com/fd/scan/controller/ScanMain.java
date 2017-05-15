/**
 * 
 */
package cn.com.fd.scan.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.fd.other.TestController;
import cn.com.fd.scan.dao.UserDao;
import cn.com.fd.scan.service.UserService;

/**
 * <p> Description: </p>
 * @author fengda
 * @date 2017年1月12日 上午11:10:47
 */
public class ScanMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String [] {"applicationContext.xml"});
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		
		
//		UserDao userDao = (UserDao) ctx.getBean("userDao");
//		System.out.println(userDao);
		
//		TestController testController = (TestController) ctx.getBean("testController");
//		System.out.println(testController);
	}
}
