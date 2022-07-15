package com.POD3.CustomerServiceTest.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.POD3.customerservice.model.AuthenticationResponse;


class AuthenticationresponcetTest {

	AuthenticationResponse accInp = new AuthenticationResponse();
	AuthenticationResponse accInp2 = new AuthenticationResponse("11", "bar", true);

	@Test
	void setAccountIdTest() {
		accInp.setUserid("1");
		assertEquals("1", accInp.getUserid());
	}

	@Test
	void setAmountTest() {
		accInp.setName("gayathri");
		assertEquals("gayathri", accInp.getName());
	}

	@Test
	void setIsvalid() {
		boolean isValid = true;
		accInp.setValid(isValid);
		assertEquals(true, accInp.isValid());
	}

	@Test
	void getAccIdTest() {
		accInp.setUserid("1");
		assertEquals("1", accInp.getUserid());
	}

	@Test
	void getAmountTest() {
		accInp.setName("gayathri");
		assertEquals("gayathri", accInp.getName());
	}

}
