package letskodeit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/***
 * Section 26 Lecture 147
 * Using configuration file - File logging
 * 
 * @author juanl
 *
 */
public class LoggingFile {
	
	private static final Logger log = LogManager.getLogger(LoggingFile.class.getName());

	public static void main(String[] args) {
		log.trace("Trace Message Logged");
		log.debug("Debug Message Logged");
		log.info("Info Message Logged");
		log.error("Error Message Logged");
		log.fatal("Fatal Message Logged");
	}

}
