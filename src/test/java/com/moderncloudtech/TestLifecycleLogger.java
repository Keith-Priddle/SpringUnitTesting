package com.moderncloudtech;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import java.util.logging.Logger;

@TestInstance(value = Lifecycle.PER_CLASS)
public interface TestLifecycleLogger {

	
	
	static final Logger log =  Logger.getLogger(TestLifecycleLogger.class.getName());


	@BeforeAll
	static void beforeAllTests() {
		log.info("beforeAllTests");
	}
	
	@AfterAll
	static void afterAllTests() {
		log.info("afterAllTests");
	}
	
	
	@BeforeEach
	default void beforeEachTest(TestInfo testInfo) {
	//	log.info("About to execute {}", testInfo.getDisplayName());
	}
	
	
	
	@AfterEach
	default void afterEachTest(TestInfo testInfo) {
	//	log.info("Finished executing {}", testInfo.getDisplayName());
	}
	

}
