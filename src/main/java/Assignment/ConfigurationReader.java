package Assignment;

import java.math.BigDecimal;

/**
 * Interface for reading configuration values.
 */
public interface ConfigurationReader {
    /**
     * Gets the BigDecimal representation value from the runtime environment.
     * The configuration value is identified by the specified name.
     *
     * @param name the name of the configuration value to retrieve
     * @return the BigDecimal value associated with the specified name
     * @throws IllegalArgumentException if the configuration value is not set or cannot be parsed as a BigDecimal
     */
    BigDecimal getBigDecimal(String name);

    /**
     * Gets the boolean representation of whether the configuration property with the specified name is present.
     *
     * @param name The name of the configuration property.
     * @return {@code true} if the configuration property is present, {@code false} otherwise.
     */
    boolean getBoolean(String name);

    /**
     * Gets the configuration value associated with the specified name as a string.
     *
     * @param name The name of the configuration property.
     * @return The value of the configuration property as a string.
     */
    String getString(String name);

}
