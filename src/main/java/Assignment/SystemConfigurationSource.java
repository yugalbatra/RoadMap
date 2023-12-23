package Assignment;

import java.util.Map;

/**
 * Implementation of the ConfigurationSource interface that retrieves configuration data
 * from the system environment variables using System.getenv().
 */
public class SystemConfigurationSource implements Assignment.ConfigurationSource {

    /**
     * Retrieves the configuration data from the system environment variables.
     *
     * @return A {@code Map<String, String>} representing the configuration data from the system environment.
     */
    @Override
    public Map<String, String> getConfiguration() {
        return System.getenv();
    }
}
