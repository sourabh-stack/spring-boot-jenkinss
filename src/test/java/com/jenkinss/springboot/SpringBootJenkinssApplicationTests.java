package com.jenkinss.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinssApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(SpringBootJenkinssApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Appluication Tested....");
		assertEquals(true, true);
		
	}

}
