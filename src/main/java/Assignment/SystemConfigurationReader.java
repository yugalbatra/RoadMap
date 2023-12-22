package Assignment;

import javax.naming.NameNotFoundException;
import java.math.BigDecimal;

/**
 * Implementation of the ConfigurationReader interface that reads configuration values
 * from a specified ConfigurationSource, using the system environment variables.
 */
public class SystemConfigurationReader implements ConfigurationReader {

    private final ConfigurationSource configurationSource;

    /**
     * Constructs a SystemConfigurationReader with the provided ConfigurationSource.
     *
     * @param configurationSource The source from which configuration data is retrieved.
     */
    public SystemConfigurationReader(final ConfigurationSource configurationSource) {
        this.configurationSource = configurationSource;
    }

    /**
     * Retrieves a BigDecimal configuration value from the runtime environment.
     * The configuration value is identified by the specified name.
     *
     * @param name the name of the configuration value to retrieve
     *
     * @return the BigDecimal value associated with the specified name
     *
     * @throws IllegalArgumentException if the configuration value is not set or cannot be parsed as a BigDecimal
     */
    @Override
    public BigDecimal getBigDecimal(final String name) {
        final var value = getString(name);
        return new BigDecimal(value);
    }

    /**
     * Gets a boolean indicating whether the configuration property with the specified name is present.
     *
     * @param name The name of the configuration property.
     *
     * @return {@code true} if the configuration property is present, {@code false} otherwise.
     */
    @Override
    public boolean getBoolean(final String name) {
        final var value = getString(name);
        return Boolean.parseBoolean(value);
    }

    /**
     * Gets the configuration value associated with the specified name as a string.
     *
     * @param name The name of the configuration property.
     *
     * @return The value of the configuration property as a string.
     *
     * @throws IllegalArgumentException If the configuration value is not set.
     */
    @Override
    public String getString(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Configuration key is null.");
        }

        if (!configurationSource.getConfiguration().containsKey(name)) {
            System.out.println("Value not found in environment variable.");
            return null;
        }

        return configurationSource.getConfiguration().get(name);
    }
}
