package nl.han.dea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator sut; // System-under-test

    @BeforeEach
    void setUp() {
        sut = new StringCalculator();
    }

    // Opdracht 1
    @Test
    void returnZeroIfEmptyString() {

        assertEquals(0, sut.addStringNumbers(""));
    }

    // Opdracht 2
    @Test
    void returnIntegerIfgivenNumberIsString() {

        assertEquals(5, sut.addStringNumbers("5"));
        assertEquals(9, sut.addStringNumbers("9"));
    }

    // Opdracht 3
    @Test
    void returnIntegerIfgivenNumberIsMultipleStrings() {

        assertEquals(30, sut.addStringNumbers("2,3,5,10,7,3"));
        assertEquals(99, sut.addStringNumbers("11,11,11,11,11,22,15,7"));
    }

    // Opdracht 4
    @Test
    void returnIntegerIfgivenNumberIsMultipleStringsWithSpace() {

        assertEquals(6, sut.addStringNumbers("1\n2,3"));
    }

    // Opdracht 5
    @Test
    void returnIntegerWithDifferentDelimiters() {
        assertEquals(3, sut.addStringNumbers("\n1;2")); // De //;\n is optioneel
    }

    // Opdracht 6
    @Test
    void doNotReturnIntegerIfgivenNumberIsBiggerThanThousand() {

        assertEquals(2, sut.addStringNumbers("2,1001"));
    }

    // Opdracht 7
    @Test
    void returnNumbersOfAnyLength() {
        assertEquals(6, sut.addStringNumbers("1***2***3"));
    }
}