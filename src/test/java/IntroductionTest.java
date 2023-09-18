import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntroductionTest {

    @Test
    void calcGaaPoints() {
        assertEquals(20, Introduction.calcGaaPoints(2, 14));
        assertEquals(27, Introduction.calcGaaPoints(0, 27));
    }


    @Test
    void sum() {
        assertEquals(15, Introduction.sum(new int[] {1, 2, 3, 4, 5}));
        assertEquals(5, Introduction.sum(new int[] {1, 2, 3, 4, -5}), "Should handle arrays with negative integers");
        assertEquals(-90, Introduction.sum(new int[] {1, 2, 3, 4, -5, 5, -100}), "Should handle arrays with negative integers");
        assertEquals(0, Introduction.sum(new int[] {}), "Should return zero for empty array");
    }

    @Test
    void startsWithConsonant() {
        assertTrue(Introduction.startsWithConsonant("vehicle"), "Should return true for vehicle");
        assertTrue(Introduction.startsWithConsonant("Vacation"), "Should return true for Vacation");
        assertFalse(Introduction.startsWithConsonant("ambulance"), "Should return false for ambulance");
        assertFalse(Introduction.startsWithConsonant("Artery"), "Should return false for Artery");
        assertFalse(Introduction.startsWithConsonant(""), "Should return false for empty string");
        assertFalse(Introduction.startsWithConsonant("#foo"), "Should return false for non-alphabetic character");
    }
}