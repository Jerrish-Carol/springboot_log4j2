package springboot.log4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class Springbootlog4j2Application {
	
	private static final Logger LOGGER = LogManager.getLogger(Springbootlog4j2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Springbootlog4j2Application.class, args);

       LOGGER.info("This is an INFO level log message!");
       LOGGER.error("This is an ERROR level log message!");
       LOGGER.fatal("This is an FATAL level log message!");
       LOGGER.trace("This is an TRACE level log message!");
       LOGGER.debug("This is an DEBUG level log message!");
       
	}

}
