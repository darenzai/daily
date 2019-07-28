package com.atguigu.crud.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.DepartmentExample;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.DepartmentMapper;
import com.atguigu.crud.dao.EmployeeMapper;

/*
 * 
 * ����dao��
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper EmployeeMapper;
	@Autowired
	SqlSession  sqlSession;
	@Test
	public void testCRUD(){
		//ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");
		//DepartmentMapper bean=ioc.getBean(DepartmentMapper.class);
		//1���벿��
		//departmentMapper.insertSelective(new Department(null,"��������"));
		//departmentMapper.insertSelective(new Department(null,"���Բ���"));
		System.out.println(departmentMapper);
		//2����Ա��
		//EmployeeMapper.insertSelective(new Employee(null,"jerry","M","jerry@com",1));
		//3��������SQLSession
		System.out.println("success");
		EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
		System.out.println("success");
		for (int i = 0; i < 1000; i++) {
			String uid=UUID.randomUUID().toString().substring(0,5)+i;
			
		}
		System.out.println("success");
	}
}
