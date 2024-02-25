import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Class containing tests for the RewardValue class
public class RewardValueTests {

    // Test to ensure that creating a RewardValue with a cash value correctly sets the cash value
    @Test
    void create_with_cash_value() {
        // Setup: Define a cash value to initialize the RewardValue object
        double cashValue = 100;

        // Execution: Create a new RewardValue object with the cash value
        var rewardValue = new RewardValue(cashValue);

        // Assertion: Verify that the cash value in the object matches the expected cash value
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    // Test to ensure that creating a RewardValue with a miles value correctly sets the miles value
    @Test
    void create_with_miles_value() {
        // Setup: Define a miles value to initialize the RewardValue object
        int milesValue = 10000;

        // Execution: Create a new RewardValue object with the miles value
        var rewardValue = new RewardValue(milesValue);

        // Assertion: Verify that the miles value in the object matches the expected miles value
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    // Test to verify the conversion from cash to miles is accurate
    @Test
    void convert_from_cash_to_miles() {
        // Setup: Initialize a RewardValue object with a specific cash value
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);

        // Expected outcome: Calculate the expected miles value based on the conversion rate
        double expectedMilesValue = cashValue / 0.0035;

        // Assertion: Check that the calculated miles value matches the expected value, with a small tolerance for rounding errors
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.01, "Cash to miles conversion did not match expected value.");
    }

    // Test to verify the conversion from miles to cash is accurate
    @Test
    void convert_from_miles_to_cash() {
        // Setup: Initialize a RewardValue object with a specific miles value
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);

        // Expected outcome: Calculate the expected cash value based on the conversion rate
        double expectedCashValue = milesValue * 0.0035;

        // Assertion: Check that the calculated cash value matches the expected value, with a small tolerance for rounding errors
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.01, "Miles to cash conversion did not match expected value.");
    }
}

