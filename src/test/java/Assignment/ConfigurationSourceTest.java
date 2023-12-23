package Assignment;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the ConfigurationSource interface implementations.
 */
class ConfigurationSourceTest {

    /**
     * Tests the getConfiguration method of the SystemConfigurationSource.
     * Verifies that it retrieves non-empty configuration data from the system environment variables.
     */
    @Test
    void testGetConfiguration() {
        final ConfigurationSource systemConfigurationSource = new SystemConfigurationSource();
        final Map<String, String> configuration = systemConfigurationSource.getConfiguration();

        assertNotNull(configuration);
        assertFalse(configuration.isEmpty());

        // Print the environment variables for visual verification
        System.out.println("System Environment Variables:");
        for (Map.Entry<String, String> entry : configuration.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
