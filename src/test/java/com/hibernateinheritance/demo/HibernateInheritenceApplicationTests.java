package com.hibernateinheritance.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hibernateinheritance.demo.entity.Check;
import com.hibernateinheritance.demo.entity.CreditCard;
import com.hibernateinheritance.demo.repository.PaymentRepo;

@SpringBootTest
class HibernateInheritenceApplicationTests {

	@Autowired
	PaymentRepo repos;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createPayment() {
		CreditCard c = new CreditCard();
		c.setAmount(1000d);
		c.setCardnumber("100100100100100");
		c.setId(123);
		repos.save(c);
	}
	
	@Test
	public void createCheckPayment() {
		Check c1 = new Check();
		c1.setId(124);
		c1.setAmount(2000d);
		c1.setChecknumber("20070080090");
		
		repos.save(c1);
	}

}
