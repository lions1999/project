package test;

import org.junit.Test;
//
//import logic.model.*;
//import logic.controller.HomeController;
import logic.dao.*;
import logic.model.Role;

public class AllTests {

//	@Test
//	public void TestCondominiumDAO() throws Exception{
//		CondominiumDAO dao = new CondominiumDAO();
//		
//		System.out.println(dao.retreiveByCondominumList(12345));
//	}
//	
//	@Test
//	public void TestLoginDAO() throws Exception{
//		LoginDAO log = new LoginDAO();
//		
//		System.out.println(log.checkLogin("lucamoretti@gmail.com", "lucamoretti"));
//	}
//	
	@Test
	public void TestLoginDAO2() throws Exception{
		LoginDAO log = new LoginDAO();
		
		System.out.println(log.checkRole("lucamoretti@gmail.com"));
	}
//	
//
//	@Test
//	public void TestImagePostDAO()throws  Exception{
//		PostDAO post = new PostDAO();
//		
//		post.checkImagePost(1, 12345);
//	}
//	
//	@Test
//	public void TestImagePostController()throws  Exception{
//		PostDAO post = new PostDAO();
//		
//		post.checkImagePost(1, 12345);
//	}
	

}
