package selPract;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4j {
	private static Logger log=LogManager.getLogger(Log4j.class.getName());
public static void main(String[] args) {
	
	log.debug("it is debug");
	log.info("it is info");
	log.error("it is error");
	log.fatal("fatal");
}
}
