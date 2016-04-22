package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringEducationApplicationTests {

	@Autowired
	private MyBeanSingleton myBean1;
	@Autowired
	private MyBeanSingleton myBean2;

	@Test
	public void contextLoads() {
		System.out.println(myBean1);
		System.out.println(myBean2);
	}

}
