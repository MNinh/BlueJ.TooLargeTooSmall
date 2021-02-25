
/**
 * Correct guesses returns 0, low guesses return -1, high guesses return 1
 *
 * @ Mike Ninh
 * @ 02/24/2021
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    
    public Integer guess(Integer g) {
        if (g < chosenNum){
            return -1;
        }
        else if (g > chosenNum){
            return 1;
        }
        else {
            return 0;
        }
               
    }
}