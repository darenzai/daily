package springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/springmvc")
@Controller
public class HelloWorld {
	/*
	 * 
	 * 
	 * ʹ��requesetmapping��ӳ��Ո���URl
	 * ����ֵ��ͨ�^ԇ�D�����������錍�H������ҕ�D��InternalResourceViewResolver ҕ�D������
	 * ͨ�^prefix+returnVal +��Y ��ʽ�õ����H������ҕ�D��Ȼ��ͨ�^�D�_����
	 * "/WEB-INF/views/sucess.jsp
	 */
	public static final  String SUCCESS="success";
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testmethod() {
		System.out.println("test");
		return "success";
	}
	
	
	@RequestMapping("/helloworld")
	public  String hello(){
		System.out.println("hello world");
		
		return SUCCESS;
		
	}
}
