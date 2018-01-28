package br.edu.ifpb.web.jsf;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/01/2018, 10:23:14
 */
public class ServiceLocator {
 public <T> T lookup(String name) {
        try {
            Properties properties = new Properties();
            properties.put(InitialContext.INITIAL_CONTEXT_FACTORY,
                    "com.sun.enterprise.naming.SerialInitContextFactory");
            properties.setProperty("org.omg.CORBA.ORBInitialHost", "host-core");
            properties.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context context = new InitialContext(properties);
            return (T) context.lookup(name);
        } catch (NamingException ex) {
            Logger.getLogger(ServiceLocator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
