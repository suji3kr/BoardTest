package com.company.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.oracleDriver");
		} catch (Exception e) {
			
		}
	}
	@Test
	public void testConnection() {
		
		try (Connection con =DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"kmr",
				"kmr")) {
			
			log.info(con);
			
			
		} catch (Exception e) {
			fail(e.getMessage());
			
			
		}
	}

}
