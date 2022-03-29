import java.util.*;

public class RandomCharacter{
    Random random = new Random();   //Create random object

    //generate random lowercase from a - z
    public char randLowerCase(){
        return (char)('a' + random.nextInt(26));
    }

    //generate random uppercase from A - Z
    public char randUpperCase(){
        return (char)('A' + random.nextInt(26));
    }

    //generate random digit from 0 - 9
    public char randDigit(){
        return (char)(random.nextInt(0,10) + '0');
    }

    public char randCharacter(){
        int choice = random.nextInt(0,3); // get a random number between 0 and 2
        switch (choice) {
            case 0:                                 //if number is 0, return lower case letter
                return randLowerCase();
            case 1:                                 //if number is 1, return upper case letter
                return randUpperCase();
            case 2:                                 //if number is 2, return random digit
                return randDigit();
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

    public boolean isPrime(char number){
        
        boolean isPrime = true;
        int intNum = Character.getNumericValue(number);
        for (int i = 2; i <= intNum / 2; i++){
            // condition for non-prime number
            if (intNum  % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
    

    public static void main(String[] args){
        RandomCharacter randomChar = new RandomCharacter();

        for(int i=0; i<15; i++){
            System.out.println("Random Lower Case Letter: " + randomChar.randLowerCase());
        }

        System.out.println("\n");

        for(int i=0; i<15; i++){
            System.out.println("Random Upper Case Letter: " + randomChar.randUpperCase());
        }

        System.out.println("\n");

        for(int i=0; i<15; i++){
            System.out.println("Random Digit Character: " + randomChar.randDigit());
        }

        System.out.println("\n");

        for(int i=0; i<15; i++){
            System.out.println("Random Character: " + randomChar.randCharacter());
        }

        System.out.println("\n");

        for(int i=0; i<15; i++){
            char z = randomChar.randDigit();
            System.out.println("Is " + z + " a " + "prime Number: " + randomChar.isPrime(z));
        }
    }
}
