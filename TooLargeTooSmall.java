
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @Mike Ninh
 * @02/24/2021
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
    // Correct guess returns 0, Low guesses return -1, High guesses return 1
    
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