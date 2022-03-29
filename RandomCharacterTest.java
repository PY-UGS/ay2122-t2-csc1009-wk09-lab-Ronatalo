import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class RandomCharacterTest {
    RandomCharacter randomChar;
    @BeforeEach
    @Test
    void setup(){
        randomChar = new RandomCharacter();
        assertTrue(randomChar instanceof RandomCharacter);
    }

    @Test
    //Check for lowercase
    void randLowerCaseTest(){

        assertTrue(Character.isLowerCase(randomChar.randLowerCase()));   
        assertFalse(Character.isUpperCase(randomChar.randLowerCase()));  
    }

    @Test
    //Check for upppercase
    void randUpperCaseTest(){

        assertFalse(Character.isLowerCase(randomChar.randUpperCase()));
        assertTrue(Character.isUpperCase(randomChar.randUpperCase()));
    }

    @Test
    //Check for digit character
    void randDigitTest(){

        assertFalse(Character.isLowerCase(randomChar.randDigit()));
        assertFalse(Character.isUpperCase(randomChar.randDigit()));
        assertTrue(Character.isDigit(randomChar.randDigit()));
        assertFalse(Character.isLetter(randomChar.randDigit()));
    }

    @Test
    //Check for random character
    void randCharacterTest(){

        assertTrue(Character.isLowerCase(randomChar.randCharacter()));
        assertTrue(Character.isUpperCase(randomChar.randCharacter()));
        assertTrue(Character.isDigit(randomChar.randCharacter()));
        assertTrue(Character.isLetter(randomChar.randCharacter()));
    }

    @Test
    //Check for prime number
    void randPrimeTest(){
        int number = randomChar.randDigit();

        boolean RedFlag = false;
    
        for (int i = 2; i <= number / 2; ++i) {
            // condition for non-prime number
            if (number % i == 0) {
                RedFlag = true;
                break;
            }
        }
        assertTrue(!RedFlag);
    }
}