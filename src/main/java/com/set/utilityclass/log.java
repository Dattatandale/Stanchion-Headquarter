/**
 * 
 */
package com.set.utilityclass;

/**
 * @author datta.tandale
 *
 */
public class log {
	// initialize logger class first
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(log.class.getName());

	public static void starttestcase(String TestCaseName) {
		log.info("---------------" + TestCaseName + "TEST STARTED---------------");
	}

	public static void endtestcase(String TestCaseName) {
		log.info("---------------" + TestCaseName + "TEST END---------------");
	}

	public static void info(String message) {
		log.info(message);
	}

	public static void warn(String message) {
		log.warn(message);
	}

	public static void error(String message) {
		log.error(message);
	}

	public static void debug(String message) {
		log.debug(message);
	}

}
