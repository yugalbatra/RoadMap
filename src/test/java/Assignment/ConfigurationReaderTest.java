package Assignment;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

/**
 * Unit tests for the ConfigurationReader class.
 */
public class ConfigurationReaderTest {

    private ConfigurationReader configurationReader;

    /**
     * Sets up the test environment by creating a ConfigurationReader instance with a MockConfigurationSource.
     */
    @Before
    public void setUp() {
        ConfigurationSource configurationSource = new MockConfigurationSource();
        configurationReader = new SystemConfigurationReader(configurationSource);
    }

    /**
     * Tests the getString method when the value is set, and it should return the correct value.
     */
    @Test
    public void testGetStringWithExistingEnv() {
        final var result = configurationReader.getString("KEY");
        assertEquals("VALUE", result);
    }

    /**
     * Tests the getString method when the value is not set, and it should throw an NameNotFoundException.
     */
    @Test
    public void testGetStringWithNonExistingEnv() {
        final var value = configurationReader.getString("NON_EXISTING_ENV");
        assertNull(value);
    }

    /**
     * Tests the getString method when the key sent is null, and it should throw an IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetStringWithNull() {
        configurationReader.getString(null);
    }

    /**
     * Tests the getBigDecimal method when the value is set, and it should return the correct value.
     */
    @Test
    public void testGetBigDecimalWithExistingEnv() {
        final var result = configurationReader.getBigDecimal("BigDecimal");
        assertEquals(new BigDecimal("100.01"), result);
    }

    /**
     * Tests the getString method when the value is not set, and it should throw an IllegalArgumentException.
     */
    @Test(expected = NullPointerException.class)
    public void testGetBigDecimalWithNonExistingEnv() {
        final var value = configurationReader.getBigDecimal("NON_EXISTING_ENV");
    }

    /**
     * Tests the getBoolean method when the value is set, and it should return true.
     */
    @Test
    public void testGetBooleanWithExistingEnv() {
        boolean result = configurationReader.getBoolean("Bool");
        assertTrue(result);
    }

    /**
     * Tests the getBoolean method when the value is not set, and it should return false.
     */
    @Test
    public void testGetBooleanWithNonExistingEnv() {
        boolean result = configurationReader.getBoolean("Key");
        assertFalse(result);
    }
}

/**
 * MockConfigurationSource for testing purposes.
 */
class MockConfigurationSource implements ConfigurationSource {
    @Override
    public Map<String, String> getConfiguration() {
        // Provide a mock configuration with a predefined key-value pair
        Map<String, String> configuration = new HashMap<>();
        configuration.put("KEY", "VALUE");
        configuration.put("BigDecimal", "100.01");
        configuration.put("Bool", "true");
        return configuration;
    }
}
