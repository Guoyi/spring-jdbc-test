package com.symbio.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.symbio.utils.TestDataSource;

public class JdbcTemplateTest {
	
	private JdbcTemplate jdbcTemplate;

	@Before
	public void setUp() throws Exception {
		jdbcTemplate = new JdbcTemplate(TestDataSource.getDataSource());
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() {
//		Assert.fail("This is a test fail!");
	}

}
