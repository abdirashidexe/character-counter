import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest 
{
    @Test // annotation in java. basically telling other parts of the program (JUnit) that its a test
    public void testLAppearsThreeTimesInHelloWorld() // the more descriptive we make it, the more info we have if it passes or fails. we usually write it once and go so its good to do.    
    {
        // Arrange  - all the stuff you need before starting your test
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");
 
        // Act      - actually making something happen; calling a method
        int actualCount = counter.getFrequency('l'); // single quotes instead of double quotes because its passing a char, not double quotes for strings (in Java) 
                                                       // hoping it returns 3, but we dont actually know yet.

        // Assert   - did what i actually got match what i was expecting? "my assertion is: the acutal should equal 3."
        assertEquals(3, actualCount); // my expected (3) should equal my actualCount (whatever we got)
    }

    @Test
    public void testNonOccurringCharacterPercentageIsZero()
    {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");
        // Act
        double actualPercentage = counter.getRelativePercentage('z');
        // Assert
        assertEquals(0.0, actualPercentage, 0.0001); // so long as it has to be accruate to those 2 decimal places, it's okay.
    }
}