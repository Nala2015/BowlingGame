import static java.lang.Math.floor;
import static java.lang.Math.random;

public class ThrowBall {
    private int MAX = 10;
    private int MIN = 0;
    private int numberOfPins;
    private int newMax;

    public int throwFirstBall(){
        numberOfPins = (int) floor(random() * (MAX - MIN + 1) + MIN);
        if (numberOfPins != 10){
            newMax = 10 - numberOfPins;
        }
        return numberOfPins;


    }

    public int throwSecondBall(){

        numberOfPins = (int) floor(random() * (newMax - MIN + 1) + MIN);
        return numberOfPins;

    }

}
