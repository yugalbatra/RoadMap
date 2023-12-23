package Assignment;

import java.util.Map;

/**
 * Interface for providing configuration data.
 */
public interface ConfigurationSource {

    /**
     * Retrieves the configuration data as a mapping of property keys to their corresponding values.
     *
     * @return A {@code Map<String, String>} representing the configuration data.
     */
    Map<String, String> getConfiguration();
}

