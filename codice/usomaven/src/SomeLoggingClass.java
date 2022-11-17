

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

class SomeLoggingClass{
	
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger();
		logger.error("CIAOOOOO");
		
		// change level
		Configurator.setRootLevel(Level.DEBUG);
		logger.debug("CIAOOOOO");

		
  }
}