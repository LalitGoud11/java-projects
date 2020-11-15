package com.WCF.Insurance.FutureRequestFeatures;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.RequestBody;

import com.WCF.Insurance.FutureRequestFeatures.Entity.FeatureRequest;
import com.WCF.Insurance.FutureRequestFeatures.Service.FutureRequestFeatureService;

@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class HomeControllerTest {
	
	/*
	 * 
	 * h2 db connection: reference .
	 * https://www.tutorialspoint.com/h2_database/h2_database_jdbc_connection.htm
	 * 
	*/
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired	
	FutureRequestFeatureService futureRequestService;
	
	@LocalServerPort
	private String serverPort;
	
	
	private final String JDBC_DRIVER  = "org.h2.Driver";
	
	@Value(value = "${spring.datasource.url}")
	String DB_URL;
	
	static final String USER = "sa"; 
	static final String PASS = ""; 
	
	Statement stmt = null; 
	
	@BeforeEach
	void createdb() throws ScriptException, SQLException  {
		ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(), new ClassPathResource("create/schema.sql"));
		ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(), new ClassPathResource("create/testQuery/data.sql"));
	}	
	
	@AfterEach
	void dropdb() throws ScriptException, SQLException {
		ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(), new ClassPathResource("drop/dropQuery.sql"));
	}
	
	@Test
	@DisplayName("get all request")
	void testGetAllRequest() throws ClassNotFoundException, SQLException {
		fetchOneResultFromScript();
		fail();
	}
	
	@Test
	@DisplayName("saveing request in the main db.")
	void saveRequest( ) throws ClassNotFoundException, SQLException {
		
		FeatureRequest addOneResultToDbMain = fetchOneResultFromScript();
		futureRequestService.save(addOneResultToDbMain);
		
		
		
		System.out.println("--------------");
	}
	
	
	FeatureRequest fetchOneResultFromScript() throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); 
		stmt = conn.createStatement();  
		String sql = "select * from FeatureRequest";
		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next()) {
			//System.out.println(rs.getInt("id") + rs.getString("title")+ rs.getString("description") + rs.getString("client") );
			return new FeatureRequest(rs.getInt("id"), rs.getString("title"), rs.getString("description"), rs.getString("client"), rs.getString("clientPriority"), rs.getString("targetDate"), rs.getString("productArea"));
		}
		return null;
	}
	

}


