package com.WCF.Insurance.FutureRequestFeatures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.WCF.Insurance.FutureRequestFeatures.Entity.FeatureRequest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class FutureRequestTest {

	@Autowired
	FeatureRequest fr;
	
//	void createH2Db() {
//		ScriptUtils.executeSqlScript(connection, resource);
//	}
	
	@Test
	void testPrint() {
		String actual = fr.print();
		
		assertEquals("string", actual);
	}

	@Test
	void testDummy() {
		fail();
	}
}
