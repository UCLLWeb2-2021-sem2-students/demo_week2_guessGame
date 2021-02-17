package domain.model;
import java.util.Random;
public class GuessGame {
    private int number = thinkNumber();
    public String guess(int guessedNumber){
        String message = null;
        if(guessedNumber == number) {
            message = "Well done! That was correct!";
            number = thinkNumber();
        } else if (guessedNumber > number) {
            message = "Lower...";
        } else {
            message = "Higher...";
        }
        return message ;
    }
    private int thinkNumber() {
        return new Random().nextInt(10) + 1;
    }
}