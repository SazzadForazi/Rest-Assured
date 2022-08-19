import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.IOException;

public class Utils {
    public static String setEnvVariable(String value) throws IOException, ConfigurationException, ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration("./src/test/resources/config.properties");
        config.setProperty("token", value);
        config.save();
        return value;

    }

}
